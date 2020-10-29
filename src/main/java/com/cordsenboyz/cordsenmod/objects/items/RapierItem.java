package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.init.ItemInit;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RapierItem extends SwordItem {
    public RapierItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new TranslationTextComponent("Deals 200% Damage If The Enemy Has No Armor").applyTextStyle(TextFormatting.GRAY));
    }

    @Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class TripleDamageOnHit {


        @SubscribeEvent
        public static void handleLivingDeathEvent(LivingAttackEvent event) {
            if (event.getSource().getTrueSource() instanceof PlayerEntity) {
                DamageSource source = event.getSource();
                Entity target = (Entity) event.getEntity();
                LivingEntity livingEntity = (LivingEntity) target;
                PlayerEntity attacker = (PlayerEntity) event.getSource().getTrueSource();
                if (attacker != null) {
                    if(((LivingEntity) target).getArmorCoverPercentage() == 0.0F) {
                        float f = event.getAmount() * 3;
                    }
                }
            }
        }
    }
}
