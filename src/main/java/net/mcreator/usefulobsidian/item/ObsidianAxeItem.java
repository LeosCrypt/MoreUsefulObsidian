
package net.mcreator.usefulobsidian.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.usefulobsidian.itemgroup.MUOItemGroup;
import net.mcreator.usefulobsidian.MoreUsefulObsidianModElements;

@MoreUsefulObsidianModElements.ModElement.Tag
public class ObsidianAxeItem extends MoreUsefulObsidianModElements.ModElement {
	@ObjectHolder("more_useful_obsidian:obsidian_axe")
	public static final Item block = null;
	public ObsidianAxeItem(MoreUsefulObsidianModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1750;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 12f;
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
		}, 1, -3.4f, new Item.Properties().group(MUOItemGroup.tab)) {
		}.setRegistryName("obsidian_axe"));
	}
}
