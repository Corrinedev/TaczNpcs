package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.TerroristScavRifleEntity;

public class TerroristRifleTickingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TerroristScavRifleEntity _datEntL0 && _datEntL0.getEntityData().get(TerroristScavRifleEntity.DATA_Sprinting)) {
			entity.setSprinting(true);
		}
		if (entity instanceof TerroristScavRifleEntity _datEntL2 && _datEntL2.getEntityData().get(TerroristScavRifleEntity.DATA_Crouching)) {
			entity.setShiftKeyDown(true);
		}
	}
}
