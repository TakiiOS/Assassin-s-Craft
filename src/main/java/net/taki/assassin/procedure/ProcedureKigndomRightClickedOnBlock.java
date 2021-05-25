package net.taki.assassin.procedure;

import net.taki.assassin.gui.GuiKingdommap;
import net.taki.assassin.ElementsAssassincrownMod;
import net.taki.assassin.AssassincrownMod;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsAssassincrownMod.ModElement.Tag
public class ProcedureKigndomRightClickedOnBlock extends ElementsAssassincrownMod.ModElement {
	public ProcedureKigndomRightClickedOnBlock(ElementsAssassincrownMod instance) {
		super(instance, 193);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KigndomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure KigndomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure KigndomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure KigndomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure KigndomRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(AssassincrownMod.instance, GuiKingdommap.GUIID, world, x, y, z);
	}
}
