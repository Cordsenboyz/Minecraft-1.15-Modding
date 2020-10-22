package com.cordsenboyz.cordsenmod.world.gen;

import com.cordsenboyz.cordsenmod.world.biomes.CordsenBasaltSpikeFeature;
import com.cordsenboyz.cordsenmod.world.biomes.CordsenIceSpikeFeature;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class CordsenFeature extends Feature implements IFeatureConfig {

    public static final Feature<NoFeatureConfig> ICE_SPIKE = register("ice_spike", new CordsenIceSpikeFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> BASALT_SPIKE = register("basalt_spike", new CordsenBasaltSpikeFeature(NoFeatureConfig::deserialize));
    public CordsenFeature(Function configFactoryIn, Function<Dynamic<?>, ? extends NoFeatureConfig> configFactory) {
        super(configFactoryIn);
        this.configFactory = configFactory;
    }
    public static final List<Structure<?>> ILLAGER_STRUCTURES = ImmutableList.of(PILLAGER_OUTPOST, VILLAGE);
    private final Function<Dynamic<?>, ? extends NoFeatureConfig> configFactory;

    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
        return (F)(Registry.<Feature<?>>register(Registry.FEATURE, key, value));
    }

    @Override
    public boolean place(IWorld worldIn, ChunkGenerator generator, Random rand, BlockPos pos, IFeatureConfig config) {
        return false;
    }

    @Override
    public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
        return null;
    }
}
