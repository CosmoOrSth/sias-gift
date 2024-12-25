package com.cosmo.siasgift;

import com.cosmo.siasgift.entity.Entities;
import com.cosmo.siasgift.entity.client.DuckRenderer;
import com.cosmo.siasgift.entity.client.ModelLayers;
import com.cosmo.siasgift.entity.client.Duck;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SiasGiftClient {


    public void OnInitializeClient() {

        EntityRendererRegistry.register(Entities.DUCK, DuckRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModelLayers.DUCK, Duck::getTexturedModelData);
    }
}
