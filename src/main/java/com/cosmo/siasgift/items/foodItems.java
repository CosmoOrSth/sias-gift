package com.cosmo.siasgift.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class foodItems {

        public static final Item YORKSHIRE_PUDDING =  new Item(new Item.Settings().food(new FoodComponent.Builder().saturationModifier(4).snack().statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 2), 1.0f).hunger(5).build()));
        
        public static final Item RAW_SAUSAGE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1).build()));
        public static final Item COOKED_SAUSAGE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(5).build()));

        public static final Item RAW_BACON = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1/2).build()));
        public static final Item COOKED_BACON = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(3).build()));

        public static final Item PIG_IN_A_BLANKET = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(12).saturationModifier(13).build()));

        public static void register() {
            Registry.register(Registries.ITEM, new Identifier("siasgift", "yorkshire_pudding"), YORKSHIRE_PUDDING);

            Registry.register(Registries.ITEM, new Identifier("siasgift", "raw_sausage"), RAW_SAUSAGE);
            Registry.register(Registries.ITEM, new Identifier("siasgift", "cooked_sausage"), COOKED_SAUSAGE);

            Registry.register(Registries.ITEM, new Identifier("siasgift", "raw_bacon"), RAW_BACON);
            Registry.register(Registries.ITEM, new Identifier("siasgift", "cooked_bacon"), COOKED_BACON);

            Registry.register(Registries.ITEM, new Identifier("siasgift", "pig_in_a_blanket"), PIG_IN_A_BLANKET);
        }
}
