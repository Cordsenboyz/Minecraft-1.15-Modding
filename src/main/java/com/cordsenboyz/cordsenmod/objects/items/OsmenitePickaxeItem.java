package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.potion.EffectUtils;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import javax.annotation.Nullable;
import java.util.List;

public class OsmenitePickaxeItem extends PickaxeItem {
    public OsmenitePickaxeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);

    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("Has no Underwater Penalties").applyTextStyle(TextFormatting.BLUE));
        } else {
            tooltip.add(new TranslationTextComponent("Has Benefits While Under Water").applyTextStyle(TextFormatting.GRAY));
            tooltip.add(new TranslationTextComponent("Press Shift for more Information").applyTextStyle(TextFormatting.GRAY));
        }
    }

    @SubscribeEvent
    public static void OsmenitePickaxe(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntityLiving() instanceof PlayerEntity) {
            World world = event.getEntity().world;
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            BlockState state = (BlockState) player.getBlockState();
            float f = player.inventory.getDestroySpeed(state);
            if (player.areEyesInFluid(FluidTags.WATER) && player.getHeldItemMainhand().getItem() != ItemInit.OSMENITE_PICKAXE.get()) {
                f /= 5.0F;
            }
        }

    }

}