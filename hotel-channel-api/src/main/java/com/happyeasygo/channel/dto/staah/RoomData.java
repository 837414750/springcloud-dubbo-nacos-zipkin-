package com.happyeasygo.channel.dto.staah;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RoomData {

    private String propertyid;
    private String room_id;
    private String trackingId;
    private String rate_id;
    private List<DataBean> data;

    @Data
    public static class DataBean {
        private String maxstay;
        @JsonProperty("Rate")
        private String rate;
        private String inventory;
        private String from_date;
        private String to_date;
        private String extraadult;
        private String stopsell;
        private String extrachild;
        private String cta;
        private String ctd;
        private String minstay;
        private ObpBean obp;

        @Data
        public static class ObpBean {
            private String person1;
            private String person2;
            private String person3;
            private String person4;
            private String person5;
            private String person6;
            private String person7;
            private String person8;
            private String person9;
            private String person10;
        }
    }
}
