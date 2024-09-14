package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import com.corrinedev.tacznpc.entity.USECScavRifleEntity;
import com.corrinedev.tacznpc.configuration.TaczNpcConfigConfiguration;

public class RifleScavOnInitalEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) (double) TaczNpcConfigConfiguration.USECRIFLEHEALTH.get());
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			if (entity instanceof USECScavRifleEntity animatable)
				animatable.setTexture("scavusecpistolarmor");
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(10);
		} else {
			if (entity instanceof USECScavRifleEntity animatable)
				animatable.setTexture("scavpistol");
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(0);
		}
	}
}
