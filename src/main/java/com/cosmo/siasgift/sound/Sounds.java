package com.cosmo.siasgift.sound;

import com.cosmo.siasgift.SiasGift;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class Sounds {

    public static final SoundEvent DUCK_AMBIENT = registerSoundEvent("duck_ambient");
    public static final SoundEvent DUCK_DEATH = registerSoundEvent("duck_death");
    public static final SoundEvent DUCK_HURT = registerSoundEvent("duck_hurt"); 

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier("siasgift", name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {


        SiasGift.LOGGER.info("Sounds successfully registered for Sia's Gift");
    }
}
