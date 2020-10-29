package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.enchantments.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, CordsenMod.MOD_ID);

    public static final RegistryObject<Enchantment> UPSTEP = ENCHANTMENTS.register("upstep", () -> new UpStepEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> LEECH = ENCHANTMENTS.register("leech", () -> new LeechEnchantment(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> ARMOR_PENETRATION = ENCHANTMENTS.register("armor_penetration", () -> new ArmorpenetrationEnchantment(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> ADVANCED_SHARPNESS = ENCHANTMENTS.register("advanced_sharpness", () -> new AdvancedDamageEnchantment(Enchantment.Rarity.RARE,  0, EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> ADVANCED_SMITE = ENCHANTMENTS.register("advanced_smite", () -> new AdvancedDamageEnchantment(Enchantment.Rarity.RARE, 1, EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> ADVANCED_BANEOFARTHROPODS = ENCHANTMENTS.register("advanced_baneofarthropods", () -> new AdvancedDamageEnchantment(Enchantment.Rarity.RARE, 2, EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> ADVANCED_PROTECTION = ENCHANTMENTS.register("advanced_protection", () -> new AdvancedProtectionEnchantment(Enchantment.Rarity.VERY_RARE, AdvancedProtectionEnchantment.Type.ALL, new EquipmentSlotType[]{EquipmentSlotType.FEET, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.HEAD}));
    public static final RegistryObject<Enchantment> ADVANCED_BLAST_PROTECTION = ENCHANTMENTS.register("advanced_blast_protection", () -> new AdvancedProtectionEnchantment(Enchantment.Rarity.VERY_RARE, AdvancedProtectionEnchantment.Type.EXPLOSION, new EquipmentSlotType[]{EquipmentSlotType.FEET, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.HEAD}));
    public static final RegistryObject<Enchantment> ADVANCED_FIRE_PROTECTION = ENCHANTMENTS.register("advanced_fire_protection", () -> new AdvancedProtectionEnchantment(Enchantment.Rarity.VERY_RARE, AdvancedProtectionEnchantment.Type.FIRE, new EquipmentSlotType[]{EquipmentSlotType.FEET, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.HEAD}));
    public static final RegistryObject<Enchantment> REINFORCED = ENCHANTMENTS.register("reinforced", () -> new ReinforcedEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, new EquipmentSlotType[]{EquipmentSlotType.FEET, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.HEAD}));
    public static final RegistryObject<Enchantment> ADVANCED_FEATHERFALLING = ENCHANTMENTS.register("advanced_featherfalling", () -> new AdvancedProtectionEnchantment(Enchantment.Rarity.VERY_RARE, AdvancedProtectionEnchantment.Type.FALL, new EquipmentSlotType[]{EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> WITHER = ENCHANTMENTS.register("wither", () -> new WitherEnchantment(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> ADVANCED_PROJECTILE_PROTECTION = ENCHANTMENTS.register("advanced_projectile_protection", () -> new AdvancedProtectionEnchantment(Enchantment.Rarity.VERY_RARE, AdvancedProtectionEnchantment.Type.PROJECTILE, new EquipmentSlotType[]{EquipmentSlotType.FEET, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.HEAD}));
    public static final RegistryObject<Enchantment> ENVENOMED = ENCHANTMENTS.register("envenomed", () -> new EnvenomedEnchantment(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> ADVANCED_MAGIC_PROTECTION = ENCHANTMENTS.register("advanced_magic_protection", () -> new AdvancedProtectionEnchantment(Enchantment.Rarity.VERY_RARE, AdvancedProtectionEnchantment.Type.MAGICAL, new EquipmentSlotType[]{EquipmentSlotType.FEET, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.HEAD}));

}
