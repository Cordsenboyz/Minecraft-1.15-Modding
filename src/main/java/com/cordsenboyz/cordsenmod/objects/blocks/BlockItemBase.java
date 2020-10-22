package com.cordsenboyz.cordsenmod.objects.blocks;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(CordsenMod.TAB));
    }
}
