package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodApplePoison extends Item {
    public FoodApplePoison(Properties properties) {
        super(new Item.Properties()
                .group(CordsenMod.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2F)
                        .effect(new EffectInstance(Effects.POISON, 100, 0),1)
                        .build())
        );
    }
}
