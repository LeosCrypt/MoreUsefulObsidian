
package net.mcreator.usefulobsidian.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.usefulobsidian.itemgroup.MUOItemGroup;
import net.mcreator.usefulobsidian.MoreUsefulObsidianModElements;

@MoreUsefulObsidianModElements.ModElement.Tag
public class MysterySkullsMoneyItem extends MoreUsefulObsidianModElements.ModElement {
	@ObjectHolder("more_useful_obsidian:mystery_skulls_money")
	public static final Item block = null;
	public MysterySkullsMoneyItem(MoreUsefulObsidianModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MoreUsefulObsidianModElements.sounds.get(new ResourceLocation("more_useful_obsidian:mysteryskulls-money")),
					new Item.Properties().group(MUOItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("mystery_skulls_money");
		}
	}
}
