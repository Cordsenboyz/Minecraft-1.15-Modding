package com.cordsenboyz.cordsenmod.client;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

public class ElytraNBT {
    public static final String ELYTRA_TAG = "colytra:ElytraUpgrade";

    public ElytraNBT() {
    }
    public static boolean hasUpgrade(ItemStack stack) {
        return stack.getChildTag("colytra:ElytraUpgrade") != null;
    }

    public static ItemStack getElytra(ItemStack stack) {
        CompoundNBT tag = stack.getChildTag("colytra:ElytraUpgrade");
        return tag != null ? ItemStack.read(tag) : ItemStack.EMPTY;
    }

    public static void setElytra(ItemStack chestStack, ItemStack elytraStack) {
        chestStack.getOrCreateTag().put("colytra:ElytraUpgrade", elytraStack.write(new CompoundNBT()));
    }
    public static void damageElytra(LivingEntity livingEntity, ItemStack chestStack, ItemStack elytraStack, int amount) {
                elytraStack.damageItem(amount, livingEntity, (damager) -> {
                    damager.sendBreakAnimation(EquipmentSlotType.CHEST);
                });
        setElytra(chestStack, elytraStack);
    }

    public static boolean isUseable(ItemStack chestStack, ItemStack elytraStack) {
        if (elytraStack.isEmpty()) {
            return false;
            }else{
                return true;
            }
        }
    }

