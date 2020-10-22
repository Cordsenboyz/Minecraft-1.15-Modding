package com.cordsenboyz.cordsenmod.objects.items;

import net.minecraft.client.audio.Sound;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.PlaySoundEvent;

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
}
