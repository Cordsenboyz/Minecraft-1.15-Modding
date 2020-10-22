package com.cordsenboyz.cordsenmod.objects.blocks;

import com.cordsenboyz.cordsenmod.init.BlockInit;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class AshBushBlock extends BushBlock implements net.minecraftforge.common.IShearable {
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public AshBushBlock() {
        super(Properties.create(Material.TALL_PLANTS)
                .hardnessAndResistance(0.0f, 0.0f)
                .sound(SoundType.PLANT)
                .doesNotBlockMovement()

        );
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == BlockInit.RED_GRASS.get();
    }
}