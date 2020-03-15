package net.mcreator.vb_mod;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.Teleporter;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsvb_mod.ModElement.Tag
public class MCreatorCheirinhoFoodEaten extends Elementsvb_mod.ModElement {
	public MCreatorCheirinhoFoodEaten(Elementsvb_mod instance) {
		super(instance, 35);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCheirinhoFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(MCreatorRegresso.block, (int) (1)));
		if (!entity.world.isRemote && !entity.isRiding() && !entity.isBeingRidden() && entity instanceof EntityPlayerMP) {
			int dimensionID = MCreatorIladioLand.DIMID;
			class TeleporterDirect extends Teleporter {
				public TeleporterDirect(WorldServer worldserver) {
					super(worldserver);
				}

				@Override
				public void placeInPortal(Entity entity, float yawrotation) {
				}

				@Override
				public boolean placeInExistingPortal(Entity entity, float yawrotation) {
					return true;
				}

				@Override
				public boolean makePortal(Entity entity) {
					return true;
				}
			}
			EntityPlayerMP _player = (EntityPlayerMP) entity;
			_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
			_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(), DimensionManager
					.getWorld(dimensionID).getSpawnPoint().getY() + 1, DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(),
					_player.rotationYaw, _player.rotationPitch);
		}
	}
}
