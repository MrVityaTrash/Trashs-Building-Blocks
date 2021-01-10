
package net.mcreator.trashsbuildingblocks.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.trashsbuildingblocks.block.GreyStoneBrickBlock;
import net.mcreator.trashsbuildingblocks.TrashsBuildingBlocksModElements;

@TrashsBuildingBlocksModElements.ModElement.Tag
public class TrashblocksItemGroup extends TrashsBuildingBlocksModElements.ModElement {
	public TrashblocksItemGroup(TrashsBuildingBlocksModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtrashblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GreyStoneBrickBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
