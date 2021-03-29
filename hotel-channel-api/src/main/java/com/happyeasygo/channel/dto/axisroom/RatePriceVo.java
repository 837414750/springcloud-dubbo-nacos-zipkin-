package com.happyeasygo.channel.dto.axisroom;

import lombok.Data;

@Data
public class RatePriceVo {
    private String propertyId;
    private String roomId;
    private String rateplanId;
    private String startDate;
    private String endDate;
    private String ota;
}
