package com.happyeasygo.channel.dto.rezgain;

import lombok.Data;

import java.util.List;

@Data
public class RezRatePlanPrice {
    private String invTypeCode;
    private String ratePlanCode;
    private String startTime;
    private String endTime;
    private List<RateAmounts> rateAmounts;
    private String currency;
    private List<String> mealPlans;
    private String allotment;
    private String availability;//可用性
    private String hotelCode;
}
