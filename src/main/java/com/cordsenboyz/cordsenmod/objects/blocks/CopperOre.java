package com.cordsenboyz.cordsenmod.objects.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class CopperOre extends OreBlock {
    public CopperOre() {
        super(Properties.create(Material.IRON)
            .hardnessAndResistance(3.0f, 4.0f)
            .sound(SoundType.STONE)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE));
    }

}
