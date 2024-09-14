
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.tacznpc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.corrinedev.tacznpc.TaczNpcMod;

public class TaczNpcModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TaczNpcMod.MODID);
	public static final RegistryObject<SoundEvent> RIFLESHOOT = REGISTRY.register("rifleshoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tacz_npc", "rifleshoot")));
	public static final RegistryObject<SoundEvent> PISTOLSHOOT = REGISTRY.register("pistolshoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tacz_npc", "pistolshoot")));
	public static final RegistryObject<SoundEvent> SCAVPISTOLRELOAD = REGISTRY.register("scavpistolreload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tacz_npc", "scavpistolreload")));
	public static final RegistryObject<SoundEvent> SCAVRIFLERELOAD = REGISTRY.register("scavriflereload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tacz_npc", "scavriflereload")));
}
