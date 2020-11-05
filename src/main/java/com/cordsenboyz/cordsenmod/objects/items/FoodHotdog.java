package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodHotdog extends Item {
    public FoodHotdog(Properties properties) {
        super(new Properties()
                .group(CordsenMod.TAB)
                .food(new Food.Builder()
                        .hunger(16)
                        .saturation(2.4F)
                        .build())
        );
    }
}
