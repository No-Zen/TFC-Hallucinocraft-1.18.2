package com.daderpduck.hallucinocraft.mixin.accessor;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Player.class)
public interface PlayerAccessor
{
    @Mutable
    @Accessor("foodData")
    void accessor$setFoodData(FoodData foodData);
}
