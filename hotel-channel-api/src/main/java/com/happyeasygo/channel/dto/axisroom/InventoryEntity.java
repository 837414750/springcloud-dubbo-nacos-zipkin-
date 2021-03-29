package com.happyeasygo.channel.dto.axisroom;

import lombok.Data;

/**
 * 
 *
 * Created by king on 2020/2/27.
 * @author king
*/
@Data
public class InventoryEntity {

	private String date;
	private Integer count;
	private boolean soldOut;
}
