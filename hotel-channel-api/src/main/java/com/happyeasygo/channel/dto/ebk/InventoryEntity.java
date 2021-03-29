package com.happyeasygo.channel.dto.ebk;

import lombok.*;

/**
 * 
 *
 * Created by king on 2020/2/27.
 * @author king
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "date")
public class InventoryEntity {

	private String date;
	private Integer count;
	private boolean soldOut;
}
