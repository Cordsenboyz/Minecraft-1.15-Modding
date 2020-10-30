package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.world.biomes.*;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, CordsenMod.MOD_ID);

    public static final RegistryObject<Biome> ANCIENTMOUNTAINS = BIOMES.register("ancientmountains",
            () -> new AncientMountains(new Biome.Builder().precipitation(Biome.RainType.RAIN).scale(2.0F).temperature(0.4F)
                    .waterColor(4363241).waterFogColor(4358590)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(),
                            Blocks.DIRT.getDefaultState(), Blocks.GRAVEL.getDefaultState())).
                            category(Biome.Category.EXTREME_HILLS).downfall(0.5F).depth(0.125F).parent(null)));

    public static final RegistryObject<Biome> MAPLEFOREST = BIOMES.register("mapleforest",
            () -> new MapleForest(new Biome.Builder().precipitation(Biome.RainType.RAIN).scale(0.2F).temperature(1.0F)
            .waterColor(4159204).waterFogColor(329011)
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(),
                    Blocks.DIRT.getDefaultState(), Blocks.GRAVEL.getDefaultState())).
                    category(Biome.Category.PLAINS).downfall(0.8F).depth(0.1F).parent(null)));

    public static final RegistryObject<Biome> CHARREDFOREST = BIOMES.register("charredforest",
            () -> new CharredForest(new Biome.Builder().precipitation(Biome.RainType.NONE).scale(0.2F).temperature(10.0F)
                    .waterColor(4159204).waterFogColor(329011)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.RED_GRASS.get().getDefaultState(),
                            Blocks.DIRT.getDefaultState(), Blocks.GRAVEL.getDefaultState())).
                            category(Biome.Category.SAVANNA).downfall(0.8F).depth(0.1F).parent(null)));

    public static final RegistryObject<Biome> ICEMOUNTAINS = BIOMES.register("icemountains",
            () -> new IceMountains(new Biome.Builder().precipitation(Biome.RainType.SNOW).scale(0.5F).temperature(0.01F)
                    .waterColor(4159204).waterFogColor(329011)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.ICE.getDefaultState(),
                            Blocks.PACKED_ICE.getDefaultState(), Blocks.GRAVEL.getDefaultState())).
                            category(Biome.Category.ICY).downfall(0.8F).depth(1.0F).parent(null)));

    public static final RegistryObject<Biome> LAVALANDS = BIOMES.register("lavalands",
            () -> new LavaLands(new Biome.Builder().precipitation(Biome.RainType.NONE).scale(0.1F).temperature(10.0F)
                    .waterColor(4159204).waterFogColor(329011)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.BLACKSTONE.get().getDefaultState(),
                            BlockInit.BLACKSTONE.get().getDefaultState(), BlockInit.BLACKSTONE.get().getDefaultState())).
                            category(Biome.Category.PLAINS).downfall(0.0F).depth(0.1F).parent(null)));

    public static final RegistryObject<Biome> REDDESERT = BIOMES.register("reddesert",
            () -> new RedDesert(new Biome.Builder().precipitation(Biome.RainType.NONE).scale(0.05F).temperature(2.0F)
            .waterColor(4159204).waterFogColor(329011)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(),
                            Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState())).
                            category(Biome.Category.DESERT).downfall(0.0F).depth(0.125F).parent(null)));

    public static void registerBiomes() {
        registerBiome(ANCIENTMOUNTAINS.get(), BiomeDictionary.Type.HILLS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(MAPLEFOREST.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(CHARREDFOREST.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(ICEMOUNTAINS.get(), BiomeDictionary.Type.COLD, BiomeDictionary.Type.OVERWORLD);
        registerBiome(LAVALANDS.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(REDDESERT.get(), BiomeDictionary.Type.HOT, BiomeDictionary.Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types){
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10));
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);

    }

}
