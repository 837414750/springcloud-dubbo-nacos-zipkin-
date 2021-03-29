package com.happyeasygo.channel.dto.rezgain;

import lombok.Data;

@Data
public class RateAmounts {
    private String occupancyCode;
    private String amount;
    private boolean childFlag;
    private boolean additionalFlag;
}
