package com.cordsenboyz.cordsenmod.enchantments;

import com.cordsenboyz.cordsenmod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.config.ModConfig;

public class AdvancedProtectionEnchantment extends Enchantment {
    public final AdvancedProtectionEnchantment.Type protectionType;

    public AdvancedProtectionEnchantment(Enchantment.Rarity rarityIn, AdvancedProtectionEnchantment.Type protectionTypeIn, EquipmentSlotType... slots) {
        super(rarityIn, EnchantmentType.ARMOR, slots);
        this.protectionType = protectionTypeIn;
        if (protectionTypeIn == AdvancedProtectionEnchantment.Type.FALL) {
            this.type = EnchantmentType.ARMOR_FEET;
        }

    }

    public int getMinEnchantability(int enchantmentLevel) {
        return this.protectionType.getMinimalEnchantability() + (enchantmentLevel - 1) * this.protectionType.getEnchantIncreasePerLevel();
    }

    public int getMaxEnchantability(int enchantmentLevel) {
        return this.getMinEnchantability(enchantmentLevel) + this.protectionType.getEnchantIncreasePerLevel();
    }

    public int getMaxLevel() {
        return 4;
    }

    public int calcModifierDamage(int level, DamageSource source) {
        if (source.canHarmInCreative()) {
            return 0;
        } else if (this.protectionType == AdvancedProtectionEnchantment.Type.ALL) {
            return level * 2;
        } else if (this.protectionType == AdvancedProtectionEnchantment.Type.FIRE && source.isFireDamage()) {
            return level * 3;
        } else if (this.protectionType == AdvancedProtectionEnchantment.Type.FALL && source == DamageSource.FALL) {
            return level * 5;
        } else if (this.protectionType == AdvancedProtectionEnchantment.Type.EXPLOSION && source.isExplosion()) {
            return level * 3;
        } else if (this.protectionType == AdvancedProtectionEnchantment.Type.MAGICAL && source.isMagicDamage()){
            return level * 3;
        } else {
            return this.protectionType == AdvancedProtectionEnchantment.Type.PROJECTILE && source.isProjectile() ? level * 3 : 0;
        }
    }

    public boolean canApplyTogether(Enchantment ench) {
        if (ench instanceof AdvancedProtectionEnchantment) {
            AdvancedProtectionEnchantment protectionenchantment = (AdvancedProtectionEnchantment)ench;
            ProtectionEnchantment normalprotectionEnchantment = (ProtectionEnchantment)ench;
            if (this.protectionType == protectionenchantment.protectionType) {
                return false;
            } else {
                return this.protectionType == AdvancedProtectionEnchantment.Type.FALL || protectionenchantment.protectionType == AdvancedProtectionEnchantment.Type.FALL;
            }
        } else {
            return super.canApplyTogether(ench);
        }
    }

    public static int getFireTimeForEntity(LivingEntity p_92093_0_, int p_92093_1_) {
        int i = EnchantmentHelper.getMaxEnchantmentLevel(EnchantmentInit.ADVANCED_FIRE_PROTECTION.get(), p_92093_0_);
        if (i > 0) {
            p_92093_1_ -= MathHelper.floor((float)p_92093_1_ * (float)i * 0.15F);
        }

        return p_92093_1_;
    }

    public static double getBlastDamageReduction(LivingEntity entityLivingBaseIn, double damage) {
        int i = EnchantmentHelper.getMaxEnchantmentLevel(EnchantmentInit.ADVANCED_BLAST_PROTECTION.get(), entityLivingBaseIn);
        if (i > 0) {
            damage -= (double)MathHelper.floor(damage * (double)((float)i * 0.15F));
        }

        return damage;
    }

    public static enum Type {
        ALL("all", 5, 16),
        FIRE("fire", 15, 13),
        FALL("fall", 10, 11),
        EXPLOSION("explosion", 10, 13),
        PROJECTILE("projectile", 8, 11),
        MAGICAL("magical", 8, 11);

        private final String typeName;
        private final int minEnchantability;
        private final int levelCost;

        private Type(String p_i48839_3_, int p_i48839_4_, int p_i48839_5_) {
            this.typeName = p_i48839_3_;
            this.minEnchantability = p_i48839_4_;
            this.levelCost = p_i48839_5_;
        }

        public int getMinimalEnchantability() {
            return this.minEnchantability;
        }

        public int getEnchantIncreasePerLevel() {
            return this.levelCost;
        }
    }
}