package net.mcreator.assassins_creed.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;

import java.util.Map;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ProcedureHaybaleEntityCollidesInTheBlock extends ElementsAssassinsCraftMod.ModElement {
	public ProcedureHaybaleEntityCollidesInTheBlock(ElementsAssassinsCraftMod instance) {
		super(instance, 130);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HaybaleEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.fallDistance = (float) (0);
	}
}
