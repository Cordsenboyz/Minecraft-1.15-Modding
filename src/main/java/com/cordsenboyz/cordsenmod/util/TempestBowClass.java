package com.cordsenboyz.cordsenmod.util;

import com.cordsenboyz.cordsenmod.objects.items.TempestBowItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;

public class TempestBowClass {
    public ArrayList<BlockPos> SpeedEffect = new ArrayList<>();
    public AbstractArrowEntity SpeedArrow;
    public World ArrowWorld;
    public ArrayList<Integer> LifeTime = new ArrayList<>();

    public TempestBowClass(AbstractArrowEntity AbstractArrowEntityIn, World WorldIn, int LifeTimeIn){
        this.SpeedEffect.add(AbstractArrowEntityIn.getPosition());
        this.SpeedArrow = AbstractArrowEntityIn;
        this.ArrowWorld = WorldIn;
        this.LifeTime.add(LifeTimeIn);
    }
}
