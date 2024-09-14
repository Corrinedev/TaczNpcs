
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.tacznpc.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.corrinedev.tacznpc.TaczNpcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TaczNpcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaczNpcMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TaczNpcModItems.USEC_SCAV_PISTOL_SPAWN_EGG.get());
			tabData.accept(TaczNpcModItems.USEC_SCAV_RIFLE_SPAWN_EGG.get());
			tabData.accept(TaczNpcModItems.TERRORIST_SCAV_SPAWN_EGG.get());
			tabData.accept(TaczNpcModItems.TERRORIST_SCAV_RIFLE_SPAWN_EGG.get());
		}
	}
}
