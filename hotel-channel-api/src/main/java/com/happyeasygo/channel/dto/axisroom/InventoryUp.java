package com.happyeasygo.channel.dto.axisroom;

import lombok.Data;

import java.util.List;

@Data
public class InventoryUp {
    private String propertyId;
    private String roomId;
    private List<Inventory> inventory;
    private String ota;

    @Data
    public static class Inventory{
        private String startDate;
        private String endDate;
        private int free;
    }
}