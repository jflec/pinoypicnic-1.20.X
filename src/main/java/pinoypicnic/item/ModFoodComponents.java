package pinoypicnic.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent CHICKEN_ADOBO = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION), 0.25f).build();
    public static final FoodComponent PORK_ADOBO = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION), 0.25f).build();

}
