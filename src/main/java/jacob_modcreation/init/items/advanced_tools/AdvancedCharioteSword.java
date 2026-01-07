package jacob_modcreation.init.items.advanced_tools;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class AdvancedCharioteSword extends SwordItem {
    public AdvancedCharioteSword(Tier tier, int p_43270_, float p_43271_, Properties p_43272_) {
        super(tier, p_43270_, p_43271_, p_43272_);}

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 50));
        return super.hurtEnemy(itemStack, target, attacker);
    }

}
