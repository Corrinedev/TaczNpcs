package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.USECScavRifleEntity;

public class RifleScavTickingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof USECScavRifleEntity _datEntL0 && _datEntL0.getEntityData().get(USECScavRifleEntity.DATA_Sprinting)) {
			entity.setSprinting(true);
		}
		if (entity instanceof USECScavRifleEntity _datEntL2 && _datEntL2.getEntityData().get(USECScavRifleEntity.DATA_Crouching)) {
			entity.setShiftKeyDown(true);
		}
	}
}
