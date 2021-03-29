package com.happyeasygo.channel.dto.reznext;

import com.happyeasygo.hotel.hotelbasicdata.model.ebk.RoomTypes;
import lombok.Data;

import java.util.List;

@Data
public class RezNextRoom {
    private List<RoomTypes> roomTypes;
    private String hotelName;
}
