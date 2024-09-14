package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.TerroristScavEntity;

public class BanditHasAmmoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity instanceof TerroristScavEntity _datEntI ? _datEntI.getEntityData().get(TerroristScavEntity.DATA_AmmoCount) : 0) <= 0);
	}
}
