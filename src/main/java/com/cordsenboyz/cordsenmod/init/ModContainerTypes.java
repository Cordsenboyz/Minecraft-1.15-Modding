package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.container.AlloyFurnaceContainer;
import com.cordsenboyz.cordsenmod.container.ExampleChestContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, CordsenMod.MOD_ID);

    public static final RegistryObject<ContainerType<ExampleChestContainer>> EXAMPLE_CHEST = CONTAINER_TYPES.register("example_chest", () -> IForgeContainerType.create(ExampleChestContainer::new));

    public static final RegistryObject<ContainerType<AlloyFurnaceContainer>> ALLOY_FURNACE = CONTAINER_TYPES.register("alloy_furnace", () -> IForgeContainerType.create(AlloyFurnaceContainer::new));
}
