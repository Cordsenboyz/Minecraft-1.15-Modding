package com.cordsenboyz.cordsenmod.enchantments;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.init.EnchantmentInit;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class UpStepEnchantment extends Enchantment {
    public UpStepEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
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
    protected boolean canApplyTogether(Enchantment ench) {
        return ench.equals(Enchantments.DEPTH_STRIDER) ? false : true;
    }
    @Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class UpstepEquipped {

        @SubscribeEvent
        public static void doStuff(TickEvent.PlayerTickEvent event) {
            PlayerEntity playerIn = event.player;
            World worldIn = event.player.world;
            if (playerIn.hasItemInSlot(EquipmentSlotType.FEET)
                    && EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.UPSTEP.get(),
                    playerIn.getItemStackFromSlot(EquipmentSlotType.FEET)) > 0) {
                if(playerIn.isCrouching()){
                    if(worldIn.getBlockState(playerIn.getPosition().down()).getBlock() == Blocks.BARRIER){
                        worldIn.setBlockState(playerIn.getPosition(), Blocks.AIR.getDefaultState());
                        worldIn.setBlockState(playerIn.getPosition().down().down(), Blocks.BARRIER.getDefaultState());
                    }
                }else{
                    worldIn.setBlockState(playerIn.getPosition().down(), Blocks.BARRIER.getDefaultState());
                }
            }

        }
    }
}
