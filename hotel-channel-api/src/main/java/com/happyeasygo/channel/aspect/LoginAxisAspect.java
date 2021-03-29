package com.happyeasygo.channel.aspect;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.happyeasygo.channel.annotation.AxisLogin;
import com.happyeasygo.commons.tool.utils.MD5;
import com.happyeasygo.commons.tool.utils.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoginAxisAspect {

    @Value("${channel.authentication.axisRooms}")
    private String authAxis;

    //使用注解切点
    @Pointcut("@annotation(print)")
    public void annotationPointcut(AxisLogin print){}

    /**
     * 该切面主要是检测用户名是否准确(axisRoom)
     * @param pjp
     * @param print
     * @return
     * @throws Throwable
     */
    @Around("annotationPointcut(print)")
    public Object around(ProceedingJoinPoint pjp, AxisLogin print) throws Throwable {
        //获取请求的参数
        Object[] args = pjp.getArgs();
        //fastjson转换
        String params = JSONObject.toJSONString(args);

        JsonArray asJsonArray = JsonParser.parseString(params).getAsJsonArray();
        JsonObject paramObj = asJsonArray.get(0).getAsJsonObject();
        JsonElement authEle = paramObj.get("auth");

        boolean flag = false;
        if(authEle != null){
            String requestAuth = MD5.toMD5(authEle.toString());
            JsonObject obj = new JsonObject();
            obj.addProperty("key",authAxis);
            String auth = MD5.toMD5(obj.toString());

            if(requestAuth.equals(auth)){
                flag=true;
            }
        }
        if(flag){
            //执行方法
            return pjp.proceed();
        }else{
            return ResponseUtil.response401("Unauthorized. Incorrect API key.");
        }
    }
}