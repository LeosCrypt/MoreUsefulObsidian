
package net.mcreator.usefulobsidian.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.usefulobsidian.itemgroup.MUOItemGroup;
import net.mcreator.usefulobsidian.MoreUsefulObsidianModElements;

@MoreUsefulObsidianModElements.ModElement.Tag
public class ObsiCookieItem extends MoreUsefulObsidianModElements.ModElement {
	@ObjectHolder("more_useful_obsidian:obsi_cookie")
	public static final Item block = null;
	public ObsiCookieItem(MoreUsefulObsidianModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MUOItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("obsi_cookie");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 128;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
