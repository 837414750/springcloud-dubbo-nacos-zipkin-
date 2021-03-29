package com.happyeasygo.channel.dto.axisroom;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author: Aaron
 * @date: 2020/1/15 17:44
 * @description:
 */
@Data
public class RateUp {
    private String propertyId;
    private String roomId;
    private String rateplanId;
    private List<Map<String, String>> rate;
    private String ota;
}
