package com.happyeasygo.commons.tool.utils;

import lombok.Data;

@Data
public class Response<T> {
    private String message;
    private T data;
    private String status;
}
