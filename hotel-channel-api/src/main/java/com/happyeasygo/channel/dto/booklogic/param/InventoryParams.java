package com.happyeasygo.channel.dto.booklogic.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class InventoryParams {

    /**
     * raterequest : {"hotel_id":"TEST","password":"spl","username":"spl","room":{"RoomID":"123","rate":[{"RateTypeID":"54","dates":[{"date":"2017-11-13","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0},{"date":"2017-11-14","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0}]},{"RateTypeID":"53","dates":[{"date":"2017-11-13","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0},{"date":"2017-11-14","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0}]}]}}
     */

    private RaterequestBean raterequest;

    @Data
    public static class RaterequestBean {
        /**
         * hotel_id : TEST
         * password : spl
         * username : spl
         * room : {"RoomID":"123","rate":[{"RateTypeID":"54","dates":[{"date":"2017-11-13","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0},{"date":"2017-11-14","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0}]},{"RateTypeID":"53","dates":[{"date":"2017-11-13","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0},{"date":"2017-11-14","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0}]}]}
         */
        @JsonProperty("Hotel_Id")
        private String hotel_id;
        private String password;
        private String username;
        private RoomBean room;

        @Data
        public static class RoomBean {
            /**
             * RoomID : 123
             * rate : [{"RateTypeID":"54","dates":[{"date":"2017-11-13","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0},{"date":"2017-11-14","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0}]},{"RateTypeID":"53","dates":[{"date":"2017-11-13","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0},{"date":"2017-11-14","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0}]}]
             */
            @JsonProperty("RoomID")
            private String roomID;
            private List<RateBean> rate;

            @Data
            public static class RateBean {
                /**
                 * RateTypeID : 54
                 * dates : [{"date":"2017-11-13","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0},{"date":"2017-11-14","closedonarrival":0,"minimumstay":1,"roomstosell":10,"closedondeparture":0}]
                 */
                @JsonProperty("RateTypeID")
                private String rateTypeID;
                private List<DatesBean> dates;

                @Data
                public static class DatesBean {
                    /**
                     * date : 2017-11-13
                     * closedonarrival : 0
                     * minimumstay : 1
                     * roomstosell : 10
                     * closedondeparture : 0
                     * stopsell : 0 //0=false,1=true
                     * advancebookingdays :
                     */
                    private String date;
                    private int closedonarrival;
                    private int minimumstay;
                    private int roomstosell;
                    private int closedondeparture;
                    private int stopsale;
                    private int advancebookingdays;
                }
            }
        }
    }
}
