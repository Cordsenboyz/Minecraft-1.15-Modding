package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.objects.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

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



    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 4, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SwordItem(ModItemTier.SAPPHIRE, 6, -2.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () ->
            new PickaxeItem(ModItemTier.SAPPHIRE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () ->
            new AxeItem(ModItemTier.SAPPHIRE, 8, -2.6F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () ->
            new ShovelItem(ModItemTier.SAPPHIRE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () ->
            new HoeItem(ModItemTier.SAPPHIRE, -2.4F,  new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ModItemTier.EMERALD, 5, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModItemTier.EMERALD, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new HoeItem(ModItemTier.EMERALD, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () ->
            new SwordItem(ModItemTier.COPPER, 4, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(ModItemTier.COPPER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () ->
            new AxeItem(ModItemTier.COPPER, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->
            new ShovelItem(ModItemTier.COPPER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () ->
            new HoeItem(ModItemTier.COPPER, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
            new SwordItem(ModItemTier.SILVER, 5, -2.2F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(ModItemTier.SILVER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () ->
            new AxeItem(ModItemTier.SILVER, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
            new ShovelItem(ModItemTier.SILVER, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () ->
            new HoeItem(ModItemTier.SILVER, -2.4F,  new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> OSMENITE_SWORD = ITEMS.register("osmenite_sword", () ->
            new SwordItem(ModItemTier.OSMENITE, 6, -2.2F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> OSMENITE_PICKAXE = ITEMS.register("osmenite_pickaxe", () ->
            new PickaxeItem(ModItemTier.OSMENITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> OSMENITE_AXE = ITEMS.register("osmenite_axe", () ->
            new AxeItem(ModItemTier.OSMENITE, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<ShovelItem> OSMENITE_SHOVEL = ITEMS.register("osmenite_shovel", () ->
            new ShovelItem(ModItemTier.OSMENITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> OSMENITE_HOE = ITEMS.register("osmenite_hoe", () ->
            new HoeItem(ModItemTier.OSMENITE, -2.4F,  new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> NETHERITE_SWORD = ITEMS.register("netherite_sword", () ->
            new SwordItem(ModItemTier.NETHERITE, 6, -2.2F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> NETHERITE_PICKAXE = ITEMS.register("netherite_pickaxe", () ->
            new PickaxeItem(ModItemTier.NETHERITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> NETHERITE_AXE = ITEMS.register("netherite_axe", () ->
            new AxeItem(ModItemTier.NETHERITE, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<ShovelItem> NETHERITE_SHOVEL = ITEMS.register("netherite_shovel", () ->
            new ShovelItem(ModItemTier.NETHERITE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> NETHERITE_HOE = ITEMS.register("netherite_hoe", () ->
            new HoeItem(ModItemTier.NETHERITE, -2.4F,  new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> TEMPEST_SWORD = ITEMS.register("tempest_sword", () ->
            new SwordItem(ModItemTier.TEMPEST, 6, -2.2F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> TEMPEST_PICKAXE = ITEMS.register("tempest_pickaxe", () ->
            new PickaxeItem(ModItemTier.TEMPEST, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> TEMPEST_AXE = ITEMS.register("tempest_axe", () ->
            new AxeItem(ModItemTier.TEMPEST, 8, -3.0F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<ShovelItem> TEMPEST_SHOVEL = ITEMS.register("tempest_shovel", () ->
            new ShovelItem(ModItemTier.TEMPEST, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> TEMPEST_HOE = ITEMS.register("tempest_hoe", () ->
            new HoeItem(ModItemTier.TEMPEST, -2.4F,  new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<StaffItem> STAFF_RAIN = ITEMS.register("staff_rain", () ->
            new StaffItem(ModItemTier.RUBY, 0, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<StaffItemWind> STAFF_WIND = ITEMS.register("staff_wind", () ->
            new StaffItemWind(ModItemTier.RUBY, 0, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () ->
            new SwordItem(ModItemTier.BRONZE, 5, -2.4F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () ->
            new PickaxeItem(ModItemTier.BRONZE, 1, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () ->
            new AxeItem(ModItemTier.BRONZE, 7, -3.0F, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () ->
            new ShovelItem(ModItemTier.BRONZE, 0, -2.8F, new Item.Properties().group(CordsenMod.TAB)));

    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () ->
            new HoeItem(ModItemTier.BRONZE, -2.4F,  new Item.Properties().group(CordsenMod.TAB)));

    // Bow
    public static final RegistryObject<BowItem> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new NetheriteBowItem(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<BowItem> TEMPEST_BOW = ITEMS.register("tempest_bow", () -> new TempestBowItem(new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<BowItem> OSMENITE_BOW = ITEMS.register("osmenite_bow", () -> new OsmeniteBowItem(new Item.Properties().group(CordsenMod.TAB)));

    //Elytra
    public static final RegistryObject<ElytraItem> TEMPEST_ELYTRA = ITEMS.register("tempest_elytra", () -> new TempestElytra(new Item.Properties().maxDamage(400).group(CordsenMod.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () ->
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> OSMENITE_HELMET = ITEMS.register("osmenite_helmet", () ->
            new ArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> OSMENITE_CHESTPLATE = ITEMS.register("osmenite_chestplate", () ->
            new ArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> OSMENITE_LEGGINGS = ITEMS.register("osmenite_leggings", () ->
            new ArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> OSMENITE_BOOTS = ITEMS.register("osmenite_boots", () ->
            new ArmorItem(ModArmorMaterial.OSMENITE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> NETHERITE_HELMET = ITEMS.register("netherite_helmet", () ->
            new ArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> NETHERITE_CHESTPLATE = ITEMS.register("netherite_chestplate", () ->
            new ArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> NETHERITE_LEGGINGS = ITEMS.register("netherite_leggings", () ->
            new ArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> NETHERITE_BOOTS = ITEMS.register("netherite_boots", () ->
            new ArmorItem(ModArmorMaterial.NETHERITE, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> TEMPEST_HELMET = ITEMS.register("tempest_helmet", () ->
            new ArmorItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.HEAD, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> TEMPEST_CHESTPLATE = ITEMS.register("tempest_chestplate", () ->
            new ArmorItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.CHEST, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> TEMPEST_LEGGINGS = ITEMS.register("tempest_leggings", () ->
            new ArmorItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.LEGS, new Item.Properties().group(CordsenMod.TAB)));
    public static final RegistryObject<ArmorItem> TEMPEST_BOOTS = ITEMS.register("tempest_boots", () ->
            new ArmorItem(ModArmorMaterial.TEMPEST, EquipmentSlotType.FEET, new Item.Properties().group(CordsenMod.TAB)));

}
