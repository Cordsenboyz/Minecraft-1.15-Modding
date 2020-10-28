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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ArmorpenetrationEnchantment extends Enchantment {
    public ArmorpenetrationEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        Item item = stack.getItem();
        return true;
    }

    @Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ArmorpenetrationOnHit {

        @SubscribeEvent
        public static void handleLivingDeathEvent(LivingAttackEvent event) {
            if (event.getSource().getTrueSource() instanceof PlayerEntity) {
                DamageSource source = event.getSource();
                Entity target = (Entity) event.getEntity();
                LivingEntity livingEntity = (LivingEntity) target;
                PlayerEntity attacker = (PlayerEntity) event.getSource().getTrueSource();
                if (attacker != null) {
                    if (EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.ARMOR_PENETRATION.get(), attacker.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 1) {
                        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.REINFORCED.get(), livingEntity.getItemStackFromSlot(EquipmentSlotType.LEGS)) == 1 && EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.REINFORCED.get(), livingEntity.getItemStackFromSlot(EquipmentSlotType.CHEST)) == 1){

                        }else{
                            source.setDamageBypassesArmor();
                        }
                    }
                }
            }
        }
    }
}
