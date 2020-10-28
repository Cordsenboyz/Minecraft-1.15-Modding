package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.init.ItemInit;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.wrapper.PlayerArmorInvWrapper;
import net.minecraftforge.items.wrapper.PlayerMainInvWrapper;

import java.util.List;

public class StaffItemWind extends SwordItem {

    public StaffItemWind(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.isElytraFlying()) {
            ItemStack itemstack = playerIn.getHeldItem(handIn);
            if (!worldIn.isRemote) {
                worldIn.addEntity(new FireworkRocketEntity(worldIn, itemstack, playerIn));
                if (!playerIn.abilities.isCreativeMode) {
                    playerIn.getHeldItemMainhand().damageItem(1, playerIn, PlayerEntity::respawnPlayer);
                }
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
            tooltip.add(new TranslationTextComponent("Call Upon The Wind Too Aid You").applyTextStyle(TextFormatting.WHITE));
        }else{
            tooltip.add(new TranslationTextComponent("Press Shift for more Information").applyTextStyle(TextFormatting.GRAY));
        }
    }
}
