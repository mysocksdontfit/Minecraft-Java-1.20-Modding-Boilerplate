package jacob_modcreation.init.items.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class CharioteApple {
    public static final FoodProperties CHARIOTE_APPLE = new FoodProperties.Builder().
            effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1000, 1), 1.0F).
            effect(new MobEffectInstance(MobEffects.JUMP, 2400, 3), 1.0F).
            alwaysEat()
            .build();
}
