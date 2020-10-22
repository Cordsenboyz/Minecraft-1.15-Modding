package com.cordsenboyz.cordsenmod.objects.items;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;


public class TempestElytra extends ElytraItem {
    public TempestElytra(Properties builder) {
        super(builder);
    }


    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return EquipmentSlotType.CHEST;
    }

}