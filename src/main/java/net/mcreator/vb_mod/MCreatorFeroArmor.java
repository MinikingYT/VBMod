package net.mcreator.vb_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsvb_mod.ModElement.Tag
public class MCreatorFeroArmor extends Elementsvb_mod.ModElement {
	@GameRegistry.ObjectHolder("vb_mod:feroarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("vb_mod:feroarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("vb_mod:feroarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("vb_mod:feroarmorboots")
	public static final Item boots = null;

	public MCreatorFeroArmor(Elementsvb_mod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FEROARMOR", "vb_mod:fero_", 105, new int[]{14, 42, 35, 14}, 63,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("feroarmorhelmet")
				.setRegistryName("feroarmorhelmet").setCreativeTab(MCreatorVBMODTAB.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("feroarmorbody")
				.setRegistryName("feroarmorbody").setCreativeTab(MCreatorVBMODTAB.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("feroarmorlegs")
				.setRegistryName("feroarmorlegs").setCreativeTab(MCreatorVBMODTAB.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("feroarmorboots")
				.setRegistryName("feroarmorboots").setCreativeTab(MCreatorVBMODTAB.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("vb_mod:feroarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("vb_mod:feroarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("vb_mod:feroarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("vb_mod:feroarmorboots", "inventory"));
	}
}
