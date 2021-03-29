package com.happyeasygo.channel.service;

import com.happyeasygo.commons.tool.vo.CommonResult;
import com.happyeasygo.ebk.dto.HotelDTO;

import java.util.List;
import java.util.Map;

/**
 * @author lu
 * @date 2021/2/5
 */
public interface AxisRoomsService {
    List<Map<String, String>> getRoomTypeInfo(String hotelId, String provider);

    CommonResult queryHotel(HotelDTO hotelDTO);
}
