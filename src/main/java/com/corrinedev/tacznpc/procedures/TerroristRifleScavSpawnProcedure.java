package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import com.corrinedev.tacznpc.entity.TerroristScavRifleEntity;
import com.corrinedev.tacznpc.configuration.TaczNpcConfigConfiguration;

public class TerroristRifleScavSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) (double) TaczNpcConfigConfiguration.BANDITRIFLEHEALTH.get());
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			if (entity instanceof TerroristScavRifleEntity animatable)
				animatable.setTexture("terroristarmor");
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(10);
		} else {
			if (entity instanceof TerroristScavRifleEntity animatable)
				animatable.setTexture("terroristnoarmor");
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(0);
		}
	}
}
