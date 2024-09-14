package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.TerroristScavEntity;

public class TerroristPistolTickingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TerroristScavEntity _datEntL0 && _datEntL0.getEntityData().get(TerroristScavEntity.DATA_Sprinting)) {
			entity.setSprinting(true);
		}
		if (entity instanceof TerroristScavEntity _datEntL2 && _datEntL2.getEntityData().get(TerroristScavEntity.DATA_Crouching)) {
			entity.setShiftKeyDown(true);
		}
	}
}
