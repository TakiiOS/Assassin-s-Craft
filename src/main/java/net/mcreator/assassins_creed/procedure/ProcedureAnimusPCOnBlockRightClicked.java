package net.mcreator.assassins_creed.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.assassins_creed.gui.GuiAnimusinventory;
import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;
import net.mcreator.assassins_creed.AssassinsCraftMod;

import java.util.Map;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ProcedureAnimusPCOnBlockRightClicked extends ElementsAssassinsCraftMod.ModElement {
	public ProcedureAnimusPCOnBlockRightClicked(ElementsAssassinsCraftMod instance) {
		super(instance, 179);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AnimusPCOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AnimusPCOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AnimusPCOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AnimusPCOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AnimusPCOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(AssassinsCraftMod.instance, GuiAnimusinventory.GUIID, world, x, y, z);
	}
}
