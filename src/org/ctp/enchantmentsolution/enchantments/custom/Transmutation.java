package org.ctp.enchantmentsolution.enchantments.custom;

import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.ctp.enchantmentsolution.api.Language;
import org.ctp.enchantmentsolution.enchantments.CustomEnchantment;
import org.ctp.enchantmentsolution.enchantments.DefaultEnchantments;
import org.ctp.enchantmentsolution.enchantments.helper.Weight;
import org.ctp.enchantmentsolution.utils.items.nms.ItemType;

public class Transmutation extends CustomEnchantment{
	
	public Transmutation() {
		addDefaultDisplayName("Transmutation");
		addDefaultDisplayName(Language.GERMAN, "Transmutation");
		setDefaultFiftyConstant(65);
		setDefaultThirtyConstant(35);
		setDefaultFiftyModifier(0);
		setDefaultThirtyModifier(0);
		setDefaultFiftyMaxConstant(35);
		setDefaultThirtyMaxConstant(50);
		setDefaultFiftyStartLevel(40);
		setDefaultThirtyStartLevel(1);
		setDefaultFiftyMaxLevel(1);
		setDefaultThirtyMaxLevel(1);
		setDefaultWeight(Weight.VERY_RARE);
		setMaxLevelOne(true);
		addDefaultDescription("On killing mobs, all non-sea drop items become sea drop items.");
		addDefaultDescription(Language.GERMAN, "Beim T�ten von Mobs werden alle Gegenst�nde, die nicht aus dem Meer stammen, zu Teilen aus dem Meer.");
	}
	
	@Override
	public Enchantment getRelativeEnchantment() {
		return DefaultEnchantments.TRANSMUTATION;
	}

	@Override
	public String getName() {
		return "transmutation";
	}
	
	@Override
	protected List<ItemType> getEnchantmentItemTypes() {
		return Arrays.asList(ItemType.TRIDENT);
	}

	@Override
	protected List<ItemType> getAnvilItemTypes() {
		return Arrays.asList(ItemType.TRIDENT);
	}

	@Override
	protected List<Enchantment> getDefaultConflictingEnchantments() {
		return Arrays.asList();
	}
}
