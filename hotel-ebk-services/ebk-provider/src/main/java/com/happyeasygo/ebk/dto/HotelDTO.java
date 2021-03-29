package com.happyeasygo.ebk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lu
 * @date 2021/3/1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelDTO implements Serializable{
    private Integer id;
    private String hotelName;
    private String address;
}
