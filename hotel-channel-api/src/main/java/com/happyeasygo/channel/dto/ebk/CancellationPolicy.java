/**
  * Copyright 2020 bejson.com 
  */
package com.happyeasygo.channel.dto.ebk;

import lombok.EqualsAndHashCode;

/**
 * Auto-generated: 2020-01-09 19:54:20
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@EqualsAndHashCode(callSuper = true)
public class CancellationPolicy extends BaseEntity{
    private String policyId;
    private String checkInDateFrom;
    private String checkInDateUntil;
    private int from;
    private int to;
    private String unit;
    private String type;
    //private Data data;
    private String originRemark;
}