package com.cordsenboyz.cordsenmod.objects.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class TempestSwordItem extends SwordItem {
    public TempestSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("Gives Strength While High Up In The Sky").applyTextStyle(TextFormatting.WHITE));
        }else{
            tooltip.add(new TranslationTextComponent("Has Benefits While High Up In The Sky").applyTextStyle(TextFormatting.GRAY));
            tooltip.add(new TranslationTextComponent("Press Shift for more Information").applyTextStyle(TextFormatting.GRAY));
        }
    }
}
