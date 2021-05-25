package net.taki.assassin.procedure;

import net.taki.assassin.item.ItemTomahawk;
import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsAssassincrownMod.ModElement.Tag
public class ProcedureTomahawkRangedItemUsed extends ElementsAssassincrownMod.ModElement {
	public ProcedureTomahawkRangedItemUsed(ElementsAssassincrownMod instance) {
		super(instance, 61);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TomahawkRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemTomahawk.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
		}
	}
}
