package com.happyeasygo.channel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.happyeasygo.channel.annotation.AxisLogin;
import com.happyeasygo.channel.handler.ServiceBlockHandler;
import com.happyeasygo.channel.service.AxisRoomsService;
import com.happyeasygo.commons.tool.utils.GsonTool;
import com.happyeasygo.commons.tool.utils.ResponseUtil;
import com.happyeasygo.commons.tool.vo.CommonResult;
import com.happyeasygo.ebk.dto.HotelDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

/**
 * @author lu
 * @date 2021/2/4
 */
@RestController
@Slf4j
@RequestMapping(value = "/channel")
public class AxisRoomsController {

    @Autowired
    private AxisRoomsService axisRoomsService;

    //@AxisLogin(value = "loginIntercept")
    @PostMapping(value = "/productInfo")
    public Object getProductInfo(@RequestBody Map<String, Object> object) throws IOException {
        log.info("productInfo param: {}", GsonTool.toJson(object));
//        return axisRoomsService.getProductInfo(object);
        return ResponseUtil.response200();
    }

    @GetMapping(value = "/getRoomTypeInfo")
    public Object getRoomTypeInfo(@RequestParam String hotelId, @RequestParam String provider){
        return axisRoomsService.getRoomTypeInfo(hotelId,provider);
    }

    /**
     * 在需要通过Sentinel来控制流量的地方使用@SentinelResource注解，包括Service,Controller等
     * @param hotelDTO
     * @return
     */
    @PostMapping(value = "/postdata")
    @SentinelResource(value = "postdata",
            blockHandlerClass = ServiceBlockHandler.class,blockHandler = "handleException")
    public CommonResult postdata(@RequestBody HotelDTO hotelDTO){
        return axisRoomsService.queryHotel(hotelDTO);
    }
}
