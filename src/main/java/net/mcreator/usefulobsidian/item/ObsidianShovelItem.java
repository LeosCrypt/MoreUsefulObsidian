
package net.mcreator.usefulobsidian.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.usefulobsidian.itemgroup.MUOItemGroup;
import net.mcreator.usefulobsidian.MoreUsefulObsidianModElements;

@MoreUsefulObsidianModElements.ModElement.Tag
public class ObsidianShovelItem extends MoreUsefulObsidianModElements.ModElement {
	@ObjectHolder("more_useful_obsidian:obsidian_shovel")
	public static final Item block = null;
	public ObsidianShovelItem(MoreUsefulObsidianModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1750;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CompressedObsidianItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MUOItemGroup.tab)) {
		}.setRegistryName("obsidian_shovel"));
	}
}
