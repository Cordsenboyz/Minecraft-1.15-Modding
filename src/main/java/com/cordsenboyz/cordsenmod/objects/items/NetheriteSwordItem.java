package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.init.ItemInit;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class NetheriteSwordItem extends SwordItem {
    public NetheriteSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("Gives Strength While In Hot Areas").applyTextStyle(TextFormatting.RED));
        }else{
            tooltip.add(new TranslationTextComponent("Has Benefits While In Hot Areas").applyTextStyle(TextFormatting.GRAY));
            tooltip.add(new TranslationTextComponent("Press Shift for more Information").applyTextStyle(TextFormatting.GRAY));
        }
    }
}
