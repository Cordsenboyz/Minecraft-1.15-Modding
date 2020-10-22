package com.cordsenboyz.cordsenmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OsmeniteBlock extends Block {

    public OsmeniteBlock() {
        super(Properties.create(Material.IRON)
               .hardnessAndResistance(8.0f, 120.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
