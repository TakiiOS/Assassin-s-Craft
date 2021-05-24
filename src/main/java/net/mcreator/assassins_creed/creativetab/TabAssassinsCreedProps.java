
package net.mcreator.assassins_creed.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.assassins_creed.item.ItemAltairArmor;
import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;

@ElementsAssassinsCraftMod.ModElement.Tag
public class TabAssassinsCreedProps extends ElementsAssassinsCraftMod.ModElement {
	public TabAssassinsCreedProps(ElementsAssassinsCraftMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabassassinscreedprops") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAltairArmor.helmet, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
