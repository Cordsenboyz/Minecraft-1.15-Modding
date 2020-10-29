package com.cordsenboyz.cordsenmod.enchantments;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.init.EnchantmentInit;
import net.minecraft.advancements.criterion.EntityHurtPlayerTrigger;
import net.minecraft.advancements.criterion.PlayerHurtEntityTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Util;
import net.minecraft.util.datafix.fixes.EntityHealth;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.enchanting.EnchantmentLevelSetEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class LeechEnchantment extends Enchantment {
    public LeechEnchantment(Rarity rarityIn, EnchantmentType WEAPON, EquipmentSlotType[] slots) {
        super(rarityIn, EnchantmentType.WEAPON, slots);
    }

    @Override
    public int getMaxLevel() {
        return 2;
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
    public static class LeechOnHit {

        @SubscribeEvent
        public static void handleLivingDeathEvent(LivingAttackEvent event) {
            if (event.getSource().getTrueSource() instanceof PlayerEntity) {
                DamageSource source = event.getSource();
                PlayerEntity attacker = (PlayerEntity) event.getSource().getTrueSource();
                if (attacker != null) {
                    if(EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.LEECH.get(), attacker.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) > 1){
                    attacker.heal(event.getAmount() / 2);
                    }else if (EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.LEECH.get(), attacker.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) > 0){
                        attacker.heal(event.getAmount() / 4);
                    }

                }
            }
        }
    }
}


