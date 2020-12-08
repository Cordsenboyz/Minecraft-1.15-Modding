package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.tileentity.AlloyFurnaceTileEntity;
import com.cordsenboyz.cordsenmod.tileentity.DiamondBarrelTileEntity;
import com.cordsenboyz.cordsenmod.tileentity.GoldBarrelTileEntity;
import com.cordsenboyz.cordsenmod.tileentity.IronBarrelTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, CordsenMod.MOD_ID);
    public static final RegistryObject<TileEntityType<DiamondBarrelTileEntity>> DIAMOND_BARREL = TILE_ENTITY_TYPES.register("diamond_barrel", () -> TileEntityType.Builder.create(DiamondBarrelTileEntity::new, BlockInit.DIAMOND_BARREL.get()).build(null));
    public static final RegistryObject<TileEntityType<GoldBarrelTileEntity>> GOLD_BARREL = TILE_ENTITY_TYPES.register("gold_barrel", () -> TileEntityType.Builder.create(GoldBarrelTileEntity::new, BlockInit.GOLD_BARREL.get()).build(null));
    public static final RegistryObject<TileEntityType<IronBarrelTileEntity>> IRON_BARREL = TILE_ENTITY_TYPES.register("iron_barrel", () -> TileEntityType.Builder.create(IronBarrelTileEntity::new, BlockInit.IRON_BARREL.get()).build(null));
    public static final RegistryObject<TileEntityType<AlloyFurnaceTileEntity>> ALLOY_FURNACE = TILE_ENTITY_TYPES.register("alloy_furnace", () -> TileEntityType.Builder.create(AlloyFurnaceTileEntity::new, BlockInit.ALLOY_FURNACE.get()).build(null));
}
