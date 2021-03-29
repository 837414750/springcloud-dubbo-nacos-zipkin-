package com.happyeasygo.channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

/**
 * @author lu
 * @date 2021/3/25
 */
@SpringBootApplication(exclude = {FeignAutoConfiguration.class})
@EnableDiscoveryClient
public class HotelChannelServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotelChannelServiceApplication.class,args);
    }
}
