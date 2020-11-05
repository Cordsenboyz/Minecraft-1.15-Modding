package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodAppleSapphire extends Item {
    public FoodAppleSapphire(Properties properties) {
        super(new Properties()
                .group(CordsenMod.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2F)
                        .effect(new EffectInstance(Effects.RESISTANCE, 1200, 1),1)
                        .effect(new EffectInstance(Effects.ABSORPTION, 1200, 1),1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
