package com.happyeasygo.channel.dto.ebk;

import lombok.Data;

import java.util.Date;

/**
 * @author: Aaron
 * @date: 2020/2/28 15:13
 * @description:
 */
@Data
public class BaseEntity {
    private String userName;
    private String userId;
    private Date createBy;
    private Date updateBy;
    private Boolean isDelete;
    private String createUser;
    private String createUserId;
}
