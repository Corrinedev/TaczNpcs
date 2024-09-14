package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import com.corrinedev.tacznpc.entity.USECScavEntity;

public class USECScavOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			if (entity instanceof USECScavEntity animatable)
				animatable.setTexture("scavusecpistolarmor");
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(10);
		} else {
			if (entity instanceof USECScavEntity animatable)
				animatable.setTexture("scavpistol");
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(0);
		}
	}
}
