package com.corrinedev.tacznpc.procedures;

import net.minecraft.world.entity.Entity;

import com.corrinedev.tacznpc.entity.TerroristScavRifleEntity;

public class BanditRifleHasAmmoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity instanceof TerroristScavRifleEntity _datEntI ? _datEntI.getEntityData().get(TerroristScavRifleEntity.DATA_AmmoCount) : 0) <= 0);
	}
}
