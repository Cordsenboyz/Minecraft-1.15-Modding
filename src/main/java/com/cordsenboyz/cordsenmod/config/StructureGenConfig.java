package com.cordsenboyz.cordsenmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class StructureGenConfig {
    public static ForgeConfigSpec.IntValue FLATNESS_DELTA;
    public static ForgeConfigSpec.BooleanValue GENERATE_WINDTEMPLES;
    public static ForgeConfigSpec.DoubleValue WINDTEMPLE_SPAWN_CHANCE;
    public static ForgeConfigSpec.IntValue WINDTEMPLE_DISTANCE;
    public static ForgeConfigSpec.IntValue WINDTEMPLE_SEPARATION;


    public StructureGenConfig() {
    }

    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
        SERVER_BUILDER.comment("Structure Generation Config");
        FLATNESS_DELTA = SERVER_BUILDER.comment("How flat does terrain need to be for surface structures to spawn? (in blocks) [default: 3]").defineInRange("structures.global.flatness_delta", 3, 0, 64);
        GENERATE_WINDTEMPLES = SERVER_BUILDER.comment("Generate Castles?").define("structures.castle.generate", true);
        WINDTEMPLE_SPAWN_CHANCE = SERVER_BUILDER.comment("Castle Spawn Chance [default: 0.5]").defineInRange("structures.castle.spawn_chance", 0.5D, 0.0D, 1.0D);
        WINDTEMPLE_DISTANCE = SERVER_BUILDER.comment("Castle Distance (in chunks) [default: 40]").defineInRange("structures.castle.distance", 40, 1, 500);
        WINDTEMPLE_SEPARATION = SERVER_BUILDER.comment("Castle Minimum Separation (in chunks) [default: 8]").defineInRange("structures.castle.separation", 8, 1, 500);
    }
}
