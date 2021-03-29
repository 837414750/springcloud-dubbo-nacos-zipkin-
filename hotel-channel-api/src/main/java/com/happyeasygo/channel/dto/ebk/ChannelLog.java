package com.happyeasygo.channel.dto.ebk;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@Document(collection = "channelLog")
public class ChannelLog {
    private String channel;
    private String hotelCode;
    private String function;
    private Object request;
    private Object response;
    @Indexed(name = "createDateIndex",expireAfterSeconds = 5184000) //60*24*3600=5184000
    private Date createDate;
}
