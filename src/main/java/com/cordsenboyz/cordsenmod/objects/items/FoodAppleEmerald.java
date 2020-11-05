package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodAppleEmerald extends Item {
    public FoodAppleEmerald(Properties properties) {
        super(new Properties()
                .group(CordsenMod.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2F)
                        .effect(new EffectInstance(Effects.LUCK, 1200, 0),0.4f)
                        .effect(new EffectInstance(Effects.SPEED, 1200, 2),1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
