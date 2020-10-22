package com.cordsenboyz.cordsenmod.world.biomes;

import com.cordsenboyz.cordsenmod.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.*;

public class CordsenBiomeFeatures {

    public static final BlockClusterFeatureConfig ASHBUSH_BLOCK_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.ASHBUSH_BLOCK.get().getDefaultState()), new SimpleBlockPlacer())).tries(4).build();

    public static void addAshbushBlock(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(ASHBUSH_BLOCK_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(5))));
    }
    public static void addLakes(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(Blocks.LAVA.getDefaultState())).withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(4))));
        biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(Blocks.LAVA.getDefaultState())).withPlacement(Placement.LAVA_LAKE.configure(new ChanceConfig(88))));
    }
}





