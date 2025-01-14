package net.taki.assassin.procedure;

import net.taki.assassin.item.ItemRapier;
import net.taki.assassin.item.ItemMariosLetteritem;
import net.taki.assassin.item.ItemItalymap;
import net.taki.assassin.item.ItemHoja_OcultaAct;
import net.taki.assassin.item.ItemHojaOculta;
import net.taki.assassin.item.ItemEzioArmor;
import net.taki.assassin.item.ItemExittheanimus;
import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import java.util.Map;

@ElementsAssassincrownMod.ModElement.Tag
public class ProcedureItaly1459PlayerLeavesDimension extends ElementsAssassincrownMod.ModElement {
	public ProcedureItaly1459PlayerLeavesDimension(ElementsAssassincrownMod instance) {
		super(instance, 127);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Italy1459PlayerLeavesDimension!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Italy1459PlayerLeavesDimension!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Italy1459PlayerLeavesDimension!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Italy1459PlayerLeavesDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Italy1459PlayerLeavesDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemExittheanimus.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemItalymap.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMariosLetteritem.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEzioArmor.helmet, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEzioArmor.body, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEzioArmor.legs, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEzioArmor.boots, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemRapier.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemHojaOculta.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemHoja_OcultaAct.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.SADDLE, (int) (1)).getItem(), -1, (int) 1, null);
		if (!world.isRemote && world.getMinecraftServer() != null) {
			world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
				@Override
				public String getName() {
					return "";
				}

				@Override
				public boolean canUseCommand(int permission, String command) {
					return true;
				}

				@Override
				public World getEntityWorld() {
					return world;
				}

				@Override
				public MinecraftServer getServer() {
					return world.getMinecraftServer();
				}

				@Override
				public boolean sendCommandFeedback() {
					return false;
				}

				@Override
				public BlockPos getPosition() {
					return new BlockPos((int) x, (int) y, (int) z);
				}

				@Override
				public Vec3d getPositionVector() {
					return new Vec3d(x, y, z);
				}
			}, "gamerule keepInventory false");
		}
	}
}
