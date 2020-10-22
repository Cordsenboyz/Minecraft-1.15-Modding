package com.cordsenboyz.cordsenmod.objects.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class StaffItem extends SwordItem {
    public StaffItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(!worldIn.isRaining()){
            worldIn.getWorldInfo().setClearWeatherTime(0);
            worldIn.getWorldInfo().setRainTime(10000);
            worldIn.getWorldInfo().setThunderTime(10000);
            worldIn.getWorldInfo().setRaining(true);
            worldIn.getWorldInfo().setThundering(true);
            playerIn.getHeldItemMainhand().damageItem(1, playerIn, PlayerEntity::respawnPlayer);

            return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
        } else {
            return ActionResult.resultPass(playerIn.getHeldItem(handIn));
        }

    }
}
