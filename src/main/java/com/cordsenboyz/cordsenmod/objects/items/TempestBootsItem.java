package com.cordsenboyz.cordsenmod.objects.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class TempestBootsItem extends ArmorItem {
    public TempestBootsItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
        super(materialIn, slot, builder);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("Gives Speed While High Up In The Sky").applyTextStyle(TextFormatting.WHITE));
        }else{
            tooltip.add(new TranslationTextComponent("Has Benefits While High Up In The Sky").applyTextStyle(TextFormatting.GRAY));
            tooltip.add(new TranslationTextComponent("Press Shift for more Information").applyTextStyle(TextFormatting.GRAY));
        }
    }
}
