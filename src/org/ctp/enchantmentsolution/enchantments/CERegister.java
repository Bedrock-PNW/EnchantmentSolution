package org.ctp.enchantmentsolution.enchantments;

import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.ctp.enchantmentsolution.enchantments.helper.EnchantmentDescription;
import org.ctp.enchantmentsolution.enchantments.helper.EnchantmentDisplayName;
import org.ctp.enchantmentsolution.enchantments.helper.Weight;
import org.ctp.enchantmentsolution.enums.ItemType;
import org.ctp.enchantmentsolution.enums.Language;

public class CERegister extends CustomEnchantment {

	public static CERegister AQUA_AFFINITY = new CERegister("aqua_affinity", "Aqua Affinity",
	"Increases underwater mining rate.", Enchantment.WATER_WORKER, new int[] { 15, 1, 0, 0, 15, 1, 1, 1 },
	Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Wasseraffinität"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "水下速掘")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht die Unterwasserabbaugeschwindigkeit."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加水下挖掘速度.")),
	Arrays.asList(ItemType.HELMETS), Arrays.asList(ItemType.HELMETS),
	Arrays.asList(RegisterEnchantments.NO_REST, RegisterEnchantments.UNREST), false, true, false);
	public static CERegister BANE_OF_ARTHROPODS = new CERegister("bane_of_arthropods", "Bane of Arthropods",
	"Increases damage to \"arthropod\" mobs (spiders, cave spiders, silverfish and endermites).\nEach level separately adds 2.5 (half heart) extra damage to each hit, to \"arthropods\" only.\nThe enchantment will also cause \"arthropods\" to have the Slowness IV effect when hit.",
	Enchantment.DAMAGE_ARTHROPODS, new int[] { -4, -3, 9, 8, 1, 1, 6, 5 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Nemesis der Gliederfüßer"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "节肢杀手")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Erhöht den Schaden an \"Arthropoden\" -Mobs (Spinnen, Höhlenspinnen, Silberfischen und Endermiten).\nJedes Level fügt jedem Treffer separat 2,5 (halbes Herz) Schaden hinzu, nur für \"Arthropoden\".\nDie Verzauberung bewirkt auch, dass \"Arthropoden\" den Effekt von Slowness IV haben, wenn sie getroffen werden"),
	new EnchantmentDescription(Language.CHINA_SIMPLE,
	"增加对节肢生物的伤害(蜘蛛、洞穴蜘蛛、蠹虫和末影螨).\n每一级增加2.5点伤害.\n该附魔同时会给予节肢生物 缓慢IV 的效果.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS, ItemType.AXES),
	Arrays.asList(Enchantment.DAMAGE_ALL, Enchantment.DAMAGE_UNDEAD, RegisterEnchantments.QUICK_STRIKE));
	public static CERegister BLAST_PROTECTION = new CERegister("blast_protection", "Blast Protection",
	"Reduces explosion damage.\nAlso reduces explosion knockback by (15 * level)%. If multiple pieces have the enchantment, only the highest level's reduction is used.",
	Enchantment.PROTECTION_EXPLOSIONS, new int[] { -8, -3, 14, 8, 1, 1, 4, 4 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Explosionsshutz"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "爆炸保护")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Reduziert Explosionsschäden.\nVerringert außerdem den Explosionsrückschlag um (15 * Level)%.Wenn mehrere Teile die Verzauberung besitzen, wird nur die Reduzierung der höchsten Stufe verwendet."),
	new EnchantmentDescription(Language.CHINA_SIMPLE,
	"减少受到的爆炸伤害.\n同时减少爆炸击退 (15 * 等级)%. 如果多件装备拥有该附魔, 则只有最高级的附魔生效.")),
	Arrays.asList(ItemType.ARMOR), Arrays.asList(ItemType.ARMOR), Arrays.asList());
	public static CERegister CHANNELING = new CERegister("channeling", "Channeling",
	"Summons a lightning bolt when a mob is hit by a thrown trident.", Enchantment.CHANNELING,
	new int[] { 25, 25, 0, 0, 1, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Entladung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "引雷")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Beschwört einen Blitz, wenn ein Mob von einem geworfenen Dreizack getroffen wird."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "扔出三叉戟击中目标时召唤闪电.")),
	Arrays.asList(ItemType.TRIDENT), Arrays.asList(ItemType.TRIDENT), Arrays.asList(Enchantment.RIPTIDE), false,
	true, false);
	public static CERegister BINDING_CURSE = new CERegister("binding_curse", "Curse of Binding",
	"Prevents removal of the cursed item.\nThe cursed item cannot be removed from any armor slot (outside of Creative mode) unless the player dies or the item breaks.",
	Enchantment.BINDING_CURSE, new int[] { 25, 25, 0, 0, 1, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Fluch der Bindung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "绑定诅咒")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Verhindert das Entfernen des verfluchten Gegenstands.\nDer verfluchte Gegenstand kann nicht aus einem Rüstungsplatz (außerhalb des Kreativmodus) entfernt werden, es sei denn, der Spieler stirbt oder der Gegenstand zerbricht."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "无法从身上取下装备.\n除非玩家死亡或装备损坏.")),
	Arrays.asList(ItemType.ELYTRA, ItemType.ARMOR), Arrays.asList(ItemType.ELYTRA, ItemType.ARMOR),
	Arrays.asList(), true, true, true);
	public static CERegister VANISHING_CURSE = new CERegister("vanishing_curse", "Curse of Vanishing",
	"Causes the item to disappear on death.\nWhen the player dies, the item disappears instead of dropping on the ground. The item may still be dropped normally.",
	Enchantment.VANISHING_CURSE, new int[] { 25, 25, 0, 0, 1, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Fluch des Verschwindens"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "消失诅咒")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Bewirkt, dass der Gegenstand beim Tod verschwindet.\nWenn der Spieler stirbt, verschwindet der Gegenstand, anstatt auf den Boden zu fallen. Der Artikel kann noch normal abgeworfen werden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "使物品在玩家死亡时消失.")),
	Arrays.asList(ItemType.ENCHANTABLE), Arrays.asList(ItemType.ALL),
	Arrays.asList(RegisterEnchantments.SOULBOUND), true, true, true);
	public static CERegister DEPTH_STRIDER = new CERegister("depth_strider", "Depth Strider",
	"Increases underwater movement speed.", Enchantment.DEPTH_STRIDER, new int[] { 5, 0, 15, 10, 10, 1, 3, 3 },
	Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Wasserläufer"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "深海探索者")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Erhöht die Bewegungsgeschwindigkeit unter Wasser."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加水下移速.")),
	Arrays.asList(ItemType.BOOTS), Arrays.asList(ItemType.BOOTS), Arrays.asList(Enchantment.FROST_WALKER,
	RegisterEnchantments.MAGMA_WALKER, RegisterEnchantments.VOID_WALKER));
	public static CERegister EFFICIENCY = new CERegister("efficiency", "Efficiency",
	"Increases mining speed.\nOne must use the proper tool for a block in order to receive the speed. Does not matter if you mine it with the incorrect tier.",
	Enchantment.DIG_SPEED, new int[] { -11, -9, 12, 10, 1, 1, 6, 5 }, Weight.COMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Effizienz"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "效率")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Erhöht die Mining-Geschwindigkeit.\nMan muss das richtige Werkzeug für einen Block verwenden,um die Geschwindigkeit zu erhalten. Es spielt keine Rolle, wenn Sie es mit der falschen Stufe abbauen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加挖掘速度.\n玩家必须使用正确的工具才能增加挖掘速度.")),
	Arrays.asList(ItemType.TOOLS), Arrays.asList(ItemType.TOOLS, ItemType.SHEARS), Arrays.asList());
	public static CERegister FEATHER_FALLING = new CERegister("feather_falling", "Feather Falling",
	"Reduces fall damage.", Enchantment.PROTECTION_FALL, new int[] { -7, -1, 12, 6, 1, 1, 4, 4 },
	Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Federfall"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "摔落保护")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Reduziert Sturzschäden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "减少摔落伤害.")),
	Arrays.asList(ItemType.BOOTS), Arrays.asList(ItemType.BOOTS), Arrays.asList());
	public static CERegister FIRE_ASPECT = new CERegister("fire_aspect", "Fire Aspect",
	"Sets the target on fire.\nFire Aspect adds 80 fire ticks (4 seconds of burning) per level to the target.",
	Enchantment.FIRE_ASPECT, new int[] { -25, -10, 30, 20, 5, 1, 3, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Verbrennung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "火焰附加")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Setzt das Ziel in Brand.\nFeueraspekt fügt dem Ziel 80 Feuerzecken (4 Sekunden Brennen) pro Stufe hinzu."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "使目标着火.\n火焰附加每级持续4秒.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS),
	Arrays.asList(RegisterEnchantments.QUICK_STRIKE));
	public static CERegister FIRE_PROTECTION = new CERegister("fire_protection", "Fire Protection",
	"Reduces fire damage.", Enchantment.PROTECTION_FIRE, new int[] { -8, 2, 15, 8, 1, 1, 4, 4 },
	Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Feuerschutz"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "火焰保护")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Reduziert Feuerschäden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "减少受到的火焰伤害.")),
	Arrays.asList(ItemType.ARMOR), Arrays.asList(ItemType.ARMOR), Arrays.asList());
	public static CERegister FLAME = new CERegister("flame", "Flame",
	"Flaming arrows.\nArrows are on fire when shot and deal 4 (2 Hearts) fire damage over 5 seconds.",
	Enchantment.ARROW_FIRE, new int[] { 35, 20, 0, 0, 20, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Flamme"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "火矢")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Brennende Pfeile.\nPfeile brennen beim Schießen und verursachen 5 Sekunden lang 4 Feuerschaden"),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "点燃你发射的弓箭.\n5秒内造成4点燃烧伤害.")),
	Arrays.asList(ItemType.BOW), Arrays.asList(ItemType.BOW), Arrays.asList(), false, true, false);
	public static CERegister FORTUNE = new CERegister("fortune", "Fortune", "Increases block drops.",
	Enchantment.LOOT_BONUS_BLOCKS, new int[] { 7, 6, 11, 9, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Glück"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "时运")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht Blocktropfen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加物品掉落.")),
	Arrays.asList(ItemType.TOOLS), Arrays.asList(ItemType.TOOLS), Arrays.asList(Enchantment.SILK_TOUCH));
	public static CERegister FROST_WALKER = new CERegister("frost_walker", "Frost Walker",
	"Creates frosted ice blocks when walking over water.", Enchantment.FROST_WALKER,
	new int[] { 5, 5, 15, 10, 10, 1, 2, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Eisläufer"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "冰霜行者")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Erzeugt beim Gehen über Wasser gefrorene Eisblöcke."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "在水上行走时生成冰块.")),
	Arrays.asList(ItemType.BOOTS), Arrays.asList(ItemType.BOOTS), Arrays.asList(Enchantment.DEPTH_STRIDER,
	RegisterEnchantments.MAGMA_WALKER, RegisterEnchantments.VOID_WALKER),
	false, true, false);
	public static CERegister IMPALING = new CERegister("impaling", "Impaling",
	"Increases melee damage against aquatic mobs.\nAdds 2.5 (half heart) extra damage for each additional level.",
	Enchantment.IMPALING, new int[] { -12, 1, 13, 8, 1, 1, 6, 5 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Harpune"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "穿刺")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Erhöht Nahkampfschaden gegen Wassermobs.\nFügt für jede zusätzliche Stufe 2,5 (halbes Herz) zusätzlichen Schaden hinzu."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加对水生怪物的近战伤害.\n每级增加2.5的伤害.")),
	Arrays.asList(ItemType.TRIDENT), Arrays.asList(ItemType.TRIDENT), Arrays.asList());
	public static CERegister INFINITY = new CERegister("infinity", "Infinity",
	"Shooting doesn't consume regular arrows.", Enchantment.ARROW_INFINITE,
	new int[] { 35, 20, 0, 0, 20, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Unendlichkeit"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "无限")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Beim Schießen werden keine normalen Pfeile verbraucht."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "无限射箭.")),
	Arrays.asList(ItemType.BOW), Arrays.asList(ItemType.BOW), Arrays.asList(Enchantment.MENDING), false, true,
	false);
	public static CERegister KNOCKBACK = new CERegister("knockback", "Knockback", "Increases knockback.",
	Enchantment.KNOCKBACK, new int[] { -15, -15, 20, 20, 1, 1, 4, 2 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Rückstoß"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "击退")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht den Rückstoß."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加击退距离.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS),
	Arrays.asList(RegisterEnchantments.KNOCKUP));
	public static CERegister LOOTING = new CERegister("looting", "Looting", "Mobs can drop more loot.",
	Enchantment.LOOT_BONUS_MOBS, new int[] { 7, 6, 11, 9, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Plünderung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "抢夺")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Mobs können mehr Beute fallen lassen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "怪物掉落更多物品.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS), Arrays.asList());
	public static CERegister LOYALTY = new CERegister("loyalty", "Loyalty",
	"Returns a thrown trident after it hits something.", Enchantment.LOYALTY,
	new int[] { 7, 5, 11, 7, 1, 1, 3, 3 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Treue"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "忠诚")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Gibt einen geworfenen Dreizack zurück, nachdem er etwas getroffen hat."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "三叉戟击中后会返回到你手中.")),
	Arrays.asList(ItemType.TRIDENT), Arrays.asList(ItemType.TRIDENT), Arrays.asList(Enchantment.RIPTIDE));
	public static CERegister LUCK_OF_THE_SEA = new CERegister("luck_of_the_sea", "Luck of the Sea",
	"Increases luck while fishing.", Enchantment.LUCK, new int[] { 7, 5, 11, 10, 1, 1, 4, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Glück des Meeres"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "海之眷顾")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht das Glück beim Fischen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加钓鱼的幸运值.")),
	Arrays.asList(ItemType.FISHING_ROD), Arrays.asList(ItemType.FISHING_ROD), Arrays.asList());
	public static CERegister LURE = new CERegister("lure", "Lure",
	"Increases rate of fish biting your hook while fishing.", Enchantment.LURE,
	new int[] { 7, 5, 11, 10, 1, 1, 4, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Köder"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "饵钓")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erhöht die Rate der Fische, die sich beim Angeln an den Haken beißen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加鱼咬钩的几率.")),
	Arrays.asList(ItemType.FISHING_ROD), Arrays.asList(ItemType.FISHING_ROD), Arrays.asList());
	public static CERegister MENDING = new CERegister("mending", "Mending", "Repair durability with experience.",
	Enchantment.MENDING, new int[] { 25, 25, 0, 0, 20, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Reparatur"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "经验修补")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Haltbarkeit mit Erfahrung reparieren."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "使用经验修复物品.")),
	Arrays.asList(ItemType.ENCHANTABLE), Arrays.asList(ItemType.ALL), Arrays.asList(Enchantment.ARROW_INFINITE),
	false, true, true);
	public static CERegister MULTISHOT = new CERegister("multishot", "Multishot", "Shoot multiple arrows at once.",
	Enchantment.MULTISHOT, new int[] { 35, 20, 0, 0, 20, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Mehrfachschuss"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "多重射击")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Schießen Sie mehrere Pfeile gleichzeitig."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "一次射出多枝箭.")),
	Arrays.asList(ItemType.CROSSBOW), Arrays.asList(ItemType.CROSSBOW), Arrays.asList(Enchantment.PIERCING),
	false, true, false);
	public static CERegister PIERCING = new CERegister("piercing", "Piercing",
	"Arrows go through and attack multiple mobs.", Enchantment.PIERCING,
	new int[] { -14, -9, 15, 10, 1, 1, 5, 4 }, Weight.COMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Durchschuss"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "穿透")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Pfeile gehen durch und greifen mehrere Mobs an."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "弓箭可造成穿透伤害.")),
	Arrays.asList(ItemType.CROSSBOW), Arrays.asList(ItemType.CROSSBOW), Arrays.asList(Enchantment.MULTISHOT));
	public static CERegister POWER = new CERegister("power", "Power",
	"Increases arrow damage by 25% * (level + 1), rounded up to nearest half-heart.", Enchantment.ARROW_DAMAGE,
	new int[] { -10, -9, 11, 10, 1, 1, 6, 5 }, Weight.COMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Stärke"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "力量")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erhöht den Pfeilschaden um 25% * (Stufe + 1), aufgerundet auf das nächste Herz."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加弓箭伤害： 25% * (附魔等级 + 1).")),
	Arrays.asList(ItemType.BOW), Arrays.asList(ItemType.BOW), Arrays.asList());
	public static CERegister PROJECTILE_PROTECTION = new CERegister("projectile_protection", "Projectile Protection",
	"Reduces projectile damage (arrows, ghast/blaze fire charges, etc.).", Enchantment.PROTECTION_PROJECTILE,
	new int[] { -9, -3, 13, 6, 1, 1, 4, 4 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schusssicher"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "弹射物保护")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Reduziert Projektilbeschädigungen (Pfeile, Feuerschläge usw.)."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "减少受到的弹射物伤害 (弓箭、火球等).")),
	Arrays.asList(ItemType.ARMOR), Arrays.asList(ItemType.ARMOR), Arrays.asList());
	public static CERegister PROTECTION = new CERegister("protection", "Protection",
	"Reduces all damage, except damage from the Void, the /kill command, or hunger damage.",
	Enchantment.PROTECTION_ENVIRONMENTAL, new int[] { -15, -10, 16, 11, 1, 1, 4, 4 }, Weight.COMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schutz"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "保护")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Reduziert jeglichen Schaden, mit Ausnahme des Schadens durch die Leere, den Befehl / kill oder den Hunger-Schaden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "减少受到的所有伤害, 除了虚空伤害、/kill 自杀和饥饿伤害.")),
	Arrays.asList(ItemType.ARMOR), Arrays.asList(ItemType.ARMOR), Arrays.asList());
	public static CERegister PUNCH = new CERegister("punch", "Punch", "Increases knockback on bows.",
	Enchantment.ARROW_KNOCKBACK, new int[] { -8, -8, 20, 20, 1, 1, 3, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schlag"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "冲击")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht den Rückstoß an den Bögen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加弓箭击退距离.")),
	Arrays.asList(ItemType.BOW), Arrays.asList(ItemType.BOW), Arrays.asList());
	public static CERegister QUICK_CHARGE = new CERegister("quick_charge", "Quick Charge",
	"Places arrows in the crossbow faster.", Enchantment.QUICK_CHARGE,
	new int[] { -15, -8, 20, 20, 1, 1, 4, 3 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schnellladen"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "快速装填")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Setzen Sie die Pfeile schneller in die Armbrust."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加十字弓装填速度.")),
	Arrays.asList(ItemType.CROSSBOW), Arrays.asList(ItemType.CROSSBOW), Arrays.asList());
	public static CERegister RESPIRATION = new CERegister("respiration", "Respiration",
	"Extends underwater breathing time.", Enchantment.OXYGEN, new int[] { -5, 0, 15, 10, 1, 1, 3, 3 },
	Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Atmung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "水下呼吸")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Verlängert die Atmungszeit unter Wasser."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加水下呼吸时间.")),
	Arrays.asList(ItemType.HELMETS), Arrays.asList(ItemType.HELMETS), Arrays.asList());
	public static CERegister RIPTIDE = new CERegister("riptide", "Riptide",
	"Allows the trident to be used as a means of fast transportation.", Enchantment.RIPTIDE,
	new int[] { 7, 7, 11, 19, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Sog"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "激流")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Ermöglicht die Verwendung des Dreizackes als schnelles Transportmittel."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "可用三叉戟进行快速传送.")),
	Arrays.asList(ItemType.TRIDENT), Arrays.asList(ItemType.TRIDENT),
	Arrays.asList(Enchantment.CHANNELING, Enchantment.LOYALTY));
	public static CERegister SHARPNESS = new CERegister("sharpness", "Sharpness",
	"Increases melee damage.\nAdds 1 (half heart) extra damage for the first level, and 0.5 (half heart) for each additional level.",
	Enchantment.DAMAGE_ALL, new int[] { -12, -10, 13, 11, 1, 1, 6, 5 }, Weight.COMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schärfe"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "锋利")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Erhöht Nahkampfschaden.\nFügt 1 (halbes Herz) zusätzlichen Schaden für die erste Stufe und 0,5 (halbes Herz) für jede zusätzliche Stufe hinzu."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加近战伤害.\n1级增加1点伤害,每级增加0.5点（半颗心）伤害.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS, ItemType.AXES),
	Arrays.asList(Enchantment.DAMAGE_ARTHROPODS, Enchantment.DAMAGE_UNDEAD, RegisterEnchantments.QUICK_STRIKE));
	public static CERegister SILK_TOUCH = new CERegister("silk_touch", "Silk Touch",
	"Mined blocks drop themselves instead of the usual items.\nAllows collection of blocks that are normally unobtainable.",
	Enchantment.SILK_TOUCH, new int[] { 35, 15, 0, 0, 20, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Behutsamkeit"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "精准采集")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Abgebaute Blöcke lassen sich anstelle der üblichen Gegenstände fallen.\nErmöglicht das Sammeln von Blöcken, die normalerweise nicht erreichbar sind."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "挖掘方块可获得原样的方块.")),
	Arrays.asList(ItemType.TOOLS), Arrays.asList(ItemType.TOOLS),
	Arrays.asList(Enchantment.LOOT_BONUS_BLOCKS, RegisterEnchantments.SMELTERY), false, true, false);
	public static CERegister SMITE = new CERegister("smite", "Smite",
	"Increases damage to \"undead\" mobs (skeletons, zombies, withers, wither skeletons, zombie pigmen, skeleton horses and zombie horses)\nEach level separately adds 2.5 (half heart) extra damage to each hit, to \"undead\" mobs only.",
	Enchantment.DAMAGE_UNDEAD, new int[] { -4, -3, 9, 8, 1, 1, 6, 5 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Bann"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "亡灵杀手")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Erhöht den Schaden \"untoter\" Mobs (Skelette, Zombies, Widerrist, Widerrist-Skelette, Zombie-Schweiner, Skelettpferde und Zombie-Pferde).\nJeder Level fügt jedem Treffer separat 2,5 (halbes Herz) zusätzlichen Schaden hinzu, nur \"Untoten\" -Mobs."),
	new EnchantmentDescription(Language.CHINA_SIMPLE,
	"增加对亡灵生物造成的伤害(骷髅、僵尸、凋灵、凋灵骷髅、骷髅马、僵尸猪人等)\n每级增加2.5点伤害.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS, ItemType.AXES),
	Arrays.asList(Enchantment.DAMAGE_ARTHROPODS, Enchantment.DAMAGE_ALL, RegisterEnchantments.QUICK_STRIKE));
	public static CERegister SWEEPING_EDGE = new CERegister("sweeping_edge", "Sweeping Edge",
	"Increases sweeping attack damage.", Enchantment.SWEEPING_EDGE, new int[] { -7, -4, 12, 9, 1, 1, 3, 3 },
	Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schwungkraft"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "横扫之刃")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht den Angriffsschaden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加横扫伤害.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS), Arrays.asList());
	public static CERegister THORNS = new CERegister("thorns", "Thorns",
	"Attackers are damaged when they attack the wearer. This does additional durability damage to armor.",
	Enchantment.THORNS, new int[] { 10, -10, 20, 20, 20, 1, 3, 3 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Dornen"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "荆棘")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Angreifer werden beschädigt, wenn sie den Träger angreifen. Dies führt auch zu einer zusätzlichen Haltbarkeit der Rüstung."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "反伤.消耗更多耐久.")),
	Arrays.asList(ItemType.ARMOR), Arrays.asList(ItemType.ARMOR), Arrays.asList());
	public static CERegister UNBREAKING = new CERegister("unbreaking", "Unbreaking", "Increases effective durability.",
	Enchantment.DURABILITY, new int[] { -10, -3, 15, 8, 1, 1, 5, 3 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Haltbarkeit"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "耐久")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht die effektive Haltbarkeit."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加物品使用耐久.")),
	Arrays.asList(ItemType.ENCHANTABLE), Arrays.asList(ItemType.ALL), Arrays.asList());
	public static CERegister ANGLER = new CERegister("angler", "Angler",
	"Catch one additional fish per level if you caught a fish.", RegisterEnchantments.ANGLER,
	new int[] { 0, 0, 10, 8, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Profiangler"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "垂钓者")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Fangen Sie einen zusätzlichen Fisch pro Level, wenn Sie einen Fisch fangen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加钓到的鱼数量.")),
	Arrays.asList(ItemType.FISHING_ROD), Arrays.asList(ItemType.FISHING_ROD), Arrays.asList());
	public static CERegister ARMORED = new CERegister("armored", "Armored", "Adds armor points for wearing elytra.",
	RegisterEnchantments.ARMORED, new int[] { 20, 5, 15, 10, 30, 1, 3, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Gepanzert"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "守护之翼")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Fügt Rüstungspunkte für das Tragen von Elytren hinzu."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "穿戴鞘翅增加护甲值.")),
	Arrays.asList(ItemType.ELYTRA), Arrays.asList(ItemType.ELYTRA), Arrays.asList());
	public static CERegister BEHEADING = new CERegister("beheading", "Beheading",
	"Adds a chance to drop mob heads on death.", RegisterEnchantments.BEHEADING,
	new int[] { 10, 5, 20, 12, 20, 1, 3, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Beheading"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "斩首")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Fügt dem Tod die Chance hinzu, Mobköpfe abzulegen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "在击杀怪物时有几率获得怪物的头.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS, ItemType.AXES), Arrays.asList());
	public static CERegister BRINE = new CERegister("brine", "Brine",
	"Doubles damage if opposing mob is below 50% health.", RegisterEnchantments.BRINE,
	new int[] { 30, 25, 0, 0, 25, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Salzlake"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "撒盐")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Verdoppelt den Schaden, wenn die gegnerische Menge weniger als 50% Gesundheit hat."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "当怪物血量低于一半时对怪物造成双倍伤害.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS, ItemType.AXES), Arrays.asList(), false, true,
	false);
	public static CERegister CURSE_OF_CONTAGION = new CERegister("contagion_curse", "Curse of Contagion",
	"Spreads curses to items in your inventory.", RegisterEnchantments.CURSE_OF_CONTAGION,
	new int[] { 25, 25, 0, 0, 1, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Fluch der Ansteckung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "Curse of Contagion")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Verteilt Flüche auf Gegenstände in Ihrem Inventar."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "Spreads curses to items in your inventory.")),
	Arrays.asList(ItemType.ENCHANTABLE), Arrays.asList(ItemType.ALL), Arrays.asList(), true, true, true);
	public static CERegister CURSE_OF_EXHAUSTION = new CERegister("exhaustion_curse", "Curse of Exhaustion",
	"Increases exhaustion when equipped.", RegisterEnchantments.CURSE_OF_EXHAUSTION,
	new int[] { 25, 25, 0, 0, 1, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Fluch der Erschöpfung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "疲劳诅咒")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht die Erschöpfung, wenn ausgerüstet."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "穿戴装备时使你感到浑身无力.")),
	Arrays.asList(ItemType.ENCHANTABLE), Arrays.asList(ItemType.ALL), Arrays.asList(), true, true, true);
	public static CERegister CURSE_OF_LAG = new CERegister("lagging_curse", "Curse of Lag", "Ah, fireworks!",
	RegisterEnchantments.CURSE_OF_LAG, new int[] { 25, 25, 0, 0, 1, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Fluch der Verzögerung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "卡顿诅咒")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Ah, Feuerwerk!"),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "啊啊啊!是烟花")),
	Arrays.asList(ItemType.TOOLS, ItemType.MELEE, ItemType.RANGED),
	Arrays.asList(ItemType.TOOLS, ItemType.MELEE, ItemType.RANGED), Arrays.asList(), true, true, true);
	public static CERegister DETONATOR = new CERegister("detonator", "Detonator", "Ignites creepers. Triggers an explosion based on the enchantment level.",
	RegisterEnchantments.DETONATOR, new int[] { 4, 7, 13, 9, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Zünder"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "Detonator")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Zündet Creeper. Löst eine Explosion basierend auf der Verzauberungsstufe aus."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "Ignites creepers. Triggers an explosion based on the enchantment level.")),
	Arrays.asList(ItemType.BOW, ItemType.CROSSBOW), Arrays.asList(ItemType.BOW, ItemType.CROSSBOW), Arrays.asList(RegisterEnchantments.HOLLOW_POINT));
	public static CERegister DROWNED = new CERegister("drowned", "Drowned", "Drown non-water mobs for a short time.",
	RegisterEnchantments.DROWNED, new int[] { 10, 0, 20, 12, 20, 1, 3, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Ertrinken"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "淹浸")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Ertrinken Sie nicht Wasser-Mobs für kurze Zeit."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "将非水生动物浸入水中.")),
	Arrays.asList(ItemType.TRIDENT), Arrays.asList(ItemType.TRIDENT), Arrays.asList());
	public static CERegister EXP_SHARE = new CERegister("exp_share", "Exp. Share",
	"Increase experience earned from killing mobs and breaking blocks.", RegisterEnchantments.EXP_SHARE,
	new int[] { 0, -2, 20, 12, 1, 1, 3, 3 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Erfahrung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "经验分享")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erhöhen Sie die Erfahrung durch das Töten von Mobs und Blockaden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加击杀怪物和破坏方块获得的经验.")),
	Arrays.asList(ItemType.SWORDS, ItemType.TOOLS, ItemType.TRIDENT),
	Arrays.asList(ItemType.SWORDS, ItemType.TOOLS, ItemType.TRIDENT), Arrays.asList());
	public static CERegister FLOWER_GIFT = new CERegister("flower_gift", "Flower Gift",
	"Has a chance of dropping flowers when right clicking them.", RegisterEnchantments.FLOWER_GIFT,
	new int[] { 30, 20, 0, 0, 20, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Blumengeschenk"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "花之礼")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Hat eine Chance, Blumen fallen zu lassen, wenn Sie mit der rechten Maustaste darauf klicken."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "右击花有几率获得花.")),
	Arrays.asList(ItemType.BOOK), Arrays.asList(ItemType.HOES),
	Arrays.asList(RegisterEnchantments.GOLD_DIGGER, RegisterEnchantments.SOUL_REAPER), false, true, false);
	public static CERegister FREQUENT_FLYER = new CERegister("frequent_flyer", "Frequent Flyer",
	"Allows flight. Durability damage every (3 * level) seconds when below 255 height and every (level) seconds above 255 height. Removes flight at 32 durability.",
	RegisterEnchantments.FREQUENT_FLYER, new int[] { 20, 5, 15, 10, 30, 1, 3, 3 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Vielflieger"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "御空")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Erlaubt den Flug. Haltbarkeitsschaden alle (3 * Level) Sekunden, wenn die Höhe unter 255 liegt, und jede (Level) Sekunde über 255 Höhe. Entfernt den Flug bei 32 Haltbarkeit."),
	new EnchantmentDescription(Language.CHINA_SIMPLE,
	"可以让你飞行.在低于255格高度飞行时每(3 * 附魔等级)秒消耗耐久.在高空则每(附魔等级)秒消耗耐久. 耐久低于32时无法飞行.")),
	Arrays.asList(ItemType.BOOK), Arrays.asList(ItemType.ELYTRA), Arrays.asList(RegisterEnchantments.ICARUS));
	public static CERegister FRIED = new CERegister("fried", "Fried", "Cooks fish upon catching them.",
	RegisterEnchantments.FRIED, new int[] { 40, 15, 0, 0, 30, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Fritieren"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "烤鱼")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Köche Fische, wenn sie gefangen werden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "捕鱼后直接烤鱼.")),
	Arrays.asList(ItemType.FISHING_ROD), Arrays.asList(ItemType.FISHING_ROD), Arrays.asList(), false, true,
	false);
	public static CERegister GOLD_DIGGER = new CERegister("gold_digger", "Gold Digger",
	"Earn experience and gold nuggets for breaking crops.", RegisterEnchantments.GOLD_DIGGER,
	new int[] { -2, -10, 12, 11, 10, 1, 6, 5 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Goldgräber"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "淘金")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Sammeln Sie Erfahrung und Gold-Nuggets f�r das Ernten."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "破坏农作物获得经验和金粒.")),
	Arrays.asList(ItemType.HOES), Arrays.asList(ItemType.HOES), Arrays.asList());
	public static CERegister GUNG_HO = new CERegister("gung_ho", "Gung-Ho",
	"Decreases health by half. All attacks do 3 times the damage.", RegisterEnchantments.GUNG_HO,
	new int[] { 40, 20, 0, 0, 30, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Gung-Ho"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "炼血")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Verringert die Gesundheit um die H�lfte. Alle Angriffe verursachen das Dreifache des Schadens."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "将血量降为5颗心. 你的所有攻击会造成3倍伤害.")),
	Arrays.asList(ItemType.CHESTPLATES), Arrays.asList(ItemType.CHESTPLATES),
	Arrays.asList(RegisterEnchantments.LIFE), false, true, false);
	public static CERegister HARD_BOUNCE = new CERegister("hard_bounce", "Hard Bounce",
	"Projectiles bounce back from the shield.", RegisterEnchantments.HARD_BOUNCE,
	new int[] { -4, -4, 14, 12, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Harter Aufprall"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "盾反")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Projektile springen vom Schild zurück."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "反弹弹射物.")),
	Arrays.asList(ItemType.SHIELD), Arrays.asList(ItemType.SHIELD),
	Arrays.asList(RegisterEnchantments.IRON_DEFENSE));
	public static CERegister HEIGHT_PLUS_PLUS = new CERegister("height_plus_plus", "Height++",
	"Increase up/down break radius by 1 per level.", RegisterEnchantments.HEIGHT_PLUS_PLUS,
	new int[] { 0, -10, 20, 20, 15, 1, 3, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Höhe++"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "纵掘千古")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erhöhen Sie den Aufwärts- / Abwärtsbruch-Radius um 1 pro Ebene."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加纵向挖掘范围.")),
	Arrays.asList(ItemType.TOOLS), Arrays.asList(ItemType.TOOLS), Arrays.asList());
	public static CERegister HOLLOW_POINT = new CERegister("hollow_point", "Hollow Point",
	"Increases damage to armored mobs. Allows projectile damage against enderman and armored wither.", RegisterEnchantments.HOLLOW_POINT,
	new int[] { 40, 30, 0, 0, 30, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Hohlpunkt"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "Hollow Point")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erhöht den Schaden von gepanzerten Mobs. Ermöglicht Projektilschaden gegen Enderman und gepanzerten Widerrist."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "Increases damage to armored mobs. Allows projectile damage against enderman and armored wither.")),
	Arrays.asList(ItemType.BOW, ItemType.CROSSBOW), Arrays.asList(ItemType.BOW, ItemType.CROSSBOW),
	Arrays.asList(RegisterEnchantments.DETONATOR));
	public static CERegister ICARUS = new CERegister("icarus", "Icarus",
	"Flying upwards will occassionally increase velocity.", RegisterEnchantments.ICARUS,
	new int[] { 8, 5, 12, 10, 20, 1, 5, 3 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Ikarus"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "伊卡洛斯")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Aufwärtsfliegen erhöht gelegentlich die Geschwindigkeit."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "向上飞行有时会增加速度.")),
	Arrays.asList(ItemType.BOOK), Arrays.asList(ItemType.ELYTRA),
	Arrays.asList(RegisterEnchantments.FREQUENT_FLYER));
	public static CERegister IRENES_LASSO = new CERegister("lasso_of_irene", "Irene's Lasso",
	"Grabs animals to carry around with you and place later.", RegisterEnchantments.IRENES_LASSO,
	new int[] { 0, 15, 30, 0, 30, 1, 2, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Lasso von Irene"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "艾琳的套索")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Greift Tiere zum Mitnehmen und Platzieren später."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "捕捉和放置动物.")),
	Arrays.asList(ItemType.BOOK), Arrays.asList(ItemType.CARROT_ON_A_STICK),
	Arrays.asList(RegisterEnchantments.WAND));
	public static CERegister IRON_DEFENSE = new CERegister("iron_defense", "Iron Defense",
	"Having the shield equipped will redirect damage to the shield.", RegisterEnchantments.IRON_DEFENSE,
	new int[] { -4, -4, 14, 12, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Eiserne Verteidigung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "钢铁之护")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Wenn der Schild ausgerüstet ist, werden Schäden am Schild umgeleitet."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "使用盾牌可反伤.")),
	Arrays.asList(ItemType.SHIELD), Arrays.asList(ItemType.SHIELD),
	Arrays.asList(RegisterEnchantments.HARD_BOUNCE));
	public static CERegister KNOCKUP = new CERegister("knockup", "Knockup", "Increases knockback upwards.",
	RegisterEnchantments.KNOCKUP, new int[] { -15, 5, 20, 10, 1, 1, 4, 2 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Werfen"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "升龙")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht den Rückstoß nach oben."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加向上的击退.")),
	Arrays.asList(ItemType.SWORDS), Arrays.asList(ItemType.SWORDS), Arrays.asList(Enchantment.KNOCKBACK));
	public static CERegister LIFE = new CERegister("life", "Life",
	"Increases maximum health by 4 (half hearts) per level when worn.", RegisterEnchantments.LIFE,
	new int[] { -5, -5, 25, 15, 10, 1, 3, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Leben"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "生命")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erhöht die maximale Gesundheit um 4 (halbe Herzen) pro Level, wenn er getragen wird."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "每级增加半颗血量上限.")),
	Arrays.asList(ItemType.CHESTPLATES), Arrays.asList(ItemType.CHESTPLATES),
	Arrays.asList(RegisterEnchantments.GUNG_HO));
	public static CERegister MAGIC_GUARD = new CERegister("magic_guard", "Magic Guard", "Negates bad potion effects.",
	RegisterEnchantments.MAGIC_GUARD, new int[] { 30, 25, 0, 0, 25, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Magischer Schutz"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "清醒")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Negiert schlechte Trankeffekte."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "清除负面药水效果.")),
	Arrays.asList(ItemType.SHIELD), Arrays.asList(ItemType.SHIELD), Arrays.asList(), false, true, false);
	public static CERegister MAGMA_WALKER = new CERegister("magma_walker", "Magma Walker",
	"Allows players to walk on lava, turning it into magma.", RegisterEnchantments.MAGMA_WALKER,
	new int[] { 5, 5, 15, 10, 10, 1, 2, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Lavaläufer"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "熔岩行者")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erlaubt es den Spielern, auf Lava zu gehen und sie in Magma umzuwandeln."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "可以让玩家在岩浆上行走.")),
	Arrays.asList(ItemType.BOOTS), Arrays.asList(ItemType.BOOTS),
	Arrays.asList(Enchantment.FROST_WALKER, Enchantment.DEPTH_STRIDER, RegisterEnchantments.VOID_WALKER), false,
	false, true);
	public static CERegister MOISTURIZE = new CERegister("moisturize", "Moisturize",
	"Waters blocks by right clicking them.", RegisterEnchantments.MOISTURIZE,
	new int[] { 50, 35, 0, 0, 20, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Befeuchten"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "湿润")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Befeuchtet Blöcke durch Rechtsklick."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "右击方块进行湿润.")),
	Arrays.asList(ItemType.BOOK), Arrays.asList(ItemType.SHEARS), Arrays.asList(), false, true, false);
	public static CERegister NO_REST = new CERegister("no_rest", "No Rest", "No phantoms will spawn around you.",
	RegisterEnchantments.NO_REST, new int[] { 15, 1, 0, 0, 15, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Keine Pause"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "安眠")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Es werden keine Phantome um Sie herum erscheinen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "你附近不会生成幻翼.")),
	Arrays.asList(ItemType.HELMETS), Arrays.asList(ItemType.HELMETS),
	Arrays.asList(RegisterEnchantments.UNREST, Enchantment.WATER_WORKER), false, true, false);
	public static CERegister OVERKILL = new CERegister("overkill", "Overkill",
	"Shoot arrows by left-clicking.", RegisterEnchantments.OVERKILL,
	new int[] { 35, 15, 0, 0, 20, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Overkill"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "Overkill")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Schieße mit der linken Maustaste auf die Pfeile."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "Shoot arrows by left-clicking.")),
	Arrays.asList(ItemType.BOW), Arrays.asList(ItemType.BOW),
	Arrays.asList(RegisterEnchantments.DETONATOR), false, true, false);
	public static CERegister PILLAGE = new CERegister("pillage", "Pillage", "Increases mob drops.",
	RegisterEnchantments.PILLAGE, new int[] { 7, 6, 11, 9, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Plündern"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "劫掠")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht Mob-Tropfen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加怪物掉落.")),
	Arrays.asList(ItemType.CROSSBOW), Arrays.asList(ItemType.CROSSBOW), Arrays.asList());
	public static CERegister QUICK_STRIKE = new CERegister("quick_strike", "Quick Strike", "Increases attack speed.",
	RegisterEnchantments.QUICK_STRIKE, new int[] { 7, 6, 11, 9, 1, 1, 5, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schneller Schlag"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "迅捷打击")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht die Angriffsgeschwindigkeit"),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加攻速.")),
	Arrays.asList(ItemType.SWORDS, ItemType.AXES), Arrays.asList(ItemType.SWORDS, ItemType.AXES),
	Arrays.asList(Enchantment.DAMAGE_ALL, Enchantment.DAMAGE_ARTHROPODS, Enchantment.DAMAGE_UNDEAD,
	Enchantment.FIRE_ASPECT, RegisterEnchantments.SHOCK_ASPECT));
	public static CERegister SACRIFICE = new CERegister("sacrifice", "Sacrifice",
	"Damage the mob who killed you based upon your experience level.", RegisterEnchantments.SACRIFICE,
	new int[] { 35, 15, 15, 15, 30, 1, 2, 2 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Opferung"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "牺牲")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Zerstöre den Mob, der dich getötet hat, basierend auf deinem Erfahrungslevel."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "基于你的经验等级对杀死你的怪物造成伤害.")),
	Arrays.asList(ItemType.CHESTPLATES), Arrays.asList(ItemType.CHESTPLATES), Arrays.asList());
	public static CERegister SAND_VEIL = new CERegister("sand_veil", "Sand Veil",
	"Lowers accuracy of entity's attacks.", RegisterEnchantments.SAND_VEIL,
	new int[] { -12, -10, 13, 11, 1, 1, 6, 5 }, Weight.COMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Sandschleier"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "沙隐")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN, "Verringert die Genauigkeit der Angriffe der Entität."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "降低实体攻击的精准度.")),
	Arrays.asList(ItemType.HOES), Arrays.asList(ItemType.HOES), Arrays.asList());
	public static CERegister SHOCK_ASPECT = new CERegister("shock_aspect", "Shock Aspect",
	"Has a chance to strike lightning on attacked mobs.", RegisterEnchantments.SHOCK_ASPECT,
	new int[] { -15, -10, 20, 20, 5, 1, 3, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schock"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "雷击")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Hat eine Chance, angegriffene Mobs mit Blitzen zu treffen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "攻击时有几率雷击怪物.")),
	Arrays.asList(ItemType.AXES), Arrays.asList(ItemType.AXES),
	Arrays.asList(RegisterEnchantments.QUICK_STRIKE));
	public static CERegister SMELTERY = new CERegister("smeltery", "Smeltery", "Smelts blocks while mining.",
	RegisterEnchantments.SMELTERY, new int[] { 40, 20, 0, 0, 30, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Schmelzen"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "熔炼")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Schmelzen Blöcke während des Bergbaus."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "挖掘方块的同时进行熔炼.")),
	Arrays.asList(ItemType.TOOLS), Arrays.asList(ItemType.TOOLS), Arrays.asList(Enchantment.SILK_TOUCH), false,
	true, false);
	public static CERegister SNIPER = new CERegister("sniper", "Sniper", "Increases speed of projectiles.",
	RegisterEnchantments.SNIPER, new int[] { 12, 5, 18, 10, 25, 1, 3, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Sniper"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "狙击手")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht die Geschwindigkeit von Geschossen."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加弹射物速度.")),
	Arrays.asList(ItemType.RANGED), Arrays.asList(ItemType.RANGED), Arrays.asList());
	public static CERegister SOULBOUND = new CERegister("soulbound", "Soulbound", "Keep items on death.",
	RegisterEnchantments.SOULBOUND, new int[] { 40, 30, 0, 0, 30, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Seelengebunden"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "灵魂绑定")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Behalte den Gegenstand auf dem Tod."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "死亡保留物品.")),
	Arrays.asList(ItemType.TOOLS, ItemType.MELEE, ItemType.RANGED, ItemType.ARMOR),
	Arrays.asList(ItemType.ALL, ItemType.SHULKER_BOXES), Arrays.asList(Enchantment.VANISHING_CURSE), false,
	true, false);
	public static CERegister SOUL_REAPER = new CERegister("soul_reaper", "Soul Reaper",
	"Steals one item enchanted with Soulbound per level when killing players.",
	RegisterEnchantments.SOUL_REAPER, new int[] { 20, 18, 12, 10, 25, 1, 4, 2 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Seelendieb"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "灵魂收割者")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Stiehlt einen seelengebundenen Gegenstand pro Stufe, wenn Spieler getötet werden."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "杀死玩家时，为每个级别窃取一个灵魂绑定项目.")),
	Arrays.asList(ItemType.BOOK), Arrays.asList(ItemType.HOES), Arrays.asList());
	public static CERegister SPLATTER_FEST = new CERegister("splatter_fest", "Splatter Fest",
	"Shoots eggs out of hoe on left click.", RegisterEnchantments.SPLATTER_FEST,
	new int[] { 25, 25, 0, 0, 20, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Ei Splatter"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "飞蛋")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Schießt mit dem Linksklick Eier aus der Hacke."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "左击发射鸡蛋.")),
	Arrays.asList(ItemType.HOES), Arrays.asList(ItemType.HOES), Arrays.asList(), false, true, false);
	public static CERegister STONE_THROW = new CERegister("stone_throw", "Stone Throw",
	"Increases ranged damage against flying mobs.\nAdds 40% * level + 20% damage against flying mobs.",
	RegisterEnchantments.STONE_THROW, new int[] { -12, -10, 13, 11, 1, 1, 6, 5 }, Weight.COMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Steinwurf"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "投石")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Erhöht den Distanzschaden gegen fliegende Mobs.\nFügt 40% * Level + 20% Schaden gegen fliegende Mobs hinzu."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加对飞行怪物的范围伤害.\n增加40% * 附魔等级 + 20% 点伤害.")),
	Arrays.asList(ItemType.CROSSBOW), Arrays.asList(ItemType.CROSSBOW), Arrays.asList());
	public static CERegister TANK = new CERegister("tank", "Tank", "Gives additional unbreaking protection to armor.",
	RegisterEnchantments.TANK, new int[] { 10, -5, 20, 15, 20, 1, 3, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Panzer"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "坦克")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Verleiht der Rüstung zusätzlichen Schutz."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "给予装备额外的耐久保护.")),
	Arrays.asList(ItemType.ARMOR), Arrays.asList(ItemType.ARMOR), Arrays.asList());
	public static CERegister TELEPATHY = new CERegister("telepathy", "Telepathy",
	"Items mined go straight into your inventory.", RegisterEnchantments.TELEPATHY,
	new int[] { 65, 35, 0, 0, 40, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Telepathie"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "感应")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Abgebaute Gegenstände gelangen direkt in Ihr Inventar."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "你挖掘的物品会直接放到你的背包内.")),
	Arrays.asList(ItemType.TOOLS), Arrays.asList(ItemType.TOOLS), Arrays.asList(), false, true, false);
	public static CERegister TOUGHNESS = new CERegister("toughness", "Toughness", "Increases armor toughness.",
	RegisterEnchantments.TOUGHNESS, new int[] { -15, -10, 16, 11, 1, 1, 4, 4 }, Weight.UNCOMMON,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Rüstungshärte"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "坚韧")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Erhöht die Rüstungsstärke."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "增加装备强度.")),
	Arrays.asList(ItemType.ARMOR), Arrays.asList(ItemType.ARMOR), Arrays.asList());
	public static CERegister TRANSMUTATION = new CERegister("transmutation", "Transmutation",
	"On killing mobs, all non-sea drop items become sea drop items.", RegisterEnchantments.TRANSMUTATION,
	new int[] { 65, 35, 0, 0, 40, 1, 1, 1 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Transmutation"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "洋化")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN,
	"Beim Töten von Mobs werden alle Gegenstände, die nicht aus dem Meer stammen, zu Teilen aus dem Meer."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "击杀怪物后,所有非海洋掉落物会转化成海洋掉落物.")),
	Arrays.asList(ItemType.TRIDENT), Arrays.asList(ItemType.TRIDENT), Arrays.asList(), false, true, false);
	public static CERegister UNREST = new CERegister("unrest", "Unrest",
	"Night vision at the cost of more phantom spawning.", RegisterEnchantments.UNREST,
	new int[] { 15, 1, 0, 0, 15, 1, 1, 1 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Unruhe"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "躁动")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Nachtsicht auf Kosten eines Phantomlaichens."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "获得夜视效果，但是会有更多幻翼生成.")),
	Arrays.asList(ItemType.HELMETS), Arrays.asList(ItemType.HELMETS),
	Arrays.asList(Enchantment.WATER_WORKER, RegisterEnchantments.NO_REST), false, true, false);
	public static CERegister VOID_WALKER = new CERegister("void_walker", "Void Walker",
	"Allows players to walk on air, turning it into obsidian.", RegisterEnchantments.VOID_WALKER,
	new int[] { 5, 5, 15, 10, 10, 1, 2, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Ungültiger Läufer"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "虚空行者")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erlaubt es den Spielern, in der Luft zu gehen und es in Obsidian umzuwandeln."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "可以让玩家在空气中行走并转化为黑曜石.")),
	Arrays.asList(ItemType.BOOTS), Arrays.asList(ItemType.BOOTS),
	Arrays.asList(Enchantment.FROST_WALKER, Enchantment.DEPTH_STRIDER, RegisterEnchantments.MAGMA_WALKER),
	false, true, true);
	public static CERegister WAND = new CERegister("wand", "Wand", "Places blocks from the offhand.",
	RegisterEnchantments.WAND, new int[] { 20, 10, 15, 10, 30, 1, 3, 2 }, Weight.VERY_RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Zauberstab"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "法杖")),
	Arrays.asList(new EnchantmentDescription(Language.GERMAN, "Platziert Blöcke von der Nebenhand."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "放置副手的方块.")),
	Arrays.asList(ItemType.BOOK), Arrays.asList(ItemType.CARROT_ON_A_STICK),
	Arrays.asList(RegisterEnchantments.IRENES_LASSO));
	public static CERegister WARP = new CERegister("warp", "Warp",
	"Gives a chance of teleporting a small distance away on hit.", RegisterEnchantments.WARP,
	new int[] { -5, -7, 20, 14, 10, 1, 3, 3 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Warp"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "传送")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Gibt eine Chance, bei einem Treffer eine kleine Entfernung zu teleportieren."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "有几率在受伤时进行传送.")),
	Arrays.asList(ItemType.LEGGINGS), Arrays.asList(ItemType.LEGGINGS), Arrays.asList());
	public static CERegister WIDTH_PLUS_PLUS = new CERegister("width_plus_plus", "Width++",
	"Increase left/right break radius by 1 per level.", RegisterEnchantments.WIDTH_PLUS_PLUS,
	new int[] { 0, -10, 20, 20, 15, 1, 3, 2 }, Weight.RARE,
	Arrays.asList(new EnchantmentDisplayName(Language.GERMAN, "Breite++"),
	new EnchantmentDisplayName(Language.CHINA_SIMPLE, "横毁八荒")),
	Arrays.asList(
	new EnchantmentDescription(Language.GERMAN,
	"Erhöhen Sie den linken / rechten Umbruchradius um 1 pro Ebene."),
	new EnchantmentDescription(Language.CHINA_SIMPLE, "每级增加1格横向挖掘范围.")),
	Arrays.asList(ItemType.TOOLS), Arrays.asList(ItemType.TOOLS), Arrays.asList());

	private final Enchantment relative;
	private List<ItemType> enchantmentItems, anvilItems;
	private List<Enchantment> conflictingEnchantments;
	private String name;

	private CERegister(String name, String englishDisplay, String englishDescription, Enchantment relative,
	int[] enchantability, Weight weight, List<EnchantmentDisplayName> names,
	List<EnchantmentDescription> descriptions, List<ItemType> enchantmentItems, List<ItemType> anvilItems,
	List<Enchantment> conflictingEnchantments) {
		this(name, englishDisplay, englishDescription, relative, enchantability, weight, names, descriptions,
		enchantmentItems, anvilItems, conflictingEnchantments, false, false, false);
	}

	private CERegister(String name, String englishDisplay, String englishDescription, Enchantment relative,
	int[] enchantability, Weight weight, List<EnchantmentDisplayName> names,
	List<EnchantmentDescription> descriptions, List<ItemType> enchantmentItems, List<ItemType> anvilItems,
	List<Enchantment> conflictingEnchantments, boolean curse, boolean maxLevelOne, boolean treasure) {
		super(englishDisplay, enchantability[0], enchantability[1], enchantability[2], enchantability[3],
		enchantability[4], enchantability[5], enchantability[6], enchantability[7], weight, englishDescription);
		this.name = name;
		this.relative = relative;
		this.enchantmentItems = enchantmentItems;
		this.anvilItems = anvilItems;
		this.conflictingEnchantments = conflictingEnchantments;
		for(EnchantmentDisplayName n: names) {
			addDefaultDisplayName(n);
		}
		for(EnchantmentDescription d: descriptions) {
			addDefaultDescription(d);
		}
		setCurse(curse);
		setMaxLevelOne(maxLevelOne);
		setTreasure(treasure);
	}

	@Override
	public Enchantment getRelativeEnchantment() {
		return relative;
	}

	@Override
	protected List<ItemType> getEnchantmentItemTypes() {
		return enchantmentItems;
	}

	@Override
	protected List<ItemType> getAnvilItemTypes() {
		return anvilItems;
	}

	@Override
	protected List<Enchantment> getDefaultConflictingEnchantments() {
		return conflictingEnchantments;
	}

	@Override
	public String getName() {
		return name;
	}
}
