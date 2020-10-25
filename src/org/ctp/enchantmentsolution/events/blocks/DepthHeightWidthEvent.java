package org.ctp.enchantmentsolution.events.blocks;

import java.util.Collection;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.ctp.enchantmentsolution.enchantments.CERegister;
import org.ctp.enchantmentsolution.enchantments.helper.EnchantmentLevel;

public class DepthHeightWidthEvent extends MultiBlockBreakEvent {

	private final EnchantmentLevel enchantmentHeight;
	private final EnchantmentLevel enchantmentWidth;
	private final Block block;

	public DepthHeightWidthEvent(Collection<Location> blocks, Block block, Player player, int depthLevel, int heightLevel, int widthLevel) {
		super(blocks, player, new EnchantmentLevel(CERegister.DEPTH_PLUS_PLUS, depthLevel));
		enchantmentHeight = new EnchantmentLevel(CERegister.HEIGHT_PLUS_PLUS, heightLevel);
		enchantmentWidth = new EnchantmentLevel(CERegister.WIDTH_PLUS_PLUS, widthLevel);
		this.block = block;
	}

	public EnchantmentLevel getEnchantmentDepth() {
		return enchantmentHeight;
	}

	public EnchantmentLevel getEnchantmentHeight() {
		return enchantmentHeight;
	}

	public EnchantmentLevel getEnchantmentWidth() {
		return enchantmentWidth;
	}

	public Block getBlock() {
		return this.block;
	}

}
