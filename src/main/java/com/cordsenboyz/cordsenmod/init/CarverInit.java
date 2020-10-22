package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.world.gen.CordsenWorldCarver;
import com.cordsenboyz.cordsenmod.world.gen.ModCanyonCarver;
import com.cordsenboyz.cordsenmod.world.gen.ModCaveCarver;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.carver.ICarverConfig;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.beans.PropertyChangeSupport;

public class CarverInit {
    public static final DeferredRegister<WorldCarver<?>> CARVERS = new DeferredRegister<>(ForgeRegistries.WORLD_CARVERS, CordsenMod.MOD_ID);

    public static final RegistryObject<WorldCarver<ProbabilityConfig>> CORDSEN_CARVER = CARVERS.register("cordsen_carver", () -> new ModCaveCarver(ProbabilityConfig::deserialize));
    public static final RegistryObject<WorldCarver<ProbabilityConfig>> CORDSEN_CANYON_CARVER = CARVERS.register("cordsen_canyon_carver", () -> new ModCanyonCarver(ProbabilityConfig::deserialize));

}
