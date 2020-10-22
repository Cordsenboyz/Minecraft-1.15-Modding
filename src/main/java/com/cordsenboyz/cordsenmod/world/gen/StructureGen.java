package com.cordsenboyz.cordsenmod.world.gen;

import com.cordsenboyz.cordsenmod.init.BiomeInit;
import com.cordsenboyz.cordsenmod.init.FeatureInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class StructureGen {
    public static void generateStructures() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.PLAINS) {
                biome.addStructure(FeatureInit.HOUSE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                biome.addStructure(FeatureInit.WINDTEMPLE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            }

            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeatureInit.HOUSE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeatureInit.WINDTEMPLE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
        }
    }
}
