
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
public class ItemConnorKenwayArmor extends ElementsAssassincrownMod.ModElement {
	@GameRegistry.ObjectHolder("assassincrown:connorkenwayarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("assassincrown:connorkenwayarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("assassincrown:connorkenwayarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("assassincrown:connorkenwayarmorboots")
	public static final Item boots = null;
	public ItemConnorKenwayArmor(ElementsAssassincrownMod instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CONNORKENWAYARMOR", "assassincrown:connorkenway_", 20, new int[]{3, 5, 5, 3}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
				1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("connorkenwayarmorhelmet")
				.setRegistryName("connorkenwayarmorhelmet").setCreativeTab(TabAssassinsCreedProps.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("connorkenwayarmorbody")
				.setRegistryName("connorkenwayarmorbody").setCreativeTab(TabAssassinsCreedProps.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("connorkenwayarmorlegs")
				.setRegistryName("connorkenwayarmorlegs").setCreativeTab(TabAssassinsCreedProps.tab));
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
		}.setUnlocalizedName("connorkenwayarmorboots").setRegistryName("connorkenwayarmorboots").setCreativeTab(TabAssassinsCreedProps.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("assassincrown:connorkenwayarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("assassincrown:connorkenwayarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("assassincrown:connorkenwayarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("assassincrown:connorkenwayarmorboots", "inventory"));
	}
}
