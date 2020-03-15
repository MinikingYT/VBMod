package net.mcreator.vb_mod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvb_mod.ModElement.Tag
public class MCreatorFeroStariumOreSmelting extends Elementsvb_mod.ModElement {
	public MCreatorFeroStariumOreSmelting(Elementsvb_mod instance) {
		super(instance, 16);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorFeroStariumOre.block, (int) (1)), new ItemStack(MCreatorFeroStariumDust.block, (int) (1)),
				0.7F);
	}
}
