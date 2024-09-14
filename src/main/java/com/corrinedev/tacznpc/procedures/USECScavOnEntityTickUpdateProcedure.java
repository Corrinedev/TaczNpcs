package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.USECScavEntity;

public class USECScavOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof USECScavEntity _datEntL0 && _datEntL0.getEntityData().get(USECScavEntity.DATA_Sprinting)) {
			entity.setSprinting(true);
		}
		if (entity instanceof USECScavEntity _datEntL2 && _datEntL2.getEntityData().get(USECScavEntity.DATA_Crouching)) {
			entity.setShiftKeyDown(true);
		}
	}
}
