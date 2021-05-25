package net.taki.assassin.procedure;

import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsAssassincrownMod.ModElement.Tag
public class ProcedureBlowgun_Bullet_Hits_Living_Entity extends ElementsAssassincrownMod.ModElement {
	public ProcedureBlowgun_Bullet_Hits_Living_Entity(ElementsAssassincrownMod instance) {
		super(instance, 181);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Blowgun_Bullet_Hits_Living_Entity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 150, (int) 1));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 100, (int) 1));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 150, (int) 1));
	}
}
