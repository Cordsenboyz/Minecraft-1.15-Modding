package com.cordsenboyz.cordsenmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.WebBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ShearsItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class CloudBlock extends WebBlock {
    public CloudBlock() {
        super(Properties.create(Material.WEB)
                .hardnessAndResistance(1.0f, 2.0f)
                .sound(SoundType.CLOTH)
                .doesNotBlockMovement()

        );

    }
    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.setMotionMultiplier(state, new Vec3d(0.25D, (double)0.2F, 0.25D));
    }
}

