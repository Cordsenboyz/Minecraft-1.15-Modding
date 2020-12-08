package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.container.AlloyFurnaceContainer;
import com.cordsenboyz.cordsenmod.container.DiamondBarrelContainer;
import com.cordsenboyz.cordsenmod.container.GoldBarrelContainer;
import com.cordsenboyz.cordsenmod.container.IronBarrelContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, CordsenMod.MOD_ID);

    public static final RegistryObject<ContainerType<DiamondBarrelContainer>> DIAMOND_BARREL = CONTAINER_TYPES.register("diamond_barrel", () -> IForgeContainerType.create(DiamondBarrelContainer::new));
    public static final RegistryObject<ContainerType<IronBarrelContainer>> IRON_BARREL = CONTAINER_TYPES.register("iron_barrel", () -> IForgeContainerType.create(IronBarrelContainer::new));
    public static final RegistryObject<ContainerType<GoldBarrelContainer>> GOLD_BARREL = CONTAINER_TYPES.register("gold_barrel", () -> IForgeContainerType.create(GoldBarrelContainer::new));
    public static final RegistryObject<ContainerType<AlloyFurnaceContainer>> ALLOY_FURNACE = CONTAINER_TYPES.register("alloy_furnace", () -> IForgeContainerType.create(AlloyFurnaceContainer::new));
}
