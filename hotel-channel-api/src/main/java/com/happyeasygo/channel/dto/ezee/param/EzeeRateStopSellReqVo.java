package com.happyeasygo.channel.dto.ezee.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@Validated
public class EzeeRateStopSellReqVo {
    @NotNull
    @JsonProperty("Request_Type")
    private String requestType;

    @JsonProperty("Authentication")
    private AuthenticationBean authentication;

    @JsonProperty("RatePlan")
    private RatePlanBean ratePlanBean;

    @Data
    @Validated
    public static class RatePlanBean {
        @NotNull
        @JsonProperty("RoomTypeID")
        private String roomTypeID;

        @NotNull
        @JsonProperty("RateTypeID")
        private String rateTypeID;

        @NotNull
        @JsonProperty("FromDate")
        private String fromDate;

        @NotNull
        @JsonProperty("ToDate")
        private String toDate;

        @NotNull
        @JsonProperty("StopSell")
        private int stopSell;
    }
}