package com.cordsenboyz.cordsenmod.init;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    RUBY(CordsenMod.MOD_ID + ":ruby", 25, new int[]{ 3, 6, 7, 3 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, () -> { return Ingredient.fromItems(ItemInit.RUBY.get()); }),
    EMERALD(CordsenMod.MOD_ID + ":emerald", 25, new int[]{ 3, 6, 7, 3 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F, () -> { return Ingredient.fromItems(ItemInit.RUBY.get()); }),
    SAPPHIRE(CordsenMod.MOD_ID + ":sapphire", 10, new int[]{ 4, 7, 8, 4 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, () -> { return Ingredient.fromItems(ItemInit.SAPPHIRE.get()); }),
    OSMENITE(CordsenMod.MOD_ID + ":osmenite", 30, new int[]{ 4, 7, 9, 4 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F, () -> { return Ingredient.fromItems(ItemInit.OSMENITE_INGOT.get()); }),
    NETHERITE(CordsenMod.MOD_ID + ":netherite", 30, new int[]{ 4, 7, 9, 4 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F, () -> { return Ingredient.fromItems(ItemInit.NETHERITE_INGOT.get()); }),
    TEMPEST(CordsenMod.MOD_ID + ":tempest", 30, new int[]{ 4, 7, 9, 4 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F, () -> { return Ingredient.fromItems(ItemInit.TEMPEST_INGOT.get()); }),
    BRONZE(CordsenMod.MOD_ID + ":bronze", 25, new int[]{ 3, 6, 7, 3 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, () -> { return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get()); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()]* this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
