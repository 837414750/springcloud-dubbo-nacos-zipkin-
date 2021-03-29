package com.happyeasygo.channel.dto.ezee.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
public class EzeeInventoryReqVo {
    @JsonProperty("Request_Type")
    private String requestType;

    @JsonProperty("Authentication")
    private AuthenticationBean authentication;

    @JsonProperty("RoomType")
    private RoomTypeBean roomType;

    @Data
    @Validated
    public static class RoomTypeBean {
        @NotNull
        @JsonProperty("RoomTypeID")
        private String roomTypeID;

        @NotNull
        @JsonProperty("FromDate")
        private String fromDate;

        @NotNull
        @JsonProperty("ToDate")
        private String toDate;

        @NotNull
        @JsonProperty("Availability")
        private Integer availability;
    }
}
