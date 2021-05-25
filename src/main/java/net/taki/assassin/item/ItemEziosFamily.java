
package net.taki.assassin.item;

import net.taki.assassin.creativetab.TabAssassinsCreedProps;
import net.taki.assassin.ElementsAssassincrownMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsAssassincrownMod.ModElement.Tag
public class ItemEziosFamily extends ElementsAssassincrownMod.ModElement {
	@GameRegistry.ObjectHolder("assassincrown:eziosfamily")
	public static final Item block = null;
	public ItemEziosFamily(ElementsAssassincrownMod instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("assassincrown:eziosfamily", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("eziosfamily", ElementsAssassincrownMod.sounds.get(new ResourceLocation("assassincrown:assassins_creed_2_ezios_family")));
			setUnlocalizedName("eziosfamily");
			setRegistryName("eziosfamily");
			setCreativeTab(TabAssassinsCreedProps.tab);
		}
	}
}
