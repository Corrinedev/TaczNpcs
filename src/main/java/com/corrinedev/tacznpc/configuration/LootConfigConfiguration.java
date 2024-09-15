package com.corrinedev.tacznpc.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class LootConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> LOOT;
	static {
		BUILDER.push("Loot Table Compatiblity");
		LOOT = BUILDER.comment("(TACZ by default, true is TACZ false is VPB loot tables)").define("VPB or TACZ?", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
