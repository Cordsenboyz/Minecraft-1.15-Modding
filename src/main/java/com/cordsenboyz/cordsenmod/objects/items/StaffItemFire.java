package com.cordsenboyz.cordsenmod.objects.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class StaffItemFire extends SwordItem {

    public StaffItemFire(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(playerIn.isBurning() != true){
            playerIn.setFire(1000);
            if (!playerIn.abilities.isCreativeMode) {
                playerIn.getHeldItemMainhand().damageItem(1, playerIn, PlayerEntity::respawnPlayer);
            }
        return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
    } else {
        return ActionResult.resultPass(playerIn.getHeldItem(handIn));
    }
}


    @Override
    public void addInformation(ItemStack stack, World worldin, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldin, tooltip, flagIn);
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("Call Upon The Nether Too Aid You").applyTextStyle(TextFormatting.RED));
        }else{
            tooltip.add(new TranslationTextComponent("Press Shift for more Information").applyTextStyle(TextFormatting.GRAY));
        }
    }
}
