package com.happyeasygo.channel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.happyeasygo.commons.tool.vo.CommonResult;
import com.happyeasygo.ebk.dto.HotelDTO;

/**
 * @author lu
 * @date 2021/3/2
 */
public class ServiceBlockHandler {
    public static CommonResult handleException(HotelDTO hotelDTO, BlockException exception){
        return new CommonResult(111,"出错了，请稍后重试");
    }
}