package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.objects.blocks.*;
import com.cordsenboyz.cordsenmod.world.biomes.CharredwoodTree;
import com.cordsenboyz.cordsenmod.world.biomes.LocustwoodTree;
import com.cordsenboyz.cordsenmod.world.biomes.MaplewoodTree;
import com.cordsenboyz.cordsenmod.world.biomes.OldwoodTree;
import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CordsenMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CordsenMod.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", SapphireBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", SapphireOre::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", CopperOre::new);
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", SilverOre::new);
    public static final RegistryObject<Block> NETHERITE_ORE = BLOCKS.register("netherite_ore", NetheriteOre::new);
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", TinOre::new);
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", LeadOre::new);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", TinBlock::new);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> OSMENITE_BLOCK = BLOCKS.register("osmenite_block", OsmeniteBlock::new);
    public static final RegistryObject<Block> NETHERITE_BLOCK = BLOCKS.register("netherite_block", NetheriteBlock::new);
    public static final RegistryObject<Block> TEMPEST_BLOCK = BLOCKS.register("tempest_block", TempestBlock::new);
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", LeadBlock::new);
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", BronzeBlock::new);
    public static final RegistryObject<Block> EXAMPLE_CHEST = BLOCKS.register("example_chest", () -> new ExampleChestBlock(Block.Properties.from(BlockInit.BRONZE_BLOCK.get())));
    public static final RegistryObject<Block> RED_GRASS = BLOCKS.register("red_grass", () -> new GrassBlock(Block.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> OSMENITE_ORE = BLOCKS.register("osmenite_ore", OsmeniteOre::new);
    public static final RegistryObject<Block> ALLOY_FURNACE = BLOCKS.register("alloy_furnace", () -> new AlloyFurnaceBlock(Block.Properties.from(Blocks.FURNACE)));
    public static final RegistryObject<Block> TEMPEST_ORE = BLOCKS.register("tempest_ore", TempestOre::new);
    public static final RegistryObject<Block> TEMPEST_QUARTZ = BLOCKS.register("tempest_quartz", () -> new Block(Block.Properties.from(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<Block> TEMPEST_QUARTZ2 = BLOCKS.register("tempest_quartz2", () -> new Block(Block.Properties.from(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<Block> TEMPEST_QUARTZ3 = BLOCKS.register("tempest_quartz3", () -> new Block(Block.Properties.from(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<Block> CLOUD_BLOCK = BLOCKS.register("cloud_block", CloudBlock::new);
    public static final RegistryObject<Block> ASHBUSH_BLOCK = BLOCKS.register("ashbush_block", AshBushBlock::new);
    public static final RegistryObject<Block> OLDWOOD_PLANKS = BLOCKS.register("oldwood_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLDWOOD_LOG = BLOCKS.register("oldwood_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OLDWOOD_LEAVES = BLOCKS.register("oldwood_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> OLDWOOD_SAPLING = BLOCKS.register("oldwood_sapling", () -> new OldwoodSaplingBlock(() -> new OldwoodTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MAPLEWOOD_PLANKS = BLOCKS.register("maplewood_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAPLEWOOD_LOG = BLOCKS.register("maplewood_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MAPLEWOOD_LEAVES = BLOCKS.register("maplewood_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> MAPLEWOOD_SAPLING = BLOCKS.register("maplewood_sapling", () -> new MaplewoodSaplingBlock(() -> new MaplewoodTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> LOCUSTWOOD_PLANKS = BLOCKS.register("locustwood_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LOCUSTWOOD_LOG = BLOCKS.register("locustwood_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> LOCUSTWOOD_LEAVES = BLOCKS.register("locustwood_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LOCUSTWOOD_SAPLING = BLOCKS.register("locustwood_sapling", () -> new LocustwoodSaplingBlock(() -> new LocustwoodTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> CHARREDWOOD_PLANKS = BLOCKS.register("charredwood_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHARREDWOOD_LOG = BLOCKS.register("charredwood_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CHARREDWOOD_SAPLING = BLOCKS.register("charredwood_sapling", () -> new CharredwoodSaplingBlock(() -> new CharredwoodTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BASALT = BLOCKS.register("basalt", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> BLACKSTONE = BLOCKS.register("blackstone", () -> new Block(Block.Properties.from(Blocks.STONE)));


    public static final RegistryObject<Item> BASALT_ITEM = ITEMS.register("basalt", () -> new BlockItem(BASALT.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> BLACKSTONE_ITEM = ITEMS.register("blackstone", () -> new BlockItem(BLACKSTONE.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () -> new BlockItemBase(SAPPHIRE_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore", () -> new BlockItemBase(SAPPHIRE_ORE.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore_item", () -> new BlockItemBase(COPPER_ORE.get()));
    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore_item", () -> new BlockItemBase(SILVER_ORE.get()));
    public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore_item", () -> new BlockItemBase(TIN_ORE.get()));
    public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore_item", () -> new BlockItemBase(LEAD_ORE.get()));
    public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItemBase(TIN_BLOCK.get()));
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block", () -> new BlockItemBase(LEAD_BLOCK.get()));
    public static final RegistryObject<Item> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItemBase(BRONZE_BLOCK.get()));
    public static final RegistryObject<Item> RED_GRASS_ITEM = ITEMS.register("red_grass", () -> new BlockItemBase(RED_GRASS.get()));
    public static final RegistryObject<Item> OSMENITE_ORE_ITEM = ITEMS.register("osmenite_ore_item", () -> new BlockItem(OSMENITE_ORE.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> ALLOY_FURNACE_ITEM = ITEMS.register("alloy_furnace", () -> new BlockItem(ALLOY_FURNACE.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> EXAMPLE_CHEST_ITEM = ITEMS.register("example_chest", () -> new BlockItem(EXAMPLE_CHEST.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TEMPEST_ORE_ITEM = ITEMS.register("tempest_ore_item", () -> new BlockItem(TEMPEST_ORE.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TEMPEST_QUARTZ_ITEM = ITEMS.register("tempest_quartz", () -> new BlockItem(TEMPEST_QUARTZ.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TEMPEST_QUARTZ2_ITEM = ITEMS.register("tempest_quartz2", () -> new BlockItem(TEMPEST_QUARTZ2.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TEMPEST_OUARTZ3_ITEM = ITEMS.register("tempest_quartz3", () -> new BlockItem(TEMPEST_QUARTZ3.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> CLOUD_BLOCK_ITEM = ITEMS.register("cloud_block_item", () -> new BlockItem(CLOUD_BLOCK.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> OLDWOOD_PLANKS_ITEM = ITEMS.register("oldwood_planks", () -> new BlockItem(OLDWOOD_PLANKS.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> OLDWOOD_LOG_ITEM = ITEMS.register("oldwood_log", () -> new BlockItem(OLDWOOD_LOG.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> OLDWOOD_LEAVES_ITEM = ITEMS.register("oldwood_leaves", () -> new BlockItem(OLDWOOD_LEAVES.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> OLDWOOD_SAPLING_ITEM = ITEMS.register("oldwood_sapling", () -> new BlockItem(OLDWOOD_SAPLING.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> MAPLEWOOD_PLANKS_ITEM = ITEMS.register("maplewood_planks", () -> new BlockItem(MAPLEWOOD_PLANKS.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> MAPLEWOOD_LOG_ITEM = ITEMS.register("maplewood_log", () -> new BlockItem(MAPLEWOOD_LOG.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> MAPLEWOOD_LEAVES_ITEM = ITEMS.register("maplewood_leaves", () -> new BlockItem(MAPLEWOOD_LEAVES.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> MAPLEWOOD_SAPLING_ITEM = ITEMS.register("maplewood_sapling", () -> new BlockItem(MAPLEWOOD_SAPLING.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> LOCUSTWOOD_PLANKS_ITEM = ITEMS.register("locustwood_planks", () -> new BlockItem(LOCUSTWOOD_PLANKS.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> LOCUSTWOOD_LOG_ITEM = ITEMS.register("locustwood_log", () -> new BlockItem(LOCUSTWOOD_LOG.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> LOCUSTWOOD_LEAVES_ITEM = ITEMS.register("locustwood_leaves", () -> new BlockItem(LOCUSTWOOD_LEAVES.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> LOCUSTWOOD_SAPLING_ITEM = ITEMS.register("locustwood_sapling", () -> new BlockItem(LOCUSTWOOD_SAPLING.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> CHARREDWOOD_PLANKS_ITEM = ITEMS.register("charredwood_planks", () -> new BlockItem(CHARREDWOOD_PLANKS.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> CHARREDWOOD_LOG_ITEM = ITEMS.register("charredwood_log", () -> new BlockItem(CHARREDWOOD_LOG.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> ASHBUSH_BLOCK_ITEM = ITEMS.register("ashbush_block", () -> new BlockItem(ASHBUSH_BLOCK.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItem(SILVER_BLOCK.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> OSMENITE_BLOCK_ITEM = ITEMS.register("osmenite_block", () -> new BlockItem(OSMENITE_BLOCK.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> NETHERITE_BLOCK_ITEM = ITEMS.register("netherite_block", () -> new BlockItem(NETHERITE_BLOCK.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TEMPEST_BLOCK_ITEM = ITEMS.register("tempest_block", () -> new BlockItem(TEMPEST_BLOCK.get(), new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> NETHERITE_ORE_ITEM = ITEMS.register("netherite_ore", () -> new BlockItem(NETHERITE_ORE.get(), new Item.Properties().group(CordsenMod.TAB)));

}
