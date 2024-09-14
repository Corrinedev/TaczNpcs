
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.tacznpc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.USECScavRifleEntity;
import com.corrinedev.tacznpc.entity.USECScavEntity;
import com.corrinedev.tacznpc.entity.TerroristScavRifleEntity;
import com.corrinedev.tacznpc.entity.TerroristScavEntity;
import com.corrinedev.tacznpc.entity.ScavBulletRifleEntity;
import com.corrinedev.tacznpc.entity.ScavBulletEntity;
import com.corrinedev.tacznpc.TaczNpcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TaczNpcModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TaczNpcMod.MODID);
	public static final RegistryObject<EntityType<USECScavEntity>> USEC_SCAV_PISTOL = register("usec_scav_pistol",
			EntityType.Builder.<USECScavEntity>of(USECScavEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(USECScavEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ScavBulletEntity>> SCAV_BULLET = register("scav_bullet",
			EntityType.Builder.<ScavBulletEntity>of(ScavBulletEntity::new, MobCategory.MISC).setCustomClientFactory(ScavBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ScavBulletRifleEntity>> SCAV_BULLET_RIFLE = register("scav_bullet_rifle", EntityType.Builder.<ScavBulletRifleEntity>of(ScavBulletRifleEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ScavBulletRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<USECScavRifleEntity>> USEC_SCAV_RIFLE = register("usec_scav_rifle",
			EntityType.Builder.<USECScavRifleEntity>of(USECScavRifleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(USECScavRifleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TerroristScavEntity>> TERRORIST_SCAV = register("terrorist_scav",
			EntityType.Builder.<TerroristScavEntity>of(TerroristScavEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerroristScavEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TerroristScavRifleEntity>> TERRORIST_SCAV_RIFLE = register("terrorist_scav_rifle",
			EntityType.Builder.<TerroristScavRifleEntity>of(TerroristScavRifleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerroristScavRifleEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			USECScavEntity.init();
			USECScavRifleEntity.init();
			TerroristScavEntity.init();
			TerroristScavRifleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(USEC_SCAV_PISTOL.get(), USECScavEntity.createAttributes().build());
		event.put(USEC_SCAV_RIFLE.get(), USECScavRifleEntity.createAttributes().build());
		event.put(TERRORIST_SCAV.get(), TerroristScavEntity.createAttributes().build());
		event.put(TERRORIST_SCAV_RIFLE.get(), TerroristScavRifleEntity.createAttributes().build());
	}
}
