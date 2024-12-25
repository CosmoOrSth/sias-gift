package com.cosmo.siasgift;

import com.cosmo.siasgift.entity.Entities;
import com.cosmo.siasgift.entity.custom.DuckEntity;
import com.cosmo.siasgift.items.foodItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.loader.impl.lib.tinyremapper.extension.mixin.common.Logger;
import net.fabricmc.loader.impl.util.log.Log;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



public class SiasGift implements ModInitializer {
	
    public static final Logger LOGGER = Log.getLogger("siasgift");

	public static final ItemGroup SIASGIFT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier("siasgift", "siasgift"), 
		FabricItemGroup.builder().displayName(Text.translatable("itemgroup.siasgift"))
			.icon(() -> new ItemStack(foodItems.YORKSHIRE_PUDDING)).entries((displayContext, entries) -> {
				entries.add(foodItems.YORKSHIRE_PUDDING);
				entries.add(foodItems.PIG_IN_A_BLANKET);
			}).build());

	@Override
	public void onInitialize() {

		foodItems.register();

		FabricDefaultAttributeRegistry.register(Entities.DUCK, DuckEntity.createDuckAttributes());

		LOGGER.info("hey look, mod's working!");

	}
}