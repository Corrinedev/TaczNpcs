
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.tacznpc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import com.corrinedev.tacznpc.TaczNpcMod;

public class TaczNpcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaczNpcMod.MODID);
	public static final RegistryObject<Item> USEC_SCAV_PISTOL_SPAWN_EGG = REGISTRY.register("usec_scav_pistol_spawn_egg", () -> new ForgeSpawnEggItem(TaczNpcModEntities.USEC_SCAV_PISTOL, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> USEC_SCAV_RIFLE_SPAWN_EGG = REGISTRY.register("usec_scav_rifle_spawn_egg", () -> new ForgeSpawnEggItem(TaczNpcModEntities.USEC_SCAV_RIFLE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TERRORIST_SCAV_SPAWN_EGG = REGISTRY.register("terrorist_scav_spawn_egg", () -> new ForgeSpawnEggItem(TaczNpcModEntities.TERRORIST_SCAV, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TERRORIST_SCAV_RIFLE_SPAWN_EGG = REGISTRY.register("terrorist_scav_rifle_spawn_egg", () -> new ForgeSpawnEggItem(TaczNpcModEntities.TERRORIST_SCAV_RIFLE, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
