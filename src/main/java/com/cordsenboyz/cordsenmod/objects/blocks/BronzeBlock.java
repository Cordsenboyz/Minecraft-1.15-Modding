package com.cordsenboyz.cordsenmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BronzeBlock extends Block {

    public BronzeBlock() {
        super(Properties.create(Material.IRON)
               .hardnessAndResistance(4.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
