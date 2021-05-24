
package net.mcreator.assassins_creed.item;

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

import net.mcreator.assassins_creed.procedure.ProcedureClimb;
import net.mcreator.assassins_creed.creativetab.TabAssassinsCreedProps;
import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ItemShayCormac extends ElementsAssassinsCraftMod.ModElement {
	@GameRegistry.ObjectHolder("assassins_craft:shaycormachelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("assassins_craft:shaycormacbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("assassins_craft:shaycormaclegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("assassins_craft:shaycormacboots")
	public static final Item boots = null;
	public ItemShayCormac(ElementsAssassinsCraftMod instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SHAYCORMAC", "assassins_craft:shaycormac_", 50, new int[]{6, 7, 8, 7}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
				1.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("shaycormachelmet")
				.setRegistryName("shaycormachelmet").setCreativeTab(TabAssassinsCreedProps.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("shaycormacbody")
				.setRegistryName("shaycormacbody").setCreativeTab(TabAssassinsCreedProps.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("shaycormaclegs")
				.setRegistryName("shaycormaclegs").setCreativeTab(TabAssassinsCreedProps.tab));
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
		}.setUnlocalizedName("shaycormacboots").setRegistryName("shaycormacboots").setCreativeTab(TabAssassinsCreedProps.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("assassins_craft:shaycormachelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("assassins_craft:shaycormacbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("assassins_craft:shaycormaclegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("assassins_craft:shaycormacboots", "inventory"));
	}
}
