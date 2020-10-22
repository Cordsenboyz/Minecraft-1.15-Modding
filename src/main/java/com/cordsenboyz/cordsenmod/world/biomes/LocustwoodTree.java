package com.cordsenboyz.cordsenmod.world.biomes;

import com.cordsenboyz.cordsenmod.init.BlockInit;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class LocustwoodTree extends Tree {
    public static final TreeFeatureConfig LOCUSTWOOD_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.LOCUSTWOOD_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockInit.LOCUSTWOOD_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0) {
            })).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines()
            .setSapling((IPlantable)BlockInit.LOCUSTWOOD_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(LOCUSTWOOD_TREE_CONFIG);
    }
}
