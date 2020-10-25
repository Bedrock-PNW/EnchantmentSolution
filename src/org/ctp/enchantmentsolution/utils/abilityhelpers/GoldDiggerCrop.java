package org.ctp.enchantmentsolution.utils.abilityhelpers;

import org.bukkit.Material;
import org.ctp.enchantmentsolution.enums.MatData;

public enum GoldDiggerCrop {
	BROWN_MUSHROOM(1), RED_MUSHROOM(1), CRIMSON_FUNGUS(2), WARPED_FUNGUS(2), NETHER_WART(3);

	private MatData material;
	private int exp;

	private GoldDiggerCrop(int exp) {
		material = new MatData(name());
		this.exp = exp;
	}

	public Material getMaterial() {
		return material.getMaterial();
	}

	public int getExp() {
		return exp;
	}

	public static int getExp(Material material, int level) {
		for(GoldDiggerCrop value: values())
			if (value.getMaterial() == material) return level * value.getExp();
		return 0;
	}
}
