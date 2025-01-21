package com.cosmo.siasgift;

import com.cosmo.siasgift.entity.Entities;
import com.cosmo.siasgift.entity.client.DuckModel;
import com.cosmo.siasgift.entity.client.DuckRenderer;
import com.cosmo.siasgift.entity.client.ModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SiasGiftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModelLayers.DUCK, DuckModel::getTexturedModelData);
        EntityRendererRegistry.register(Entities.DUCK, DuckRenderer::new);
    }
}
