package com.cordsenboyz.cordsenmod.world.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class MapleForest extends Biome {
    public MapleForest(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 20, 2, 5));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 20, 2, 5));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 20, 2, 5));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 20, 2, 5));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.FOX, 30, 5, 10));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 30, 5, 10));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.02F)));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(MaplewoodTree.MAPLEWOOD_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7, 0.1F, 1))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(LocustwoodTree.LOCUSTWOOD_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7, 0.1F, 1))));

        DefaultBiomeFeatures.addLakes(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addBerryBushes(this);
        DefaultBiomeFeatures.addStoneVariants(this);
        DefaultBiomeFeatures.addTaigaRocks(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addDoubleFlowers(this);
        DefaultBiomeFeatures.addGrass(this);
    }
}
