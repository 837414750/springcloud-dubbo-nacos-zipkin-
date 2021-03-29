package com.happyeasygo.channel.dto.booklogic.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetRoomParam {
@JsonProperty(value = "RoomRequest")
    private RoomrequestBean roomrequest;

    @Data
    public static class RoomrequestBean {
        @JsonProperty(value = "Hotel_Id")
        private String hotel_id;
        private String password;
        private String username;
    }
}
