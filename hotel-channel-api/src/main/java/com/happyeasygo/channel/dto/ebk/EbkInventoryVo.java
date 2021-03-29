package com.happyeasygo.channel.dto.ebk;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class EbkInventoryVo extends EbkInventory {
    private String ota;
}
