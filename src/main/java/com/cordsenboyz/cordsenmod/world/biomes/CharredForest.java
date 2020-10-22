package com.cordsenboyz.cordsenmod.world.biomes;

import com.cordsenboyz.cordsenmod.world.gen.ModCanyonCarver;
import com.cordsenboyz.cordsenmod.world.gen.ModCaveCarver;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class CharredForest extends Biome {
    public CharredForest(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(new ModCaveCarver(ProbabilityConfig::deserialize), new ProbabilityConfig(0.14285815F)));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(new ModCanyonCarver(ProbabilityConfig::deserialize), new ProbabilityConfig(0.06F)));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(CharredwoodTree.CHARREDWOOD_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addDeadBushes(this);
        CordsenBiomeFeatures.addAshbushBlock(this);
    }

}
