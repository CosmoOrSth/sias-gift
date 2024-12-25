package com.cosmo.siasgift.entity.client;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

import com.cosmo.siasgift.entity.custom.DuckEntity;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class Duck<T extends DuckEntity> extends SinglePartEntityModel<T> {
	private final ModelPart body;
	private final ModelPart legs;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart wings;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	public Duck(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
		this.left_leg = this.legs.getChild("left_leg");
		this.right_leg = this.legs.getChild("right_leg");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.wings = root.getChild("wings");
		this.left_wing = this.wings.getChild("left_wing");
		this.right_wing = this.wings.getChild("right_wing");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData breast_r1 = body.addChild("breast_r1", ModelPartBuilder.create().uv(32, 0).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -4.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData torso_r1 = body.addChild("torso_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -2.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData legs = modelPartData.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, -4.0F));

		ModelPartData left_leg = legs.addChild("left_leg", ModelPartBuilder.create().uv(36, 14).cuboid(1.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 14).cuboid(1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_leg = legs.addChild("right_leg", ModelPartBuilder.create().uv(34, 35).cuboid(-2.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 33).cuboid(-2.0F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 20.0F, -4.0F));

		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(8, 33).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData beak_r1 = head.addChild("beak_r1", ModelPartBuilder.create().uv(18, 33).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -3.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData neck_r1 = head.addChild("neck_r1", ModelPartBuilder.create().uv(0, 33).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -1.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData tail = modelPartData.addChild("tail", ModelPartBuilder.create(), ModelTransform.of(0.0F, 23.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r1 = tail.addChild("cube_r1", ModelPartBuilder.create().uv(26, 35).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 8.0F, 0.48F, 0.0F, 0.0F));

		ModelPartData cube_r2 = tail.addChild("cube_r2", ModelPartBuilder.create().uv(32, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 6.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData wings = modelPartData.addChild("wings", ModelPartBuilder.create(), ModelTransform.of(-14.0F, 22.0F, -4.0F, -0.0436F, 0.0F, 0.0F));

		ModelPartData left_wing = wings.addChild("left_wing", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = left_wing.addChild("cube_r3", ModelPartBuilder.create().uv(32, 7).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, -2.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r4 = left_wing.addChild("cube_r4", ModelPartBuilder.create().uv(0, 25).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, -3.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r5 = left_wing.addChild("cube_r5", ModelPartBuilder.create().uv(0, 15).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, -4.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData right_wing = wings.addChild("right_wing", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r6 = right_wing.addChild("cube_r6", ModelPartBuilder.create().uv(16, 25).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -3.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r7 = right_wing.addChild("cube_r7", ModelPartBuilder.create().uv(18, 15).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -4.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r8 = right_wing.addChild("cube_r8", ModelPartBuilder.create().uv(32, 25).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -2.0F, 1.0F, 0.0873F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(DuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		legs.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tail.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		wings.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart getPart() {
		return body;
	}
}