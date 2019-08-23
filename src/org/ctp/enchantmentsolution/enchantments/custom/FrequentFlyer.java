package org.ctp.enchantmentsolution.enchantments.custom;

import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.ctp.enchantmentsolution.api.Language;
import org.ctp.enchantmentsolution.enchantments.CustomEnchantment;
import org.ctp.enchantmentsolution.enchantments.DefaultEnchantments;
import org.ctp.enchantmentsolution.enchantments.helper.Weight;
import org.ctp.enchantmentsolution.utils.items.nms.ItemType;

public class FrequentFlyer extends CustomEnchantment{
	
	public FrequentFlyer() {
		super("Frequent Flyer", 20, 5, 15, 10, 30, 1, 3, 3, Weight.VERY_RARE, "Allows flight. Durability damage every (3 * level) seconds "
				+ "when below 255 height and every (level) seconds above 255 height. Removes flight at 32 durability.");
		addDefaultDisplayName(Language.GERMAN, "Vielflieger");
		addDefaultDescription(Language.GERMAN, "Erlaubt den Flug. Haltbarkeitsschaden alle (3 * Level) Sekunden, wenn die Höhe unter 255 liegt, "
				+ "und jede (Level) Sekunde über 255 Höhe. Entfernt den Flug bei 32 Haltbarkeit.");
		addDefaultDisplayName(Language.CHINA_SIMPLE, "御空");
		addDefaultDescription(Language.CHINA_SIMPLE, "可以让你飞行.在低于255格高度飞行时每(3 * 附魔等级)秒消耗耐久.在高空则每(附魔等级)秒消耗耐久. 耐久低于32时无法飞行.");
	}
	
	@Override
	public Enchantment getRelativeEnchantment() {
		return DefaultEnchantments.FREQUENT_FLYER;
	}

	@Override
	public String getName() {
		return "frequent_flyer";
	}
	
	@Override
	protected List<ItemType> getEnchantmentItemTypes() {
		return Arrays.asList(ItemType.BOOK);
	}

	@Override
	protected List<ItemType> getAnvilItemTypes() {
		return Arrays.asList(ItemType.ELYTRA);
	}

	@Override
	protected List<Enchantment> getDefaultConflictingEnchantments() {
		return Arrays.asList(DefaultEnchantments.ICARUS);
	}

}
