package com.cordsenboyz.cordsenmod.objects.items;

import com.cordsenboyz.cordsenmod.CordsenMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FoodSausage extends Item {
    public FoodSausage(Properties properties) {
        super(new Properties()
                .group(CordsenMod.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(1.4F)
                        .build())
        );
    }
}
