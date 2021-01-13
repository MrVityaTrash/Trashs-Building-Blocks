
package net.mcreator.trashsbuildingblocks.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.trashsbuildingblocks.TrashsBuildingBlocksModElements;

@TrashsBuildingBlocksModElements.ModElement.Tag
public class CatPainting extends TrashsBuildingBlocksModElements.ModElement {
	public CatPainting(TrashsBuildingBlocksModElements instance) {
		super(instance, 134);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 32).setRegistryName("cat"));
	}
}
