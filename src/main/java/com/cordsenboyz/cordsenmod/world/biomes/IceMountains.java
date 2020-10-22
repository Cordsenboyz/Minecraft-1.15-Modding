package com.cordsenboyz.cordsenmod.world.biomes;

import com.cordsenboyz.cordsenmod.world.gen.CordsenFeature;
import com.cordsenboyz.cordsenmod.world.gen.ModCanyonCarver;
import com.cordsenboyz.cordsenmod.world.gen.ModCaveCarver;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;

public class IceMountains extends Biome {
    public IceMountains(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 20, 2, 5));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.STRAY, 20, 2, 5));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 20, 2, 5));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SPIDER, 20, 2, 5));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(new ModCaveCarver(ProbabilityConfig::deserialize), new ProbabilityConfig(0.14285715F)));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(new ModCanyonCarver(ProbabilityConfig::deserialize), new ProbabilityConfig(0.02F)));
        this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CordsenFeature.ICE_SPIKE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(2))));

        DefaultBiomeFeatures.addOres(this);
    }
}
