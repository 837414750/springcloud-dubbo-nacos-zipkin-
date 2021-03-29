package com.happyeasygo.channel.dto.ezee.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@Validated
public class AuthenticationBean {

    @NotNull
    @JsonProperty("HotelCode")
    private String hotelCode;

    @NotNull
    @JsonProperty("AuthCode")
    private String authCode;
}
