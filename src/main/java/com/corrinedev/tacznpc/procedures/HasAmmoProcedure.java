package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.USECScavEntity;

public class HasAmmoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity instanceof USECScavEntity _datEntI ? _datEntI.getEntityData().get(USECScavEntity.DATA_AmmoCount) : 0) <= 0);
	}
}
