package com.cordsenboyz.cordsenmod.util;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.client.entity.render.ExampleEntityRender;
import com.cordsenboyz.cordsenmod.client.gui.AlloyFurnaceScreen;
import com.cordsenboyz.cordsenmod.client.gui.ExampleChestScreen;
import com.cordsenboyz.cordsenmod.init.BlockInit;
import com.cordsenboyz.cordsenmod.init.ModContainerTypes;
import com.cordsenboyz.cordsenmod.init.ModEntityTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ModContainerTypes.EXAMPLE_CHEST.get(), ExampleChestScreen::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EXAMPLE_ENTITY.get(), ExampleEntityRender::new);
        ScreenManager.registerFactory(ModContainerTypes.ALLOY_FURNACE.get(), AlloyFurnaceScreen::new);
        RenderTypeLookup.setRenderLayer(BlockInit.OLDWOOD_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAPLEWOOD_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RED_GRASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ASHBUSH_BLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LOCUSTWOOD_SAPLING.get(), RenderType.getCutout());

    }
}
