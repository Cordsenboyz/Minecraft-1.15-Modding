package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.entities.ExampleEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, CordsenMod.MOD_ID);

    public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE_ENTITY = ENTITY_TYPES.register("example_entity", ()-> EntityType.Builder.<ExampleEntity>create(ExampleEntity::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build(new ResourceLocation(CordsenMod.MOD_ID, "example_entity").toString()));

}
