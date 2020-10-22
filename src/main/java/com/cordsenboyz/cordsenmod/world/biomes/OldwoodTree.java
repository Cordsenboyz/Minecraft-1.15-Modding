package com.cordsenboyz.cordsenmod.world.biomes;

import com.cordsenboyz.cordsenmod.init.BlockInit;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraftforge.common.IPlantable;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Random;

public class OldwoodTree extends Tree {

    public static final TreeFeatureConfig OLDWOOD_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.OLDWOOD_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockInit.OLDWOOD_LEAVES.get().getDefaultState()),
            new SpruceFoliagePlacer(3, 0))).baseHeight(14).heightRandA(5).foliageHeight(9).ignoreVines()
            .setSapling((IPlantable)BlockInit.OLDWOOD_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(OLDWOOD_TREE_CONFIG);
    }
}
