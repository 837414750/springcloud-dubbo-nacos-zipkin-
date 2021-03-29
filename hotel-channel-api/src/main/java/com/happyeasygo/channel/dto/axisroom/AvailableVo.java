package com.happyeasygo.channel.dto.axisroom;

import lombok.Data;

import java.util.List;

@Data
public class AvailableVo {
    private String propertyId;
    private String roomId;
    private String rateplanId;
    private String ota;
    private List<AvailArray> list;

    @Data
    public static class AvailArray{
        private boolean stopSell;
        private String startDate;
        private String endDate;
    }
}
