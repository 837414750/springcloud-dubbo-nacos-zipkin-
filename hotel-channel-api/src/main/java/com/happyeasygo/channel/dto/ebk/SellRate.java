package com.happyeasygo.channel.dto.ebk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Aaron
 * @date: 2020/2/21 15:04
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellRate {
    private String type;
    private Integer sellRate;
    private Double sellRateTax;
}
