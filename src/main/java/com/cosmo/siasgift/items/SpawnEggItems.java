package com.cosmo.siasgift.items;

import com.cosmo.siasgift.entity.Entities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SpawnEggItems {

    public static final Item DUCK_SPAWN_EGG = new SpawnEggItem(Entities.DUCK, 0x6c7b8b, 0x50311e, new FabricItemSettings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("siasgift", "duck_spawn_egg"), DUCK_SPAWN_EGG);
    }
}
