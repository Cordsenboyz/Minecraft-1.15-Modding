package com.cordsenboyz.cordsenmod.enchantments;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ElementalEnchantment extends Enchantment {
    public ElementalEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, EnchantmentType.WEAPON, slots);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }
    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return 30;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 10;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }



    @Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ElementalOnHit {

        @SubscribeEvent
        public static void handleLivingDeathEvent(LivingAttackEvent event) {
            if (event.getSource().getTrueSource() instanceof PlayerEntity) {
                DamageSource source = event.getSource();
                Entity target = event.getEntity();
                LivingEntity livingEntity = (LivingEntity)target;
                PlayerEntity attacker = (PlayerEntity) event.getSource().getTrueSource();
                if (attacker != null) {
                    if (EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.ELEMENTAL.get(), attacker.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 1) {
                        int pow=(int)(Math.random()*4+1);
                        if (pow==1)
                        livingEntity.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 100, 1));
                        if (pow==2)
                        livingEntity.addPotionEffect(new EffectInstance(Effects.POISON, 100, 1));
                        if (pow==3)
                        livingEntity.addPotionEffect(new EffectInstance(Effects.WITHER, 100, 1));
                        if (pow==4)
                        livingEntity.setFire(100);
                    }
                }
            }
        }
    }
}