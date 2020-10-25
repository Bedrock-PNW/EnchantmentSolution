/*	*/ package org.ctp.esa.events;
/*	*/ 
/*	*/ import java.util.Collection;
/*	*/ import org.bukkit.Location;
/*	*/ import org.bukkit.block.Block;
/*	*/ import org.bukkit.entity.Player;
/*	*/ import org.ctp.enchantmentsolution.enchantments.CustomEnchantment;
/*	*/ import org.ctp.enchantmentsolution.enchantments.helper.EnchantmentLevel;
/*	*/ import org.ctp.enchantmentsolution.events.blocks.MultiBlockBreakEvent;
/*	*/ import org.ctp.esa.enchantments.AdditionsRegister;
/*	*/ 
/*	*/ public class DepthEvent extends MultiBlockBreakEvent {
/*	*/   private final Block block;
/*	*/   
/*	*/   private final Collection<Location> originalBlocks;
/*	*/   
/*	*/   public DepthEvent(Collection<Location> blocks, Player player, int level, Block block, Collection<Location> originalBlocks) {
/* 18 */	 super(blocks, player, new EnchantmentLevel((CustomEnchantment)AdditionsRegister.DEPTH_PLUS_PLUS, level));
/* 19 */	 this.block = block;
/* 20 */	 this.originalBlocks = originalBlocks;
/*	*/   }
/*	*/   
/*	*/   public Block getBlock() {
/* 24 */	 return this.block;
/*	*/   }
/*	*/   
/*	*/   public Collection<Location> getOriginalBlocks() {
/* 28 */	 return this.originalBlocks;
/*	*/   }
/*	*/ }


/* Location:			  D:\Downloads\EnchantmentSolutionAdditions\!\org\ctp\esa\events\DepthEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:	   1.1.3
 */