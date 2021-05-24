package net.mcreator.assassins_creed.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;
import net.mcreator.assassins_creed.AssassinsCraftModVariables;

import java.util.Map;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ProcedureGlobalSpawn extends ElementsAssassinsCraftMod.ModElement {
	public ProcedureGlobalSpawn(ElementsAssassinsCraftMod instance) {
		super(instance, 133);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GlobalSpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GlobalSpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GlobalSpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GlobalSpawn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		AssassinsCraftModVariables.WorldVariables.get(world).SpawnX = (double) x;
		AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
		AssassinsCraftModVariables.WorldVariables.get(world).SpawnY = (double) y;
		AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
		AssassinsCraftModVariables.WorldVariables.get(world).SpawnZ = (double) z;
		AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
		world.setSpawnPoint(new BlockPos((int) (AssassinsCraftModVariables.WorldVariables.get(world).SpawnX),
				(int) (AssassinsCraftModVariables.WorldVariables.get(world).SpawnY),
				(int) (AssassinsCraftModVariables.WorldVariables.get(world).SpawnZ)));
	}

	@SubscribeEvent
	public void onPlayerInBed(PlayerSleepInBedEvent event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = entity.world;
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
