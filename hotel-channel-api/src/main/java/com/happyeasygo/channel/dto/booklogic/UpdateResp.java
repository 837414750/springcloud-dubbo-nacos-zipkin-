package com.happyeasygo.channel.dto.booklogic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateResp {

    @JsonProperty("Process")
    private String process;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Successful")
    private String successful;

    @JsonProperty("Errors")
    private String errors;

    public UpdateResp(String process,String successful,String errors){
        this.process = process;
        this.successful = successful;
        this.errors = errors;
    }
}
