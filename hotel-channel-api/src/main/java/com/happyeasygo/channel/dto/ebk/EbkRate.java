package com.happyeasygo.channel.dto.ebk;

import lombok.Data;

import java.util.List;

/**
 * EBK Rate 实体类
 *
 * Created by king on 2020/3/19.
 * @author king
*/
@Data
public class EbkRate {

	private String hotelId;
	private String roomTypeId;
	private String ratePlanId;
	private List<Rate> rates;
}
