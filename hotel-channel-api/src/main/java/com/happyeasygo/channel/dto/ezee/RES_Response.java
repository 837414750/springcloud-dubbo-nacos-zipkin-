package com.happyeasygo.channel.dto.ezee;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)//开启链式调用
public class RES_Response {

    @JsonProperty("Errors")
    private Errors errors;

    @JsonProperty("RoomInfo")
    private RoomInfo roomInfo;

    @JsonProperty("Success")
    private Success success;

    @Data
    @Accessors(chain=true) // 可以链式调用 setter
    public static class Errors{
        @JsonProperty("ErrorCode")
        private int errorCode;

        @JsonProperty("ErrorMessage")
        private String errorMessage;
    }

    @Data
    @Accessors(chain=true)
    public static class RoomInfo{
        @JsonProperty("RatePlans")
        private List<RatePlan> ratePlan;
    }

    @Data
    @Accessors(chain=true) // 可以链式调用 setter
    public static class RatePlan{
        @JsonProperty("RoomTypeID")
        private String RoomTypeID;

        @JsonProperty("RoomType")
        private String roomType;

        @JsonProperty("RateTypeID")
        private String rateTypeID;

        @JsonProperty("RateType")
        private String rateType;
    }

    @Data
    public static class Success{
        @JsonProperty("SuccessMsg")
        private String successMsg;
    }
}