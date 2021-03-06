
package net.mcreator.trashsbuildingblocks.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.state.properties.SlabType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.trashsbuildingblocks.itemgroup.TrashblocksItemGroup;
import net.mcreator.trashsbuildingblocks.TrashsBuildingBlocksModElements;

import java.util.List;
import java.util.Collections;

@TrashsBuildingBlocksModElements.ModElement.Tag
public class PolishedlimestoneslabBlock extends TrashsBuildingBlocksModElements.ModElement {
	@ObjectHolder("trashs_building_blocks:polishedlimestoneslab")
	public static final Block block = null;
	public PolishedlimestoneslabBlock(TrashsBuildingBlocksModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TrashblocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("polishedlimestoneslab");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}
	}
}
