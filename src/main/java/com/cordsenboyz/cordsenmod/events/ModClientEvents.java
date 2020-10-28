package com.cordsenboyz.cordsenmod.events;

import com.cordsenboyz.cordsenmod.CordsenMod;
import com.cordsenboyz.cordsenmod.init.ItemInit;
import com.cordsenboyz.cordsenmod.init.ModItemTier;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerFlyableFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CordsenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModClientEvents {



    @SubscribeEvent
    public static void FullOsmeniteDolphin(LivingEvent.LivingUpdateEvent event){
        if(event.getEntityLiving() instanceof PlayerEntity){
            World world = event.getEntity().world;
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            BlockPos water = player.getPosition();
            if(world.getBlockState(water) == Blocks.WATER.getDefaultState()||(world.isRaining() && world.getBiome(player.getPosition()).getDownfall()>0.0f)){
                int set = 0;
                if(player.inventory.armorInventory.get(3).getItem()==ItemInit.OSMENITE_HELMET.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 100, 10));
                }
                if(player.inventory.armorInventory.get(2).getItem()==ItemInit.OSMENITE_CHESTPLATE.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 2));
                }
                if(player.inventory.armorInventory.get(1).getItem()==ItemInit.OSMENITE_LEGGINGS.get()){
                    set++;
                }
                if(player.inventory.armorInventory.get(0).getItem()==ItemInit.OSMENITE_BOOTS.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 2));
                }
                if(set == 4){
                    player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 100, 10));
                    player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 1000, 10));
                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.OSMENITE_SWORD.get() || player.getHeldItemOffhand().getItem() == ItemInit.OSMENITE_SWORD.get()){
                    player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 3));
                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.OSMENITE_PICKAXE.get() || player.getHeldItemOffhand().getItem() == ItemInit.OSMENITE_PICKAXE.get()) {
                    player.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 1));

                }
            }
            if(player.world.getWorld().getDimension().isNether() || player.getBlockState().getBlock() == Blocks.FIRE || world.getBlockState(water) == Blocks.LAVA.getDefaultState() || player.isBurning() == true){
                int set = 0;

                if(player.inventory.armorInventory.get(3).getItem()==ItemInit.NETHERITE_HELMET.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 100, 1));
                }
                if(player.inventory.armorInventory.get(2).getItem()==ItemInit.NETHERITE_CHESTPLATE.get()) {
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 2));
                }
                if(player.inventory.armorInventory.get(1).getItem()==ItemInit.NETHERITE_LEGGINGS.get()) {
                    set++;
                }
                if(player.inventory.armorInventory.get(0).getItem()==ItemInit.NETHERITE_BOOTS.get()) {
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 2));
                }
                if(set == 4){
                    player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 100, 4));
                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.NETHERITE_SWORD.get() || player.getHeldItemOffhand().getItem() == ItemInit.NETHERITE_SWORD.get()) {
                    player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 3));
                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.NETHERITE_PICKAXE.get() || player.getHeldItemOffhand().getItem() == ItemInit.NETHERITE_PICKAXE.get()) {
                    player.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 1));
                }
            }
            if(player.getPosition().getY()>127){
                int set = 0;
                if(player.inventory.armorInventory.get(3).getItem()==ItemInit.TEMPEST_HELMET.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 1000, 10));
                }
                if(player.inventory.armorInventory.get(2).getItem()==ItemInit.TEMPEST_CHESTPLATE.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 2));
                }
                if(player.inventory.armorInventory.get(1).getItem()==ItemInit.TEMPEST_LEGGINGS.get()){
                    set++;
                }
                if(player.inventory.armorInventory.get(0).getItem()==ItemInit.TEMPEST_BOOTS.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 3));
                }
                if(set == 4){
                    player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 3));

                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.TEMPEST_PICKAXE.get() || player.getHeldItemOffhand().getItem() == ItemInit.TEMPEST_PICKAXE.get()) {
                    player.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 1));
                }
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.STONE_OF_THE_SEA.get() || player.getHeldItemOffhand().getItem() == ItemInit.STONE_OF_THE_SEA.get()) {
                int set = 0;
                if(player.inventory.armorInventory.get(3).getItem()==ItemInit.OSMENITE_HELMET.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 100, 10));
                }
                if(player.inventory.armorInventory.get(2).getItem()==ItemInit.OSMENITE_CHESTPLATE.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 2));
                }
                if(player.inventory.armorInventory.get(1).getItem()==ItemInit.OSMENITE_LEGGINGS.get()){
                    set++;
                }
                if(player.inventory.armorInventory.get(0).getItem()==ItemInit.OSMENITE_BOOTS.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 2));
                }
                if(set == 4){
                    player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 100, 10));
                    player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 1000, 10));
                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.OSMENITE_SWORD.get() || player.getHeldItemOffhand().getItem() == ItemInit.OSMENITE_SWORD.get()){
                    player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 3));
                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.OSMENITE_PICKAXE.get() || player.getHeldItemOffhand().getItem() == ItemInit.OSMENITE_PICKAXE.get()) {
                    player.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 1));

                }
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.STONE_OF_TEMPEST.get() || player.getHeldItemOffhand().getItem() == ItemInit.STONE_OF_TEMPEST.get()){
                int set = 0;
                if(player.inventory.armorInventory.get(3).getItem()==ItemInit.TEMPEST_HELMET.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 1000, 10));
                }
                if(player.inventory.armorInventory.get(2).getItem()==ItemInit.TEMPEST_CHESTPLATE.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 2));
                }
                if(player.inventory.armorInventory.get(1).getItem()==ItemInit.TEMPEST_LEGGINGS.get()){
                    set++;
                }
                if(player.inventory.armorInventory.get(0).getItem()==ItemInit.TEMPEST_BOOTS.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 3));
                }
                if(set == 4){
                    player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 3));

                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.TEMPEST_PICKAXE.get() || player.getHeldItemOffhand().getItem() == ItemInit.TEMPEST_PICKAXE.get()) {
                    player.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 1));
                }
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.STONE_OF_HELLFIRE.get() || player.getHeldItemOffhand().getItem() == ItemInit.STONE_OF_HELLFIRE.get()) {
                int set = 0;
                if(player.inventory.armorInventory.get(3).getItem()==ItemInit.NETHERITE_HELMET.get()){
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 100, 1));
                }
                if(player.inventory.armorInventory.get(2).getItem()==ItemInit.NETHERITE_CHESTPLATE.get()) {
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 2));
                }
                if(player.inventory.armorInventory.get(1).getItem()==ItemInit.NETHERITE_LEGGINGS.get()) {
                    set++;
                }
                if(player.inventory.armorInventory.get(0).getItem()==ItemInit.NETHERITE_BOOTS.get()) {
                    set++;
                    player.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 2));
                }
                if(set == 4){
                    player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 100, 4));
                }
                if(player.getHeldItemMainhand().getItem() == ItemInit.NETHERITE_PICKAXE.get() || player.getHeldItemOffhand().getItem() == ItemInit.NETHERITE_PICKAXE.get()) {
                    player.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 1));
                }
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_LUCK.get() || player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_LUCK.get()) {
            player.addPotionEffect(new EffectInstance(Effects.LUCK, 100));
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_HASTE.get() && player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_HASTE.get()) {
                player.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 1));
            }else if(player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_HASTE.get() || player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_HASTE.get()){
                player.addPotionEffect(new EffectInstance(Effects.HASTE, 100));
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_RESISTANCE.get() && player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_RESISTANCE.get()){
                player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 1));
            }else if(player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_RESISTANCE.get() || player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_RESISTANCE.get()){
                player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100));
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_STRENGTH.get() && player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_STRENGTH.get()){
                player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 1));
            }else if(player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_STRENGTH.get() || player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_STRENGTH.get()){
                player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100));
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_REGENERATION.get() && player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_REGENERATION.get()){
                player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100, 1));
            }else if(player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_REGENERATION.get() || player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_REGENERATION.get()){
                player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100));
            }
            if(player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_SPEED.get() && player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_SPEED.get()){
                player.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 1));
            }else if(player.getHeldItemOffhand().getItem() == ItemInit.RING_OF_SPEED.get() || player.getHeldItemMainhand().getItem() == ItemInit.RING_OF_SPEED.get()){
                player.addPotionEffect(new EffectInstance(Effects.SPEED, 100));
            }
        }
    }
}


