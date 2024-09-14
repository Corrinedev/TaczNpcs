
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.tacznpc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import com.corrinedev.tacznpc.client.renderer.USECScavRifleRenderer;
import com.corrinedev.tacznpc.client.renderer.USECScavRenderer;
import com.corrinedev.tacznpc.client.renderer.TerroristScavRifleRenderer;
import com.corrinedev.tacznpc.client.renderer.TerroristScavRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaczNpcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TaczNpcModEntities.USEC_SCAV_PISTOL.get(), USECScavRenderer::new);
		event.registerEntityRenderer(TaczNpcModEntities.SCAV_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TaczNpcModEntities.SCAV_BULLET_RIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TaczNpcModEntities.USEC_SCAV_RIFLE.get(), USECScavRifleRenderer::new);
		event.registerEntityRenderer(TaczNpcModEntities.TERRORIST_SCAV.get(), TerroristScavRenderer::new);
		event.registerEntityRenderer(TaczNpcModEntities.TERRORIST_SCAV_RIFLE.get(), TerroristScavRifleRenderer::new);
	}
}
