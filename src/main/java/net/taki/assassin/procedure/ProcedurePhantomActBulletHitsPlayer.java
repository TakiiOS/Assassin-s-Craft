package net.taki.assassin.procedure;

import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsAssassincrownMod.ModElement.Tag
public class ProcedurePhantomActBulletHitsPlayer extends ElementsAssassincrownMod.ModElement {
	public ProcedurePhantomActBulletHitsPlayer(ElementsAssassincrownMod instance) {
		super(instance, 172);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PhantomActBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 120, (int) 1));
	}
}
