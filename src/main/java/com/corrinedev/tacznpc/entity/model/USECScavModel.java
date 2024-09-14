package com.corrinedev.tacznpc.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.corrinedev.tacznpc.entity.USECScavEntity;

public class USECScavModel extends GeoModel<USECScavEntity> {
	@Override
	public ResourceLocation getAnimationResource(USECScavEntity entity) {
		return new ResourceLocation("tacz_npc", "animations/scavpistolarmor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(USECScavEntity entity) {
		return new ResourceLocation("tacz_npc", "geo/scavpistolarmor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(USECScavEntity entity) {
		return new ResourceLocation("tacz_npc", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(USECScavEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
