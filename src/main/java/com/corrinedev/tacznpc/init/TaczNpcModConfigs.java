package com.corrinedev.tacznpc.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import com.corrinedev.tacznpc.configuration.TaczNpcConfigConfiguration;
import com.corrinedev.tacznpc.configuration.LootConfigConfiguration;
import com.corrinedev.tacznpc.TaczNpcMod;

@Mod.EventBusSubscriber(modid = TaczNpcMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TaczNpcModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TaczNpcConfigConfiguration.SPEC, "tacznpcs-config.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, LootConfigConfiguration.SPEC, "tacznpcs-loot-config.toml");
		});
	}
}
