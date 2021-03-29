package com.happyeasygo.channel.dto.booklogic.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RateParams {

    private RaterequestBean raterequest;

    @Data
    public static class RaterequestBean {
        @JsonProperty("Hotel_Id")
        private String hotel_id;
        private RoomBean room;
        private String password;
        private String username;

        @Data
        public static class RoomBean {
            @JsonProperty("RoomID")
            private String RoomID;
            private List<RateBean> rate;

            @Data
            public static class RateBean {
                @JsonProperty("RateID")
                private String RateID;
                private List<DatesBean> dates;

                @Data
                public static class DatesBean {
                    private String date;
                    private int minstay;
                    private int infant;
                    private int price;
                    private int adult;
                    private int closed;
                    private int childa;
                    private int childb;
                    private int closedonarrival;
                    private int closedondeparture;
                }
            }
        }
    }
}
