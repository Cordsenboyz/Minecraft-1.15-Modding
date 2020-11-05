package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.world.feature.structures.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Locale;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = CordsenMod.MOD_ID)
public class FeatureInit {
    public static final DeferredRegister<Feature<?>> FEATURES = new DeferredRegister<Feature<?>>(ForgeRegistries.FEATURES, CordsenMod.MOD_ID);

    public static IStructurePieceType HOUSE_PIECE = HousePieces.Piece::new;
    public static IStructurePieceType WINDTEMPLE_PIECE = WindtemplePieces.Piece::new;
    public static IStructurePieceType RUINEDTOWER_PIECE = RuinedTowerPieces.Piece::new;
    public static IStructurePieceType RUINEDTOWER1_PIECE = RuinedTower1Pieces.Piece::new;
    public static IStructurePieceType RUINEDTOWER2_PIECE = RuinedTower2Pieces.Piece::new;
    public static IStructurePieceType VOLCANO_PIECE = VolcanoPieces.Piece::new;

    public static final RegistryObject<HouseStructure> HOUSE = FEATURES.register("house", () -> new HouseStructure(NoFeatureConfig::deserialize));
    public static final RegistryObject<WindtempleStructure> WINDTEMPLE = FEATURES.register("windtemple", () -> new WindtempleStructure(NoFeatureConfig::deserialize));
    public static final RegistryObject<RuinedTower> RUINEDTOWER = FEATURES.register("ruined_tower", () -> new RuinedTower(NoFeatureConfig::deserialize));
    public static final RegistryObject<RuinedTower1> RUINEDTOWER1 = FEATURES.register("ruined_tower1", () -> new RuinedTower1(NoFeatureConfig::deserialize));
    public static final RegistryObject<RuinedTower2> RUINEDTOWER2 = FEATURES.register("ruined_tower2", () -> new RuinedTower2(NoFeatureConfig::deserialize));
    public static final RegistryObject<VolcanoStructure> VOLCANO = FEATURES.register("volcano", () -> new VolcanoStructure(NoFeatureConfig::deserialize));

    @SubscribeEvent
    public static void registerStructurePieces(RegistryEvent.Register<Feature<?>> event) {
        Registry.register(Registry.STRUCTURE_PIECE, "HOUSE".toLowerCase(Locale.ROOT), HOUSE_PIECE);
        Registry.register(Registry.STRUCTURE_PIECE, "WINDTEMPLE".toLowerCase(Locale.ROOT), WINDTEMPLE_PIECE);
        Registry.register(Registry.STRUCTURE_PIECE, "RUINEDTOWER".toLowerCase(Locale.ROOT), RUINEDTOWER_PIECE);
        Registry.register(Registry.STRUCTURE_PIECE, "RUINEDTOWER1".toLowerCase(Locale.ROOT), RUINEDTOWER1_PIECE);
        Registry.register(Registry.STRUCTURE_PIECE, "RUINEDTOWER2".toLowerCase(Locale.ROOT), RUINEDTOWER2_PIECE);
        Registry.register(Registry.STRUCTURE_PIECE, "VOLCANO".toLowerCase(Locale.ROOT), VOLCANO_PIECE);

    }

}
