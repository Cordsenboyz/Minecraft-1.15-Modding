package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.tileentity.AlloyFurnaceTileEntity;
import com.cordsenboyz.cordsenmod.tileentity.ExampleChestTileEntity;
import net.minecraft.tileentity.TileEntityMerger;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, CordsenMod.MOD_ID);
    public static final RegistryObject<TileEntityType<ExampleChestTileEntity>> EXAMPLE_CHEST = TILE_ENTITY_TYPES.register("example_chest", () -> TileEntityType.Builder.create(ExampleChestTileEntity::new, BlockInit.EXAMPLE_CHEST.get()).build(null));
    public static final RegistryObject<TileEntityType<AlloyFurnaceTileEntity>> ALLOY_FURNACE = TILE_ENTITY_TYPES.register("alloy_furnace", () -> TileEntityType.Builder.create(AlloyFurnaceTileEntity::new, BlockInit.ALLOY_FURNACE.get()).build(null));
}
