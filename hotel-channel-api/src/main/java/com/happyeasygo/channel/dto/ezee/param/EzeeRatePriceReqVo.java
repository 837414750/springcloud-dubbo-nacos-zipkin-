package com.happyeasygo.channel.dto.ezee.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class EzeeRatePriceReqVo {
    @JsonProperty("Request_Type")
    private String requestType;

    @JsonProperty("Authentication")
    private AuthenticationBean authentication;

    @JsonProperty("RateType")
    private RateTypeBean rateTypeBean;

    @Data
    @Validated
    public static class RateTypeBean {
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

        @JsonProperty("RoomRate")
        private RoomRateBean roomRate;

        @Data
        public static class RoomRateBean {
            @JsonProperty("Adult1")
            private BigDecimal adult1;
            @JsonProperty("Adult2")
            private BigDecimal adult2;
            @JsonProperty("Adult3")
            private BigDecimal adult3;
            @JsonProperty("Adult4")
            private BigDecimal adult4;
            @JsonProperty("Adult5")
            private BigDecimal adult5;
            @JsonProperty(value = "Adult6")
            private BigDecimal adult6;
            @JsonProperty("Adult7")
            private BigDecimal adult7;

            @JsonProperty("Child1")
            private BigDecimal child1;
            @JsonProperty("Child2")
            private BigDecimal child2;
            @JsonProperty("Child3")
            private BigDecimal child3;
            @JsonProperty("Child4")
            private BigDecimal child4;
            @JsonProperty("Child5")
            private BigDecimal child5;
            @JsonProperty("Child6")
            private BigDecimal child6;
            @JsonProperty("Child7")
            private BigDecimal child7;
        }
    }
}