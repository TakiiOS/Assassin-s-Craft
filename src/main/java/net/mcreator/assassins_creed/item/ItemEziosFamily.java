
package net.mcreator.assassins_creed.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.assassins_creed.creativetab.TabAssassinsCreedProps;
import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ItemEziosFamily extends ElementsAssassinsCraftMod.ModElement {
	@GameRegistry.ObjectHolder("assassins_craft:eziosfamily")
	public static final Item block = null;
	public ItemEziosFamily(ElementsAssassinsCraftMod instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("assassins_craft:eziosfamily", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("eziosfamily", ElementsAssassinsCraftMod.sounds.get(new ResourceLocation("assassins_craft:assassins_creed_2_ezios_family")));
			setUnlocalizedName("eziosfamily");
			setRegistryName("eziosfamily");
			setCreativeTab(TabAssassinsCreedProps.tab);
		}
	}
}
