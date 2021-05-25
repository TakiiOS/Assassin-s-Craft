package net.taki.assassin.procedure;

import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsAssassincrownMod.ModElement.Tag
public class ProcedureDesynchronizationEntityCollidesInTheBlocke extends ElementsAssassincrownMod.ModElement {
	public ProcedureDesynchronizationEntityCollidesInTheBlocke(ElementsAssassincrownMod instance) {
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
