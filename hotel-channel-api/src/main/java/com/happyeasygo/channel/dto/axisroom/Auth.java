package com.happyeasygo.channel.dto.axisroom;

import lombok.Data;

@Data
public class Auth<T> {
    private AuthKey auth;
    private T data;

    @Data
    public static class AuthKey{
        private String key;
    }
}
