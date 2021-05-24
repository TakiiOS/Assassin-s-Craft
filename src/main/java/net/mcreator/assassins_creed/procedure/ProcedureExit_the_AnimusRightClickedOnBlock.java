package net.mcreator.assassins_creed.procedure;

import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.world.Teleporter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;
import net.mcreator.assassins_creed.AssassinsCraftModVariables;

import java.util.Map;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ProcedureExit_the_AnimusRightClickedOnBlock extends ElementsAssassinsCraftMod.ModElement {
	public ProcedureExit_the_AnimusRightClickedOnBlock(ElementsAssassinsCraftMod instance) {
		super(instance, 132);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Exit_the_AnimusRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Exit_the_AnimusRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Exit_the_AnimusRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Exit_the_AnimusRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Exit_the_AnimusRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity.dimension) == 8)) {
			AssassinsCraftModVariables.WorldVariables.get(world).SpawnX_Italy = (double) x;
			AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
			AssassinsCraftModVariables.WorldVariables.get(world).SapwnY_Italy = (double) y;
			AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
			AssassinsCraftModVariables.WorldVariables.get(world).SpawnZ_Italy = (double) z;
			AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setSpawnPoint(new BlockPos((int) (AssassinsCraftModVariables.WorldVariables.get(world).SpawnX_Italy),
						(int) (AssassinsCraftModVariables.WorldVariables.get(world).SapwnY_Italy),
						(int) (AssassinsCraftModVariables.WorldVariables.get(world).SpawnZ_Italy)), true);
		}
		if (((entity.dimension) == 9)) {
			AssassinsCraftModVariables.WorldVariables.get(world).SapwnX_Masyaf = (double) x;
			AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
			AssassinsCraftModVariables.WorldVariables.get(world).SpawnY_Masyaf = (double) y;
			AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
			AssassinsCraftModVariables.WorldVariables.get(world).SpawnZ_Masyaf = (double) z;
			AssassinsCraftModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setSpawnPoint(new BlockPos((int) (AssassinsCraftModVariables.WorldVariables.get(world).SapwnX_Masyaf),
						(int) (AssassinsCraftModVariables.WorldVariables.get(world).SpawnY_Masyaf),
						(int) (AssassinsCraftModVariables.WorldVariables.get(world).SpawnZ_Masyaf)), true);
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
				int dimensionID = 0;
				class TeleporterDirect extends Teleporter {
					public TeleporterDirect(WorldServer worldserver) {
						super(worldserver);
					}

					@Override
					public void placeInPortal(Entity entity, float yawrotation) {
					}

					@Override
					public boolean placeInExistingPortal(Entity entity, float yawrotation) {
						return true;
					}

					@Override
					public boolean makePortal(Entity entity) {
						return true;
					}
				}
				EntityPlayerMP _player = (EntityPlayerMP) _ent;
				_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
				_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
			}
		}
	}
}
