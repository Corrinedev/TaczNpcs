package com.corrinedev.tacznpc.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.corrinedev.tacznpc.entity.USECScavRifleEntity;

public class USECScavRifleModel extends GeoModel<USECScavRifleEntity> {
	@Override
	public ResourceLocation getAnimationResource(USECScavRifleEntity entity) {
		return new ResourceLocation("tacz_npc", "animations/scav.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(USECScavRifleEntity entity) {
		return new ResourceLocation("tacz_npc", "geo/scav.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(USECScavRifleEntity entity) {
		return new ResourceLocation("tacz_npc", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(USECScavRifleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
