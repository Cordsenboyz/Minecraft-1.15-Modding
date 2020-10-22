package com.cordsenboyz.cordsenmod.world.gen;

import com.cordsenboyz.cordsenmod.init.BlockInit;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.carver.ICarverConfig;
import net.minecraft.world.gen.carver.WorldCarver;

import java.util.BitSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class CordsenWorldCarver extends WorldCarver {

    public CordsenWorldCarver(Function p_i49921_1_, int p_i49921_2_) {
        super(p_i49921_1_, p_i49921_2_);
    }
    protected Set<Block> carvableBlocksCordsen = ImmutableSet.of(BlockInit.RED_GRASS.get(), Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.GRASS_BLOCK, Blocks.TERRACOTTA, Blocks.WHITE_TERRACOTTA, Blocks.ORANGE_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA, Blocks.YELLOW_TERRACOTTA, Blocks.LIME_TERRACOTTA, Blocks.PINK_TERRACOTTA, Blocks.GRAY_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA, Blocks.CYAN_TERRACOTTA, Blocks.PURPLE_TERRACOTTA, Blocks.BLUE_TERRACOTTA, Blocks.BROWN_TERRACOTTA, Blocks.GREEN_TERRACOTTA, Blocks.RED_TERRACOTTA, Blocks.BLACK_TERRACOTTA, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.MYCELIUM, Blocks.SNOW, Blocks.PACKED_ICE);

    @Override
    protected boolean isCarvable(BlockState cordsencarver) {
        return this.carvableBlocksCordsen.contains(cordsencarver.getBlock());
    }

    @Override
    public boolean func_225555_a_(IChunk p_225555_1_, Function p_225555_2_, Random p_225555_3_, int p_225555_4_, int p_225555_5_, int p_225555_6_, int p_225555_7_, int p_225555_8_, BitSet p_225555_9_, ICarverConfig p_225555_10_) {
        return true;
    }

    @Override
    public boolean shouldCarve(Random rand, int chunkX, int chunkZ, ICarverConfig config) {
        return true;
    }

    @Override
    protected boolean func_222708_a(double p_222708_1_, double p_222708_3_, double p_222708_5_, int p_222708_7_) {
        return true;
    }
}
