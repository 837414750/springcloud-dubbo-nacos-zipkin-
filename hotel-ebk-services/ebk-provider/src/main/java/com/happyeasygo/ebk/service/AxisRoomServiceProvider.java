package com.happyeasygo.ebk.service;

import com.happyeasygo.ebk.dto.HotelDTO;

import java.util.List;
import java.util.Map;

/**
 * @author lu
 * @date 2021/2/26
 */
public interface AxisRoomServiceProvider {

    List<Map<String, String>> getRoomTypeInfo(String hotelId, String provider);

    String queryHotel(HotelDTO hotelDTO);
}