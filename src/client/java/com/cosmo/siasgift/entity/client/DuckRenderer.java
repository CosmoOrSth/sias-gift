package com.cosmo.siasgift.entity.client;

import com.cosmo.siasgift.entity.custom.DuckEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DuckRenderer extends MobEntityRenderer<DuckEntity, DuckModel<DuckEntity>> {

    private static final Identifier TEXTURE = new Identifier("siasgift", "textures/entity/duck.png");
    public DuckRenderer(EntityRendererFactory.Context context) {
        super(context, new DuckModel<>(context.getPart(ModelLayers.DUCK)), 0.4f);
    }

    @Override
    public Identifier getTexture(DuckEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(DuckEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.4f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
