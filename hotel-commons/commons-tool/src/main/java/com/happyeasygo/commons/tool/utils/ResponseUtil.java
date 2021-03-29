package com.happyeasygo.commons.tool.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by king on 2018/9/11.
 * <p>
 * 响应工具类
 */
@Deprecated
public class ResponseUtil<T> {

    public static Object response200() {
        RequestContextUtil.getHttpServletResponse().setStatus(200);
        Map<String, Object> map = new HashMap<>();
        map.put("message", "success");
        return map;
    }

    public static Object response200(Object result) {
        RequestContextUtil.getHttpServletResponse().setStatus(200);
        return init(ErrorCode.SUCCESS,result);
    }

    public static Object response400(Object result) {
        RequestContextUtil.getHttpServletResponse().setStatus(400);
        return init(ErrorCode.FAILURE,result);
    }

    public static Object response404() {
        RequestContextUtil.getHttpServletResponse().setStatus(404);
        return null;
    }

    public static Object response401() {
        RequestContextUtil.getHttpServletResponse().setStatus(401);
        return null;
    }

    public static Object response401(Object result) {
        return init(ErrorCode.UNAUTHORIZED, result);
    }

    public static Object response404(Object result) {
        RequestContextUtil.getHttpServletResponse().setStatus(404);
        return init(ErrorCode.NOT_FOUND, result);
    }

    public static <T> Response<T> response422(T obj) {
        return response422(ErrorCode.PARAM_ERROR, obj);
    }

    public static <T> Response<T> response422(ErrorCode code, T obj) {
        RequestContextUtil.getHttpServletResponse().setStatus(422);
        return init(code, obj);
    }

    public static <T> Response<T> response500() {
        return response500(null);
    }

    public static <T> Response<T> response500(T obj) {
        return response500(ErrorCode.INNER_ERROR, obj);
    }

    public static <T> Response<T> response500(ErrorCode code, T obj) {
        RequestContextUtil.getHttpServletResponse().setStatus(500);
        return init(code, obj);
    }

    private static <T> Response<T> init(ErrorCode code, T obj) {
        Response<T> result = new Response();
        result.setMessage(code.message);
        result.setStatus(code.message);
        result.setData(obj);
        return result;
    }

    private static Response init(int code, String message, Object details) {
        Response result = new Response();
        result.setMessage(message);
        result.setStatus(message);
        result.setData(details);
        return result;
    }

    public enum ErrorCode {
        INNER_ERROR(999999, "system inner error"), PARAM_ERROR(100001, "input invalid"), NOT_FOUND(100002, "not found"), UNAUTHORIZED(401, "unauthorized"),
        SUCCESS(1,"success"),FAILURE(0,"failure");
        private int code;
        private String message;

        ErrorCode(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}
