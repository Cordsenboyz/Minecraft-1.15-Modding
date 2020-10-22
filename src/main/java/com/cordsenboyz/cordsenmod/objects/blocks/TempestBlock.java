package com.cordsenboyz.cordsenmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TempestBlock extends Block {

    public TempestBlock() {
        super(Properties.create(Material.IRON)
               .hardnessAndResistance(8.0f, 10.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
