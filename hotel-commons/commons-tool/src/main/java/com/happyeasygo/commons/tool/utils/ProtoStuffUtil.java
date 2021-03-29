package com.happyeasygo.commons.tool.utils;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.springframework.objenesis.Objenesis;
import org.springframework.objenesis.ObjenesisStd;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@Component
public class ProtoStuffUtil {
    private static Objenesis objenesis = new ObjenesisStd(true);
    /**
     * 序列化对象
     *
     * @param obj
     * @return
     */
    public  <T> byte[] serialize(T obj) {
        if (obj == null) {
            throw new RuntimeException("Failed to serializer");
        }
        @SuppressWarnings("unchecked") Schema<T> schema = (Schema<T>) RuntimeSchema.getSchema(obj.getClass());
        LinkedBuffer buffer = LinkedBuffer.allocate(1024 * 1024);
        byte[] protoStuff;
        try {
            protoStuff = ProtostuffIOUtil.toByteArray(obj, schema, buffer);

            return compress(protoStuff);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serializer");
        } finally {
            buffer.clear();
        }
    }
 
    /**
     * 反序列化对象
     *
     * @param paramArrayOfByte
     * @param targetClass
     * @return
     */
    public  <T> T deserialize(byte[] paramArrayOfByte, Class<T> targetClass) throws Exception {
        if (paramArrayOfByte == null || paramArrayOfByte.length == 0) {
            throw new RuntimeException("Failed to deserialize");
        }
        byte[] decompress = decompress(paramArrayOfByte);
        Schema<T> schema =  RuntimeSchema.getSchema(targetClass);
        T instance = (T) objenesis.newInstance(targetClass);//实例化
        ProtostuffIOUtil.mergeFrom(decompress, instance, schema);
        return instance;
    }
 
    /**
     * 序列化列表
     *
     * @param objList
     * @return
     */
    public  <T> byte[] serializeList(List<T> objList) {
        if (objList == null || objList.isEmpty()) {
            throw new RuntimeException("Failed to serializer");
        }
        Schema<T> schema = (Schema<T>) RuntimeSchema.getSchema(objList.get(0).getClass());
        LinkedBuffer buffer = LinkedBuffer.allocate(1024 * 1024);
        try(ByteArrayOutputStream bos =  new ByteArrayOutputStream();){
            ProtostuffIOUtil.writeListTo(bos, objList, schema, buffer);
            return compress(bos.toByteArray());
        } catch (Exception e) {
            throw new RuntimeException("Failed to serializer");
        } finally {
            buffer.clear();
        }
    }
 
    /**
     * 反序列化列表
     *
     * @param paramArrayOfByte
     * @param targetClass
     * @return
     */
    public  <T> List<T> deserializeList(byte[] paramArrayOfByte, Class<T> targetClass) throws Exception {
        if (paramArrayOfByte == null || paramArrayOfByte.length == 0) {
            throw new RuntimeException("Failed to deserialize");
        }
        try (ByteArrayInputStream bais = new ByteArrayInputStream(decompress(paramArrayOfByte));){
            Schema<T> schema = RuntimeSchema.getSchema(targetClass);
            return ProtostuffIOUtil.parseListFrom(bais, schema);
        }
    }
    public byte[] compress(final byte[] data) {
        ByteArrayOutputStream baOs =null;
        GZIPOutputStream zipOs = null;
        try {
            baOs = new ByteArrayOutputStream();
            zipOs = new GZIPOutputStream(baOs, true);
            zipOs.write(data);
            zipOs.flush();
            zipOs.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(zipOs != null){
                try {
                    zipOs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(baOs != null){
                try {
                    baOs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return baOs.toByteArray();
    }

    public byte[] decompress(final byte[] compressed) throws Exception {

        try (ByteArrayOutputStream baOs = new ByteArrayOutputStream();
             ByteArrayInputStream baIs = new ByteArrayInputStream(compressed);
             GZIPInputStream zipIs = new GZIPInputStream(baIs);){

            byte[] temp = new byte[256];
            int n;
            while ((n = zipIs.read(temp)) != -1){
                baOs.write(temp, 0, n);
            }
            return baOs.toByteArray();
        }
    }
}