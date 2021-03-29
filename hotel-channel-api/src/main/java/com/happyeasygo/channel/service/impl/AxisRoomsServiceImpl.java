package com.happyeasygo.channel.service.impl;

import com.happyeasygo.channel.service.AxisRoomsService;
import com.happyeasygo.commons.tool.utils.GsonTool;
import com.happyeasygo.commons.tool.vo.CommonResult;
import com.happyeasygo.ebk.dto.HotelDTO;
import com.happyeasygo.ebk.service.AxisRoomServiceProvider;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

/**
 * @author lu
 * @date 2021/2/5
 */
@Service
@Slf4j
public class AxisRoomsServiceImpl implements AxisRoomsService {

    @DubboReference
    private AxisRoomServiceProvider axisRoomServiceProvider;

    @Override
    public List<Map<String, String>> getRoomTypeInfo(String hotelId, String provider) {
        log.info("hotelId:{},provider:{}",hotelId,provider);
        List<Map<String, String>> roomTypeInfo = axisRoomServiceProvider.getRoomTypeInfo(hotelId, provider);
        log.info("getRoomTypeInfo resp:{}", !CollectionUtils.isEmpty(roomTypeInfo) ? GsonTool.toJson(roomTypeInfo) : null);
        return roomTypeInfo;
    }

    @Override
    public CommonResult queryHotel(HotelDTO hotelDTO) {
        log.info("hotel param:{}",GsonTool.toJson(hotelDTO));
        String resp = axisRoomServiceProvider.queryHotel(hotelDTO);
        log.info("hotel resp:{}", resp);
        return new CommonResult(200,"success",resp);
    }
}