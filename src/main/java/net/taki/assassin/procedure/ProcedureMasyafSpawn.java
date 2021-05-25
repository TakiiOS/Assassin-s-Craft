package net.taki.assassin.procedure;

import net.taki.assassin.ElementsAssassincrownMod;
import net.taki.assassin.AssassincrownModVariables;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsAssassincrownMod.ModElement.Tag
public class ProcedureMasyafSpawn extends ElementsAssassincrownMod.ModElement {
	public ProcedureMasyafSpawn(ElementsAssassincrownMod instance) {
		super(instance, 157);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MasyafSpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MasyafSpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MasyafSpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MasyafSpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MasyafSpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity.dimension) == 9)) {
			AssassincrownModVariables.WorldVariables.get(world).SapwnX_Masyaf = (double) x;
			AssassincrownModVariables.WorldVariables.get(world).syncData(world);
			AssassincrownModVariables.WorldVariables.get(world).SpawnY_Masyaf = (double) y;
			AssassincrownModVariables.WorldVariables.get(world).syncData(world);
			AssassincrownModVariables.WorldVariables.get(world).SpawnZ_Masyaf = (double) z;
			AssassincrownModVariables.WorldVariables.get(world).syncData(world);
		}
		world.setSpawnPoint(new BlockPos((int) (AssassincrownModVariables.WorldVariables.get(world).SapwnX_Masyaf),
				(int) (AssassincrownModVariables.WorldVariables.get(world).SpawnY_Masyaf),
				(int) (AssassincrownModVariables.WorldVariables.get(world).SpawnZ_Masyaf)));
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
