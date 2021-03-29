package com.happyeasygo.channel.dto.staah;

import lombok.Data;

import java.util.List;

@Data
public class RoomRate {

    private String trackingId;
    private List<RoomtypesBean> roomtypes;
    private List<RateplansBean> rateplans;
    private List<RoomRateMappingBean> room_rate_mapping;

    @Data
    public static class RoomtypesBean {

        private String room_id;
        private String roomname;
        private String roomtype;
        private String roomtype_view;
        private String dormitory;
        private String rackrate;
        private String description;
        private String default_inventory;
        private String roomsize;
        private String max_adult;
        private String max_guest;
        private String no_of_child;
        private String total_room;
        private List<BeddingBean> bedding;
        //private List<RoomImagesBean> room_images;
        //private List<FacilitiesBean> facilities;

        @Data
        public static class BeddingBean {
            private String bed_type;
            private String beds;
        }

        @Data
        public static class RoomImagesBean {
            private String name;
            private String priority;
            private String url;
        }

        @Data
        public static class FacilitiesBean {
            private String amenitytype;
            private List<String> amenities;
        }
    }

    @Data
    public static class RateplansBean {
        private String rate_id;
        private String ratename;
        private String description;
        private String cancellation_policy;
        private String mealplan;
        private String default_minimum_night;
        private String default_maximum_stay;
        private String extra_adult_rate;
        private String extra_child_rate;
        private String applicable_guest;
        private List<ValidityBean> validity;

        @Data
        public static class ValidityBean {
            private String to_date;
            private String from_date;
        }
    }

    @Data
    public static class RoomRateMappingBean {
        private String room_id;
        private String rate_id;
        private String mapping_name;
    }
}