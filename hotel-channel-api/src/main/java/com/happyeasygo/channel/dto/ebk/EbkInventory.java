package com.happyeasygo.channel.dto.ebk;

import com.happyeasygo.channel.dto.axisroom.InventoryEntity;
import lombok.Data;

import java.util.List;

/**
 * ebk 库存实体类
 *
 * Created by king on 2020/2/27.
 * @author king
*/
@Data
public class EbkInventory {

	private String hotelId;
	private String roomTypeId;
	private List<InventoryEntity> inventories;

}
