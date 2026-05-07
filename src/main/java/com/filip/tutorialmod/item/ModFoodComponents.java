package com.filip.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(1).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300), 0.2f).build();
    public static final FoodComponent BLUE_BERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200, 1), 0.3f).build();
}
