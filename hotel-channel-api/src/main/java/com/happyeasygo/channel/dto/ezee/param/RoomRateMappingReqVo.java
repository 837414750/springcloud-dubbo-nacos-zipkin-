package com.happyeasygo.channel.dto.ezee.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class RoomRateMappingReqVo {

    @JsonProperty("Request_Type")
    private String requestType;

    @JsonProperty("Authentication")
    private AuthenticationBean authentication;
}