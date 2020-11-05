package com.cordsenboyz.cordsenmod.world.biomes;

import com.cordsenboyz.cordsenmod.init.FeatureInit;
import com.cordsenboyz.cordsenmod.world.gen.CordsenFeature;
import com.cordsenboyz.cordsenmod.world.gen.ModCanyonCarver;
import com.cordsenboyz.cordsenmod.world.gen.ModCaveCarver;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;

public class LavaLands extends Biome {
    public LavaLands(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addStructure(Feature.MINESHAFT.withConfiguration(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
        this.addStructure(Feature.STRONGHOLD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(new ModCaveCarver(ProbabilityConfig::deserialize), new ProbabilityConfig(0.14285715F)));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(new ModCanyonCarver(ProbabilityConfig::deserialize), new ProbabilityConfig(0.02F)));
        this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CordsenFeature.BASALT_SPIKE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(4))));

        DefaultBiomeFeatures.addOres(this);
        CordsenBiomeFeatures.addLakes(this);
    }
}
