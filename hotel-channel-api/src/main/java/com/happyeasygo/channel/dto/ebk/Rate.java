package com.happyeasygo.channel.dto.ebk;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Rate 实体
 *
 * Created by king on 2020/3/19.
 * @author king
*/
@Data
public class Rate {
//	@EqualsAndHashCode.Include
	private String date;
	private List<SellRate> sellRates;
	private Double commission;
	private Double extraAdultPrice;
	private Double extraChildPrice;
	private boolean blackout;

}
