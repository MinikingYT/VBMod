package net.mcreator.vb_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementsvb_mod.ModElement.Tag
public class MCreatorVBMODTAB extends Elementsvb_mod.ModElement {
	public MCreatorVBMODTAB(Elementsvb_mod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabvbmodtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorFeroCore.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
