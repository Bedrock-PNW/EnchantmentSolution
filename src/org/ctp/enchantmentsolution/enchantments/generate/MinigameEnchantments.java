package org.ctp.enchantmentsolution.enchantments.generate;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.ctp.enchantmentsolution.enums.EnchantmentLocation;
import org.ctp.enchantmentsolution.utils.LocationUtils;
import org.ctp.enchantmentsolution.utils.config.ConfigString;

public class MinigameEnchantments extends LootEnchantments {

	public MinigameEnchantments(Player player, ItemStack item, int books, EnchantmentLocation location) {
		super(player, item, books, location);
	}

	public static MinigameEnchantments generateMinigameLoot(Player player, ItemStack item, Block block) {
		int books = 0;
		if (ConfigString.MINIGAME_FAST_RANDOM_BOOKSHELVES.getBoolean()) {
			int maxBooks = 16;
			if (ConfigString.LEVEL_FIFTY.getBoolean()) maxBooks = 24;

			double rand = (Math.random() + Math.random()) / 2;

			int random = (int) (rand * maxBooks);
			if (random >= maxBooks) random = maxBooks - 1;
			books = random;
		} else if (block != null) books = LocationUtils.getBookshelves(block.getLocation());
		return new MinigameEnchantments(player, item, books, EnchantmentLocation.TABLE);
	}

}