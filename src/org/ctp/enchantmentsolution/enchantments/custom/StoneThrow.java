package org.ctp.enchantmentsolution.enchantments.custom;

import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.ctp.enchantmentsolution.api.Language;
import org.ctp.enchantmentsolution.enchantments.CustomEnchantment;
import org.ctp.enchantmentsolution.enchantments.DefaultEnchantments;
import org.ctp.enchantmentsolution.enchantments.helper.Weight;
import org.ctp.enchantmentsolution.utils.items.nms.ItemType;

public class StoneThrow extends CustomEnchantment{
	
	public StoneThrow() {
		addDefaultDisplayName("Stone Throw");
		addDefaultDisplayName(Language.GERMAN, "Steinwurf");
		setDefaultFiftyConstant(-12);
		setDefaultThirtyConstant(-10);
		setDefaultFiftyModifier(13);
		setDefaultThirtyModifier(11);
		setDefaultFiftyStartLevel(1);
		setDefaultThirtyStartLevel(1);
		setDefaultFiftyMaxLevel(6);
		setDefaultThirtyMaxLevel(5);
		setDefaultWeight(Weight.COMMON);
		addDefaultDescription("Increases ranged damage against flying mobs." + 
				"\n" + 
				"Adds 40% * level + 20% damage against flying mobs.");
		addDefaultDescription(Language.GERMAN, "Erh�ht den Distanzschaden gegen fliegende Mobs." + 
				"\n" + 
				"F�gt 40% * Level + 20% Schaden gegen fliegende Mobs hinzu.");
	}
	
	@Override
	public Enchantment getRelativeEnchantment() {
		return DefaultEnchantments.STONE_THROW;
	}

	@Override
	public String getName() {
		return "stone_throw";
	}
	
	@Override
	protected List<ItemType> getEnchantmentItemTypes() {
		return Arrays.asList(ItemType.CROSSBOW);
	}

	@Override
	protected List<ItemType> getAnvilItemTypes() {
		return Arrays.asList(ItemType.CROSSBOW);
	}

	@Override
	protected List<Enchantment> getDefaultConflictingEnchantments() {
		return Arrays.asList();
	}
}
