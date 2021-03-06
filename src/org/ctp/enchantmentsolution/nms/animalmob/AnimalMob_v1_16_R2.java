package org.ctp.enchantmentsolution.nms.animalmob;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.DyeColor;
import org.bukkit.entity.*;
import org.bukkit.entity.Cat.Type;
import org.bukkit.entity.Horse.Color;
import org.bukkit.entity.Horse.Style;
import org.bukkit.entity.Panda.Gene;
import org.bukkit.entity.Parrot.Variant;
import org.bukkit.entity.TropicalFish.Pattern;
import org.bukkit.inventory.ItemStack;
import org.ctp.crashapi.config.Configurable;
import org.ctp.crashapi.config.CrashConfigurations;
import org.ctp.crashapi.config.yaml.YamlConfig;
import org.ctp.enchantmentsolution.EnchantmentSolution;

public class AnimalMob_v1_16_R2 extends AnimalMob {

	private Type catType;
	private Gene pandaHiddenGene, pandaMainGene;
	private DyeColor collarColor;
	private MushroomCow.Variant mooshroomType;
	private Fox.Type foxType;

	public AnimalMob_v1_16_R2(Creature mob, ItemStack item) {
		super(mob, item);
		if (mob instanceof Cat) {
			Cat cat = (Cat) mob;
			setCatType(cat.getCatType());
			setCollarColor(cat.getCollarColor());
		}
		if (mob instanceof Panda) {
			Panda panda = (Panda) mob;
			setPandaHiddenGene(panda.getHiddenGene());
			setPandaMainGene(panda.getMainGene());
		}
		if (mob instanceof MushroomCow) {
			MushroomCow cow = (MushroomCow) mob;
			setMooshroomType(cow.getVariant());
		}
		if (mob instanceof Fox) {
			Fox fox = (Fox) mob;
			setFoxType(fox.getFoxType());
		}
	}

	public Type getCatType() {
		return catType;
	}

	public void setCatType(Type catType) {
		this.catType = catType;
	}

	public Gene getPandaHiddenGene() {
		return pandaHiddenGene;
	}

	public void setPandaHiddenGene(Gene pandaHiddenGene) {
		this.pandaHiddenGene = pandaHiddenGene;
	}

	public Gene getPandaMainGene() {
		return pandaMainGene;
	}

	public void setPandaMainGene(Gene pandaMainGene) {
		this.pandaMainGene = pandaMainGene;
	}

