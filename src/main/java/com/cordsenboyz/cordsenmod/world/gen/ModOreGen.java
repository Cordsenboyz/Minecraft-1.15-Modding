package com.cordsenboyz.cordsenmod.world.gen;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.init.BiomeInit;
import com.cordsenboyz.cordsenmod.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if(biome.getCategory() == Biome.Category.NETHER){
                genOre(biome, 1, 8, 16, 128, OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERITE_ORE.get().getDefaultState(), 4);
            }
                genOre(biome, 15, 8, 5, 55, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.LEAD_ORE.get().getDefaultState(), 6);
                genOre(biome, 15, 8, 5, 55, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SILVER_ORE.get().getDefaultState(), 6);
                genOre(biome, 15, 8, 5, 225, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TIN_ORE.get().getDefaultState(), 6);
                genOre(biome, 15, 8, 5, 225, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.COPPER_ORE.get().getDefaultState(), 6);
            if(biome == Biomes.DESERT)
                genOre(biome, 15, 8, 5, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.get().getDefaultState(), 6);
            if(biome == Biomes.SAVANNA)
                genOre(biome, 15, 8, 5, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.get().getDefaultState(), 6);
            if(biome == Biomes.DEEP_COLD_OCEAN)
                genOre(biome, 5,8,5,40, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.OSMENITE_ORE.get().getDefaultState(), 4);
            if(biome == BiomeInit.ANCIENTMOUNTAINS.get())
                genOre(biome, 5, 128,5, 255, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TEMPEST_ORE.get().getDefaultState(), 4);
            if(biome == BiomeInit.CHARREDFOREST.get())genOre(biome, 30, 8, 5,255, OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.COAL_ORE.getDefaultState(), 15);
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffSet, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size){
        CountRangeConfig range = new CountRangeConfig(count, bottomOffSet, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }

}
