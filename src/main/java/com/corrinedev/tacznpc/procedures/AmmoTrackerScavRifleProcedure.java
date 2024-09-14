package com.corrinedev.tacznpc.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.Comparator;

import com.corrinedev.tacznpc.entity.USECScavRifleEntity;
import com.corrinedev.tacznpc.entity.ScavBulletRifleEntity;
import com.corrinedev.tacznpc.TaczNpcMod;

@Mod.EventBusSubscriber
public class AmmoTrackerScavRifleProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ScavBulletRifleEntity) {
			if ((((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntL2 && _datEntL2.getEntityData().get(USECScavRifleEntity.DATA_Reloading)) == true) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
		if (entity instanceof ScavBulletRifleEntity) {
			if ((((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntI ? _datEntI.getEntityData().get(USECScavRifleEntity.DATA_AmmoCount) : 0) > 0) {
				if (((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntSetI)
					_datEntSetI.getEntityData().set(USECScavRifleEntity.DATA_AmmoCount, (int) ((((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntI ? _datEntI.getEntityData().get(USECScavRifleEntity.DATA_AmmoCount) : 0) - 1));
				if ((((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntI ? _datEntI.getEntityData().get(USECScavRifleEntity.DATA_AmmoCount) : 0) <= 1) {
					if (((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntSetI)
						_datEntSetI.getEntityData().set(USECScavRifleEntity.DATA_AmmoCount, (int) ((((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntI ? _datEntI.getEntityData().get(USECScavRifleEntity.DATA_AmmoCount) : 0) - 1));
					if (((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity) {
						((USECScavRifleEntity) ((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null))).setAnimation("reload_upper");
					}
					if (((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 10, false, false));
					if (((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntSetL)
						_datEntSetL.getEntityData().set(USECScavRifleEntity.DATA_Reloading, true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tacz_npc:scavriflereload")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tacz_npc:scavriflereload")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					TaczNpcMod.queueServerWork(40, () -> {
						if (((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntSetI)
							_datEntSetI.getEntityData().set(USECScavRifleEntity.DATA_AmmoCount, 30);
						if (((Entity) world.getEntitiesOfClass(USECScavRifleEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof USECScavRifleEntity _datEntSetL)
							_datEntSetL.getEntityData().set(USECScavRifleEntity.DATA_Reloading, false);
					});
				}
			}
		}
	}
}
