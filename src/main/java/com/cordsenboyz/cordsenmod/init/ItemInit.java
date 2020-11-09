package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.objects.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CordsenMod.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> OSMENITE_INGOT = ITEMS.register("osmenite_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> NETHERITE_INGOT = ITEMS.register("netherite_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> TEMPEST_INGOT = ITEMS.register("tempest_ingot", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> DOUBLE_STRING = ITEMS.register("double_string", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> STONE_OF_THE_SEA = ITEMS.register("stone_of_the_sea", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> STONE_OF_HELLFIRE = ITEMS.register("stone_of_hellfire", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> STONE_OF_TEMPEST = ITEMS.register("stone_of_tempest", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> RING_OF_RESISTANCE = ITEMS.register("ring_of_resistance", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> RING_OF_REGENERATION = ITEMS.register("ring_of_regeneration", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> RING_OF_SPEED = ITEMS.register("ring_of_speed", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> RING_OF_HASTE = ITEMS.register("ring_of_haste", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> RING_OF_STRENGTH = ITEMS.register("ring_of_strength", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<Item> RING_OF_LUCK = ITEMS.register("ring_of_luck", () -> new Item(new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<StaffItem> STAFF_RAIN = ITEMS.register("staff_rain", () ->
            new StaffItem(ModItemTier.RUBY, 0, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<StaffItemWind> STAFF_WIND = ITEMS.register("staff_wind", () ->
            new StaffItemWind(ModItemTier.RUBY, 0, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<StaffItemFire> STAFF_FIRE = ITEMS.register("staff_fire", () ->
            new StaffItemFire(ModItemTier.RUBY, 0, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));

    // Sword
    public static final RegistryObject<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () ->
            new SwordItem(ModItemTier.BRONZE, 5, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> TEMPEST_SWORD = ITEMS.register("tempest_sword", () ->
            new TempestSwordItem(ModItemTier.TEMPEST, 7, -2.2F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> NETHERITE_SWORD = ITEMS.register("netherite_sword", () ->
            new NetheriteSwordItem(ModItemTier.NETHERITE, 7, -2.2F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> OSMENITE_SWORD = ITEMS.register("osmenite_sword", () ->
            new OsmeniteSwordItem(ModItemTier.OSMENITE, 7, -2.2F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
            new SwordItem(ModItemTier.SILVER, 5, -2.2F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () ->
            new SwordItem(ModItemTier.COPPER, 5, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ModItemTier.EMERALD, 5, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SwordItem(ModItemTier.SAPPHIRE, 7, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 5, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));

    // Pickaxe
    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () ->
            new PickaxeItem(ModItemTier.BRONZE, 1, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> TEMPEST_PICKAXE = ITEMS.register("tempest_pickaxe", () ->
            new TempestPickaxeItem(ModItemTier.TEMPEST, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> NETHERITE_PICKAXE = ITEMS.register("netherite_pickaxe", () ->
            new NetheritePickaxeItem(ModItemTier.NETHERITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> OSMENITE_PICKAXE = ITEMS.register("osmenite_pickaxe", () ->
            new OsmenitePickaxeItem(ModItemTier.OSMENITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(ModItemTier.SILVER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(ModItemTier.COPPER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () ->
            new PickaxeItem(ModItemTier.SAPPHIRE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));

    // Axe
    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () ->
            new AxeItem(ModItemTier.BRONZE, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> TEMPEST_AXE = ITEMS.register("tempest_axe", () ->
            new TempestAxeItem(ModItemTier.TEMPEST, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> NETHERITE_AXE = ITEMS.register("netherite_axe", () ->
            new NetheriteAxeItem(ModItemTier.NETHERITE, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> OSMENITE_AXE = ITEMS.register("osmenite_axe", () ->
            new OsmeniteAxeItem(ModItemTier.OSMENITE, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () ->
            new AxeItem(ModItemTier.SILVER, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () ->
            new AxeItem(ModItemTier.COPPER, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModItemTier.EMERALD, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () ->
            new AxeItem(ModItemTier.SAPPHIRE, 8, -2.6F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB2)));

    // Shovel
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () ->
            new ShovelItem(ModItemTier.BRONZE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> TEMPEST_SHOVEL = ITEMS.register("tempest_shovel", () ->
            new TempestShovelItem(ModItemTier.TEMPEST, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> NETHERITE_SHOVEL = ITEMS.register("netherite_shovel", () ->
            new NetheriteShovelItem(ModItemTier.NETHERITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> OSMENITE_SHOVEL = ITEMS.register("osmenite_shovel", () ->
            new OsmeniteShovelItem(ModItemTier.OSMENITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
            new ShovelItem(ModItemTier.SILVER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->
            new ShovelItem(ModItemTier.COPPER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () ->
            new ShovelItem(ModItemTier.SAPPHIRE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));

    // Hoe
    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () ->
            new HoeItem(ModItemTier.BRONZE, -2.4F,  new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> TEMPEST_HOE = ITEMS.register("tempest_hoe", () ->
            new TempestHoeItem(ModItemTier.TEMPEST, -2.4F,  new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> NETHERITE_HOE = ITEMS.register("netherite_hoe", () ->
            new NetheriteHoeItem(ModItemTier.NETHERITE, -2.4F,  new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> OSMENITE_HOE = ITEMS.register("osmenite_hoe", () ->
            new OsmeniteHoeItem(ModItemTier.OSMENITE, -2.4F,  new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () ->
            new HoeItem(ModItemTier.SILVER, -2.4F,  new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () ->
            new HoeItem(ModItemTier.COPPER, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new HoeItem(ModItemTier.EMERALD, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () ->
            new HoeItem(ModItemTier.SAPPHIRE, -2.4F,  new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, -2.4F, new Item.Properties().group(CordsenMod.TAB2)));

    // Hammers
    public static final RegistryObject<PickaxeItem> OSMENITE_HAMMER = ITEMS.register("osmenite_hammer", () ->
            new HammerItem(ModItemTier.OSMENITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () ->
            new HammerItem(ModItemTier.NETHERITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> TEMPEST_HAMMER = ITEMS.register("tempest_hammer", () ->
            new HammerItem(ModItemTier.TEMPEST, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> BRONZE_HAMMER = ITEMS.register("bronze_hammer", () ->
            new HammerItem(ModItemTier.BRONZE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> COPPER_HAMMER = ITEMS.register("copper_hammer", () ->
            new HammerItem(ModItemTier.COPPER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () ->
            new HammerItem(ItemTier.DIAMOND, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> RUBY_HAMMER = ITEMS.register("ruby_hammer", () ->
            new HammerItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> EMERALD_HAMMER = ITEMS.register("emerald_hammer", () ->
            new HammerItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_HAMMER = ITEMS.register("sapphire_hammer", () ->
            new HammerItem(ModItemTier.SAPPHIRE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> IRON_HAMMER = ITEMS.register("iron_hammer", () ->
            new HammerItem(ItemTier.IRON, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> GOLD_HAMMER = ITEMS.register("gold_hammer", () ->
            new HammerItem(ItemTier.GOLD, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<PickaxeItem> SILVER_HAMMER = ITEMS.register("silver_hammer", () ->
            new HammerItem(ModItemTier.SILVER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB2)));

    //Greastword
    public static final RegistryObject<SwordItem> OSMENITE_GREATSWORD = ITEMS.register("osmenite_greatsword", () ->
            new GreastswordItem(ModItemTier.OSMENITE, 15, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () ->
            new GreastswordItem(ModItemTier.NETHERITE, 15, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> TEMPEST_GREATSWORD = ITEMS.register("tempest_greatsword", () ->
            new GreastswordItem(ModItemTier.TEMPEST, 15, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> BRONZE_GREATSWORD = ITEMS.register("bronze_greatsword", () ->
            new GreastswordItem(ModItemTier.BRONZE, 10, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> COPPER_GREATSWORD = ITEMS.register("copper_greatsword", () ->
            new GreastswordItem(ModItemTier.COPPER, 11, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () ->
            new GreastswordItem(ItemTier.DIAMOND, 10, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> RUBY_GREATSWORD = ITEMS.register("ruby_greatsword", () ->
            new GreastswordItem(ModItemTier.RUBY, 11, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> EMERALD_GREATSWORD = ITEMS.register("emerald_greatsword", () ->
            new GreastswordItem(ModItemTier.EMERALD, 10, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> SAPPHIRE_GREATSWORD = ITEMS.register("sapphire_greatsword", () ->
            new GreastswordItem(ModItemTier.SAPPHIRE, 15, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () ->
            new GreastswordItem(ItemTier.IRON, 9, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> GOLD_GREATSWORD = ITEMS.register("gold_greatsword", () ->
            new GreastswordItem(ItemTier.GOLD, 7 , -2.9F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> SILVER_GREATSWORD = ITEMS.register("silver_greatsword", () ->
            new GreastswordItem(ModItemTier.SILVER, 10, -2.9F, new Item.Properties().group(CordsenMod.TAB2)));

    //Rapier
    public static final RegistryObject<SwordItem> OSMENITE_RAPIER = ITEMS.register("osmenite_rapier", () ->
            new RapierItem(ModItemTier.OSMENITE, 3, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> NETHERITE_RAPIER = ITEMS.register("netherite_rapier", () ->
            new RapierItem(ModItemTier.NETHERITE, 3, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> TEMPEST_RAPIER = ITEMS.register("tempest_rapier", () ->
            new RapierItem(ModItemTier.TEMPEST, 3, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> BRONZE_RAPIER = ITEMS.register("bronze_rapier", () ->
            new RapierItem(ModItemTier.BRONZE, 2, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> COPPER_RAPIER = ITEMS.register("copper_rapier", () ->
            new RapierItem(ModItemTier.COPPER, 2, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> DIAMOND_RAPIER = ITEMS.register("diamond_rapier", () ->
            new RapierItem(ItemTier.DIAMOND, 0, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> RUBY_RAPIER = ITEMS.register("ruby_rapier", () ->
            new RapierItem(ModItemTier.RUBY, 2, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> EMERALD_RAPIER = ITEMS.register("emerald_rapier", () ->
            new RapierItem(ModItemTier.EMERALD, 2, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> SAPPHIRE_RAPIER = ITEMS.register("sapphire_rapier", () ->
            new RapierItem(ModItemTier.SAPPHIRE, 3, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> IRON_RAPIER = ITEMS.register("iron_rapier", () ->
            new RapierItem(ItemTier.IRON, 0, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> GOLD_RAPIER = ITEMS.register("gold_rapier", () ->
            new RapierItem(ItemTier.GOLD, 1 , -2.0F, new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<SwordItem> SILVER_RAPIER = ITEMS.register("silver_rapier", () ->
            new RapierItem(ModItemTier.SILVER, 2, -2.0F, new Item.Properties().group(CordsenMod.TAB2)));

    //Dagger
    public static final RegistryObject<SwordItem> OSMENITE_DAGGER = ITEMS.register("osmenite_dagger", () ->
            new DaggerItem(ModItemTier.OSMENITE, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> NETHERITE_DAGGER = ITEMS.register("netherite_dagger", () ->
            new DaggerItem(ModItemTier.NETHERITE, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> TEMPEST_DAGGER = ITEMS.register("tempest_dagger", () ->
            new DaggerItem(ModItemTier.TEMPEST, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> BRONZE_DAGGER = ITEMS.register("bronze_dagger", () ->
            new DaggerItem(ModItemTier.BRONZE, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> SILVER_DAGGER = ITEMS.register("silver_dagger", () ->
            new DaggerItem(ModItemTier.SILVER, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> COPPER_DAGGER = ITEMS.register("copper_dagger", () ->
            new DaggerItem(ModItemTier.COPPER, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> RUBY_DAGGER = ITEMS.register("ruby_dagger", () ->
            new DaggerItem(ModItemTier.RUBY, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> EMERALD_DAGGER = ITEMS.register("emerald_dagger", () ->
            new DaggerItem(ModItemTier.EMERALD, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> SAPPHIRE_DAGGER = ITEMS.register("sapphire_dagger", () ->
            new DaggerItem(ModItemTier.SAPPHIRE, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> DIAMOND_DAGGER = ITEMS.register("diamond_dagger", () ->
            new DaggerItem(ItemTier.DIAMOND, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> IRON_DAGGER = ITEMS.register("iron_dagger", () ->
            new DaggerItem(ItemTier.IRON, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<SwordItem> GOLD_DAGGER = ITEMS.register("gold_dagger", () ->
            new DaggerItem(ItemTier.GOLD, 0, -0.9F, new Item.Properties().group(CordsenMod.TAB)));

    //Food
    public static final RegistryObject<FoodApplePoison> POISON_APPLE = ITEMS.register("poison_apple", () -> new FoodApplePoison(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<FoodAppleDiamond> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new FoodAppleDiamond(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<FoodAppleRuby> RUBY_APPLE = ITEMS.register("ruby_apple", () -> new FoodAppleRuby(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<FoodAppleSapphire> SAPPHIRE_APPLE = ITEMS.register("sapphire_apple", () -> new FoodAppleSapphire(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<FoodAppleEmerald> EMERALD_APPLE = ITEMS.register("emerald_apple", () -> new FoodAppleEmerald(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<FoodHotdog> HOTDOG = ITEMS.register("hotdog", () -> new FoodHotdog(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<FoodSausage> SAUSAGE = ITEMS.register("sausage", () -> new FoodSausage(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<FoodTomato> TOMATO = ITEMS.register("tomato", () -> new FoodTomato(new Item.Properties().group(CordsenMod.TAB)));

    // Bow
    public static final RegistryObject<BowItem> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new NetheriteBowItem(new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<BowItem> TEMPEST_BOW = ITEMS.register("tempest_bow", () -> new TempestBowItem(new Item.Properties().group(CordsenMod.TAB2)));
    public static final RegistryObject<BowItem> OSMENITE_BOW = ITEMS.register("osmenite_bow", () -> new OsmeniteBowItem(new Item.Properties().group(CordsenMod.TAB2)));

    //Elytra
    public static final RegistryObject<ElytraItem> TEMPEST_ELYTRA = ITEMS.register("tempest_elytra", () -> new TempestElytra(new Item.Properties().maxDamage(400).group(CordsenMod.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> OSMENITE_HELMET = ITEMS.register("osmenite_helmet", () ->
            new OsmeniteArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> OSMENITE_CHESTPLATE = ITEMS.register("osmenite_chestplate", () ->
            new OsmeniteArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> OSMENITE_LEGGINGS = ITEMS.register("osmenite_leggings", () ->
            new OsmeniteArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> OSMENITE_BOOTS = ITEMS.register("osmenite_boots", () ->
            new OsmeniteArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> NETHERITE_HELMET = ITEMS.register("netherite_helmet", () ->
            new NetheriteArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> NETHERITE_CHESTPLATE = ITEMS.register("netherite_chestplate", () ->
            new NetheriteArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> NETHERITE_LEGGINGS = ITEMS.register("netherite_leggings", () ->
            new NetheriteArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> NETHERITE_BOOTS = ITEMS.register("netherite_boots", () ->
            new NetheriteArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> TEMPEST_HELMET = ITEMS.register("tempest_helmet", () ->
            new TempestHelmetItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> TEMPEST_CHESTPLATE = ITEMS.register("tempest_chestplate", () ->
            new TempestChestplateItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> TEMPEST_LEGGINGS = ITEMS.register("tempest_leggings", () ->
            new TempestLeggingsItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB1)));
    public static final RegistryObject<ArmorItem> TEMPEST_BOOTS = ITEMS.register("tempest_boots", () ->
            new TempestBootsItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB1)));

}
