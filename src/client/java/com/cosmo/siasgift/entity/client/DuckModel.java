package com.cosmo.siasgift.entity.client;

import com.cosmo.siasgift.entity.animation.Animations;
import com.cosmo.siasgift.entity.custom.DuckEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DuckModel<T extends DuckEntity> extends SinglePartEntityModel<T> {
	private final ModelPart duck;
	private final ModelPart head;

	public DuckModel(ModelPart root) {
		this.duck = root.getChild("duck");
		this.head = this.duck.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData duck = modelPartData.addChild("duck", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = duck.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData torso_r1 = body.addChild("torso_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -2.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData legs = duck.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -4.0F));

		ModelPartData rleg = legs.addChild("rleg", ModelPartBuilder.create().uv(34, 35).cuboid(-2.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(26, 33).cuboid(-2.0F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData lleg = legs.addChild("lleg", ModelPartBuilder.create().uv(36, 14).cuboid(1.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(32, 14).cuboid(1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = duck.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -4.0F, -4.0F));

		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(8, 33).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData beak_r1 = head.addChild("beak_r1", ModelPartBuilder.create().uv(18, 33).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -3.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData neck_r1 = head.addChild("neck_r1", ModelPartBuilder.create().uv(0, 33).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -1.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData breast_r1 = head.addChild("breast_r1", ModelPartBuilder.create().uv(32, 0).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData tail = duck.addChild("tail", ModelPartBuilder.create(), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r1 = tail.addChild("cube_r1", ModelPartBuilder.create().uv(26, 35).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 8.0F, 0.48F, 0.0F, 0.0F));

		ModelPartData cube_r2 = tail.addChild("cube_r2", ModelPartBuilder.create().uv(32, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 6.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData wings = duck.addChild("wings", ModelPartBuilder.create(), ModelTransform.of(-14.0F, -2.0F, -4.0F, -0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r3 = wings.addChild("cube_r3", ModelPartBuilder.create().uv(16, 25).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 25).cuboid(6.0F, -1.0F, -1.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -3.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r4 = wings.addChild("cube_r4", ModelPartBuilder.create().uv(18, 15).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(6.0F, -2.0F, -1.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -4.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r5 = wings.addChild("cube_r5", ModelPartBuilder.create().uv(32, 25).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(32, 7).cuboid(6.0F, -1.0F, -1.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -2.0F, 1.0F, 0.0873F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(DuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(Animations.duck_walk, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, Animations.duck_idle, ageInTicks, 1f);
		this.updateAnimation(entity.swimmingAnimationState, Animations.duck_swim, ageInTicks, 1f);

	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}



	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		duck.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return duck;
	}
}