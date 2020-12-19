package net.mcreator.usefulobsidian.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.usefulobsidian.MoreUsefulObsidianModElements;

import java.util.Map;

@MoreUsefulObsidianModElements.ModElement.Tag
public class ObsiPotionOnPotionActiveTickProcedure extends MoreUsefulObsidianModElements.ModElement {
	public ObsiPotionOnPotionActiveTickProcedure(MoreUsefulObsidianModElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ObsiPotionOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 3, (true), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1, (true), (false)));
	}
}
