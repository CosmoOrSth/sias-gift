package com.cosmo.siasgift;


import com.cosmo.siasgift.entity.Entities;
import com.cosmo.siasgift.entity.custom.DuckEntity;
import com.cosmo.siasgift.items.SpawnEggItems;
import com.cosmo.siasgift.sound.Sounds;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cosmo.siasgift.items.FoodItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



public class SiasGift implements ModInitializer {
	
    public static final Logger LOGGER = LogManager.getLogger("siasgift");

	public static final ItemGroup SIASGIFT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier("siasgift", "siasgift"), 
		FabricItemGroup.builder().displayName(Text.translatable("itemgroup.siasgift"))
			.icon(() -> new ItemStack(FoodItems.YORKSHIRE_PUDDING)).entries((displayContext, entries) -> {
				entries.add(FoodItems.YORKSHIRE_PUDDING);
				entries.add(FoodItems.RAW_BACON);
				entries.add(FoodItems.COOKED_BACON);
				entries.add(FoodItems.RAW_SAUSAGE);
				entries.add(FoodItems.COOKED_SAUSAGE);
				entries.add(FoodItems.PIG_IN_A_BLANKET);
				entries.add(FoodItems.RAW_DUCK);
				entries.add(FoodItems.COOKED_DUCK);
				entries.add(SpawnEggItems.DUCK_SPAWN_EGG);
			}).build());

	@Override
	public void onInitialize() {

		FoodItems.register();
		SpawnEggItems.register();

		FabricDefaultAttributeRegistry.register(Entities.DUCK, DuckEntity.createDuckAttributes());

		Sounds.registerSounds();

		Entities.registerModEntities();

		LOGGER.info("hey look! Sia's Gift is working!");

	}
}