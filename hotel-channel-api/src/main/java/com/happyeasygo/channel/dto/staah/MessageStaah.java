package com.happyeasygo.channel.dto.staah;

import java.util.HashMap;
import java.util.Map;

public class MessageStaah {

    public static Object build(String status,String error_desc){
        Map<String,String> message = new HashMap<>();
        message.put("status",status);
        message.put("error_desc",error_desc);
        return message;
    }
}
