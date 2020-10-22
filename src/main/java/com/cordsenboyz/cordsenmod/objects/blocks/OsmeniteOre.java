package com.cordsenboyz.cordsenmod.objects.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OsmeniteOre extends OreBlock {
    public OsmeniteOre() {
        super(Properties.create(Material.IRON)
            .hardnessAndResistance(8.0f, 120.0f)
            .sound(SoundType.STONE)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE));
    }

}
