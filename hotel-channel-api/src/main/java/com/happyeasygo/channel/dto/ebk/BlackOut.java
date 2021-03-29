package com.happyeasygo.channel.dto.ebk;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: Aaron
 * @date: 2020/2/26 20:55
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BlackOut extends BaseEntity{
    private String blackOutId;
    private String startDate;
    private String endDate;
}
