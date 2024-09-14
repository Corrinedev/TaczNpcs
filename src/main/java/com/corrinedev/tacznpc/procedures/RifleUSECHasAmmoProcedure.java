package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.USECScavRifleEntity;

public class RifleUSECHasAmmoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity instanceof USECScavRifleEntity _datEntI ? _datEntI.getEntityData().get(USECScavRifleEntity.DATA_AmmoCount) : 0) <= 0);
	}
}
