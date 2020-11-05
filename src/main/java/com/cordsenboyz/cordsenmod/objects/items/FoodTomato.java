package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FoodTomato extends Item {
    public FoodTomato(Properties properties) {
        super(new Properties()
                .group(CordsenMod.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(0.4F)
                        .build())
        );
    }
}
