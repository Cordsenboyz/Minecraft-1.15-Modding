package com.cordsenboyz.cordsenmod;



import com.cordsenboyz.cordsenmod.init.*;
import com.cordsenboyz.cordsenmod.world.gen.StructureGen;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("cordsenmod")
@Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CordsenMod {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cordsenmod";
    public static CordsenMod instance;

    public CordsenMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        FeatureInit.FEATURES.register(modEventBus);
        EnchantmentInit.ENCHANTMENTS.register(modEventBus);
        RecipeSerializerInit.RECIPE_SERIALIZERS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        BlockInit.ITEMS.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);
        ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
        ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);


        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterBiome(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
    }

    private void setup(final FMLCommonSetupEvent event) {
        for (Biome biome :ForgeRegistries.BIOMES)
        {
            biome.addStructure(FeatureInit.HOUSE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            biome.addStructure(FeatureInit.WINDTEMPLE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            biome.addStructure(FeatureInit.RUINEDTOWER.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            biome.addStructure(FeatureInit.RUINEDTOWER1.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            biome.addStructure(FeatureInit.RUINEDTOWER2.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));


            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeatureInit.WINDTEMPLE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeatureInit.HOUSE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeatureInit.RUINEDTOWER.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeatureInit.RUINEDTOWER1.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeatureInit.RUINEDTOWER2.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));

        }

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }


    public static final ItemGroup TAB = new ItemGroup("CordsenTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.RUBY.get());
        }
    };

}



