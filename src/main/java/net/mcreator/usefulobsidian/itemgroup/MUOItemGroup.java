
package net.mcreator.usefulobsidian.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.usefulobsidian.MoreUsefulObsidianModElements;

@MoreUsefulObsidianModElements.ModElement.Tag
public class MUOItemGroup extends MoreUsefulObsidianModElements.ModElement {
	public MUOItemGroup(MoreUsefulObsidianModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmuo") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.OBSIDIAN, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
