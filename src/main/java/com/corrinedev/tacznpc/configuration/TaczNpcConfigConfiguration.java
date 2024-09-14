package com.corrinedev.tacznpc.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class TaczNpcConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> PISTOLDAMAGE;
	public static final ForgeConfigSpec.ConfigValue<Double> RIFLEDAMAGE;
	public static final ForgeConfigSpec.ConfigValue<Double> USECPISTOLHEALTH;
	public static final ForgeConfigSpec.ConfigValue<Double> USECRIFLEHEALTH;
	public static final ForgeConfigSpec.ConfigValue<Double> BANDITPISTOLHEALTH;
	public static final ForgeConfigSpec.ConfigValue<Double> BANDITRIFLEHEALTH;
	static {
		BUILDER.push("Pistol Damages");
		PISTOLDAMAGE = BUILDER.comment("How much damage pistol scavs do, this is multiplied by the power").define("Pistol Damage", (double) 1);
		BUILDER.pop();
		BUILDER.push("Rifle Damages");
		RIFLEDAMAGE = BUILDER.comment("Damage rifle scavs do, multiplied by the power").define("Rifle Damage", (double) 1.5);
		BUILDER.pop();
		BUILDER.push("Health");
		USECPISTOLHEALTH = BUILDER.comment("Health of neutral pistol scavs").define("Neutral Pistol Scav Health", (double) 20);
		USECRIFLEHEALTH = BUILDER.comment("Health of neutral rifle scavs").define("Neutral Rifle Scav Health", (double) 20);
		BANDITPISTOLHEALTH = BUILDER.comment("Health of bandit pistol scavs").define("Bandit Pistol Scav Health", (double) 20);
		BANDITRIFLEHEALTH = BUILDER.define("Bandit Rifle Scav Health", (double) 20);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
