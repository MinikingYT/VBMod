package net.mcreator.vb_mod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@Elementsvb_mod.ModElement.Tag
public class MCreatorNetherStarDustRecipe extends Elementsvb_mod.ModElement {
	public MCreatorNetherStarDustRecipe(Elementsvb_mod instance) {
		super(instance, 18);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.NETHER_STAR, (int) (1)), new ItemStack(MCreatorNetherStarDust.block, (int) (9)), 1F);
	}
}
