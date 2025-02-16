package com.cosmo.siasgift.world.gen;

import com.cosmo.siasgift.entity.Entities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class EntityGeneration {

    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.RIVER, BiomeKeys.BEACH), SpawnGroup.CREATURE,
                Entities.DUCK, 35, 3, 5);

        SpawnRestriction.register(Entities.DUCK, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING, AnimalEntity::isValidNaturalSpawn);
    }

}