	@Override
	public void editProperties(Entity e, boolean b1, boolean b2) {
		super.editProperties(e, b1, b2);
		try {
			if (e instanceof Cat) {
				Cat cat = (Cat) e;
				cat.setCatType(getCatType());
				cat.setCollarColor(getCollarColor());
			}
			if (e instanceof Panda) {
				Panda panda = (Panda) e;
				panda.setHiddenGene(getPandaHiddenGene());
				panda.setMainGene(getPandaMainGene());
			}
			if (e instanceof MushroomCow) {
				MushroomCow cow = (MushroomCow) e;
				cow.setVariant(getMooshroomType());
			}
			if (e instanceof Fox) {
				Fox fox = (Fox) e;
				fox.setFoxType(getFoxType());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void setConfig(Configurable config, int i) {
		this.setConfig(config, "animals.", i);
	}

	@Override
	public void setConfig(Configurable configurable, String location, int i) {
		super.setConfig(configurable, location, i);

		YamlConfig config = configurable.getConfig();
		config.set(location + i + ".cat_type", getCatType() != null ? getCatType().name() : null);
		config.set(location + i + ".collar_color", getCatType() != null ? getCollarColor().name() : null);
		config.set(location + i + ".panda_main_gene", getPandaMainGene() != null ? getPandaMainGene().name() : null);
		config.set(location + i + ".panda_hidden_gene", getPandaHiddenGene() != null ? getPandaHiddenGene().name() : null);
		config.set(location + i + ".mooshroom_cow_variant", getMooshroomType() != null ? getMooshroomType().name() : null);
		config.set(location + i + ".fox_type", getFoxType() != null ? getFoxType().name() : null);
	}

	public static AnimalMob createFromConfig(Configurable config, int i) {
		AnimalMob mob = new AnimalMob();

		mob.setName(config.getString("animals." + i + ".name"));
		mob.setAge(config.getInt("animals." + i + ".age"));
		mob.setHealth(config.getDouble("animals." + i + ".health"));
		mob.setEntityID(config.getInt("animals." + i + ".entity_id"), false);
		mob.setOwner(config.getString("animals." + i + ".owner"));
		mob.setDomestication(config.getInt("animals." + i + ".domestication"));
		mob.setMaxDomestication(config.getInt("animals." + i + ".max_domestication"));
		mob.setJumpStrength(config.getDouble("animals." + i + ".jump_strength"));
		mob.setMovementSpeed(config.getDouble("animals." + i + ".movement_speed"));
		mob.setMaxHealth(config.getDouble("animals." + i + ".max_health"));
		mob.setCarryingChest(config.getBoolean("animals." + i + ".carrying_chest"));
		mob.setLlamaStrength(config.getInt("animals." + i + ".llama_strength"));
		mob.setPigSaddle(config.getBoolean("animals." + i + ".pig_saddle"));
		mob.setSheared(config.getBoolean("animals." + i + ".sheared"));
		mob.setPuffState(config.getInt("animals." + i + ".puff_state"));

		try {
			mob.setMob(EntityType.valueOf(config.getString("animals." + i + ".entity_type")));
		} catch (Exception ex) {}
		try {
			mob.setSheepColor(DyeColor.valueOf(config.getString("animals." + i + ".sheep_color")));
		} catch (Exception ex) {}
		try {
			mob.setWolfCollar(DyeColor.valueOf(config.getString("animals." + i + ".wolf_collar")));
		} catch (Exception ex) {}
		try {
			mob.setHorseStyle(Style.valueOf(config.getString("animals." + i + ".horse_style")));
		} catch (Exception ex) {}
		try {
			mob.setHorseColor(Color.valueOf(config.getString("animals." + i + ".horse_color")));
		} catch (Exception ex) {}
		try {
			mob.setLlamaColor(org.bukkit.entity.Llama.Color.valueOf(config.getString("animals." + i + ".llama_color")));
		} catch (Exception ex) {}
		try {
			mob.setParrotVariant(Variant.valueOf(config.getString("animals." + i + ".parrot_variant")));
		} catch (Exception ex) {}
		try {
			((AnimalMob_v1_16_R2) mob).setCatType(Type.valueOf(config.getString("animals." + i + ".cat_type")));
		} catch (Exception ex) {}
		try {
			((AnimalMob_v1_16_R2) mob).setPandaMainGene(Gene.valueOf(config.getString("animals." + i + ".panda_main_gene")));
		} catch (Exception ex) {}
		try {
			((AnimalMob_v1_16_R2) mob).setPandaHiddenGene(Gene.valueOf(config.getString("animals." + i + ".panda_hidden_gene")));
		} catch (Exception ex) {}
		try {
			((AnimalMob_v1_16_R2) mob).setCollarColor(DyeColor.valueOf(config.getString("animals." + i + ".collar_color")));
		} catch (Exception ex) {}
		try {
			((AnimalMob_v1_16_R2) mob).setMooshroomType(MushroomCow.Variant.valueOf(config.getString("animals." + i + ".mooshroom_cow_variant")));
		} catch (Exception ex) {}
		try {
			((AnimalMob_v1_16_R2) mob).setFoxType(Fox.Type.valueOf(config.getString("animals." + i + ".fox_type")));
		} catch (Exception ex) {}
		try {
			mob.setRabbitType(org.bukkit.entity.Rabbit.Type.valueOf(config.getString("animals." + i + ".rabbit_type")));
		} catch (Exception ex) {}
		try {
			mob.setSaddle(CrashConfigurations.getItemStack(config, "animals." + i + ".saddle"));
		} catch (Exception ex) {}
		try {
			mob.setArmor(CrashConfigurations.getItemStack(config, "animals." + i + ".armor"));
		} catch (Exception ex) {}
		try {
			mob.setTropicalBodyColor(DyeColor.valueOf(config.getString("animals." + i + ".tropical_body_color")));
		} catch (Exception ex) {}
		try {
			mob.setTropicalPatternColor(DyeColor.valueOf(config.getString("animals." + i + ".tropical_pattern_color")));
		} catch (Exception ex) {}
		try {
			mob.setTropicalPattern(Pattern.valueOf(config.getString("animals." + i + ".tropical_pattern")));
		} catch (Exception ex) {}

		Map<Integer, ItemStack> inventoryItems = new HashMap<Integer, ItemStack>();
		List<String> inventoryKeys = config.getConfig().getConfigurationInfo("animals." + i + ".inventory_items");
		for(String key: inventoryKeys) {
			String keyNum = key.substring(key.lastIndexOf('.') + 1);
			try {
				int num = Integer.parseInt(keyNum);
				inventoryItems.put(num, CrashConfigurations.getItemStack(config, key));
				config.getConfig().removeKey(key);
			} catch (Exception ex) {}
		}
		mob.setInventoryItems(inventoryItems);

		for(String key: config.getConfig().getConfigurationInfo("animals." + i))
			config.getConfig().removeKey(key);
		EnchantmentSolution.addAnimals(mob);
		return mob;
	}

	public DyeColor getCollarColor() {
		return collarColor;
	}

	public void setCollarColor(DyeColor collarColor) {
		this.collarColor = collarColor;
	}

	public MushroomCow.Variant getMooshroomType() {
		return mooshroomType;
	}

	public void setMooshroomType(MushroomCow.Variant mooshroomType) {
		this.mooshroomType = mooshroomType;
	}

	public Fox.Type getFoxType() {
		return foxType;
	}

	public void setFoxType(Fox.Type foxType) {
		this.foxType = foxType;
	}
}
