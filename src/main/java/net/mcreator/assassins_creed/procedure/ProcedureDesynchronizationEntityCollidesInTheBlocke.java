package net.mcreator.assassins_creed.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;

import java.util.Map;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ProcedureDesynchronizationEntityCollidesInTheBlocke extends ElementsAssassinsCraftMod.ModElement {
	public ProcedureDesynchronizationEntityCollidesInTheBlocke(ElementsAssassinsCraftMod instance) {
		super(instance, 131);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DesynchronizationEntityCollidesInTheBlocke!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
