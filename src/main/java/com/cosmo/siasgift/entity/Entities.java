package com.cosmo.siasgift.entity;

import com.cosmo.siasgift.SiasGift;
import com.cosmo.siasgift.entity.custom.DuckEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Entities {

    public static final EntityType<DuckEntity> DUCK = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("siasgift", "duck"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.6f)).build());

    public static void registerModEntities() {

        SiasGift.LOGGER.info("Registering Entities for Sia's Gift");

    }


}
