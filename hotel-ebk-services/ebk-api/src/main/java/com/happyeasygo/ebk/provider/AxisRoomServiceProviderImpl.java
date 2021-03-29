package com.happyeasygo.ebk.provider;

import com.happyeasygo.commons.tool.utils.GsonTool;
import com.happyeasygo.ebk.dto.HotelDTO;
import com.happyeasygo.ebk.service.AxisRoomServiceProvider;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lu
 * @date 2021/2/5
 */
@DubboService
@Slf4j
public class AxisRoomServiceProviderImpl implements AxisRoomServiceProvider {
    @Override
    public List<Map<String, String>> getRoomTypeInfo(String hotelId, String provider) {
        List<Map<String, String>> list =  new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("status","success");
        list.add(map);
        log.info("转换后数据:{}", GsonTool.toJson(list));
        return list;
    }

    @Override
    public String queryHotel(HotelDTO hotelDTO) {
        return GsonTool.toJson(hotelDTO);
    }
}