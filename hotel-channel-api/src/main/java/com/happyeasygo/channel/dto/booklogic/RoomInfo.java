package com.happyeasygo.channel.dto.booklogic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomInfo {

    @JsonProperty("Successful")
    private String successful;

    @JsonProperty("Errors")
    private String errors;

    @JsonProperty("Rooms")
    private List<Rooms> rooms;

    @Data
    public static class Rooms{
        @JsonProperty("RoomId")
        private String roomId;

        @JsonProperty("RoomName")
        private String roomName;

        @JsonProperty("RatePlanId")
        private String ratePlanId;

        @JsonProperty("RatePlanName")
        private String ratePlanName;

        @JsonProperty("MaxPerson")
        private String maxPerson;

        @JsonProperty("MinPerson")
        private String minPerson;
    }

    public RoomInfo(String successful,String errors){
        this.successful = successful;
        this.errors = errors;
    }
}
