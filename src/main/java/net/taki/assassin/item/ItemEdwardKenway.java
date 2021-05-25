
package net.taki.assassin.item;

import net.taki.assassin.procedure.ProcedureClimb;
import net.taki.assassin.creativetab.TabAssassinsCreedProps;
import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Map;
import java.util.HashMap;

@ElementsAssassincrownMod.ModElement.Tag
public class ItemEdwardKenway extends ElementsAssassincrownMod.ModElement {
	@GameRegistry.ObjectHolder("assassincrown:edwardkenwayhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("assassincrown:edwardkenwaybody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("assassincrown:edwardkenwaylegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("assassincrown:edwardkenwayboots")
	public static final Item boots = null;
	public ItemEdwardKenway(ElementsAssassincrownMod instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EDWARDKENWAY", "assassincrown:edwardkenway_", 30, new int[]{5, 6, 6, 6}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_generic")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("edwardkenwayhelmet")
				.setRegistryName("edwardkenwayhelmet").setCreativeTab(TabAssassinsCreedProps.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("edwardkenwaybody")
				.setRegistryName("edwardkenwaybody").setCreativeTab(TabAssassinsCreedProps.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("edwardkenwaylegs")
				.setRegistryName("edwardkenwaylegs").setCreativeTab(TabAssassinsCreedProps.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureClimb.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("edwardkenwayboots").setRegistryName("edwardkenwayboots").setCreativeTab(TabAssassinsCreedProps.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("assassincrown:edwardkenwayhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("assassincrown:edwardkenwaybody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("assassincrown:edwardkenwaylegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("assassincrown:edwardkenwayboots", "inventory"));
	}
}
