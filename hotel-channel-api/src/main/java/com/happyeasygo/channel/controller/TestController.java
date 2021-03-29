package com.happyeasygo.channel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lu
 * @date 2021/3/25
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping
    public String test(){
        return "success";
    }
}
