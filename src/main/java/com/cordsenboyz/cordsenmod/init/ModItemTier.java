package com.cordsenboyz.cordsenmod.init;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    RUBY(2, 1000, 7.0F, 1.0F, 12, () -> {
        return Ingredient.fromItems(ItemInit.RUBY.get());
    }),

    SAPPHIRE(2, 250, 9.0F, 1.0F, 15, () -> {
        return Ingredient.fromItems(ItemInit.SAPPHIRE.get());
    }),

    EMERALD(3, 500, 6.0F, 1.0F, 13, () -> {
        return Ingredient.fromItems(ItemInit.RUBY.get());
    }),

    COPPER(1, 250, 9.0F, 1.0F, 10, () -> {
        return Ingredient.fromItems(ItemInit.COPPER_INGOT.get());
    }),

    SILVER(2, 500, 6.0F, 1.0F, 16, () -> {
        return Ingredient.fromItems(ItemInit.SILVER_INGOT.get());
    }),

    OSMENITE(4, 2031, 9.0F, 1.0F, 16, () -> {
        return Ingredient.fromItems(ItemInit.OSMENITE_INGOT.get());
    }),

    NETHERITE(4, 2031, 9.0F, 1.0F, 16, () -> {
        return Ingredient.fromItems(ItemInit.NETHERITE_INGOT.get());
    }),
    TEMPEST(4, 2031, 9.0F, 1.0F, 16, () -> {
        return Ingredient.fromItems(ItemInit.TEMPEST_INGOT.get());
    }),
    BRONZE(2, 650, 8.0F, 1.0F, 20, () -> {
        return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get());
    });

    private final int harvestlevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvertlevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestlevel = harvertlevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestlevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
