package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.registries.ItemRegister;
import com.enragementgame.expandedcollections.registries.SoundRegister;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExpandedJukeboxSongs {
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_WOLF = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "music_disc_wolf"));
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_CREEPER_SONG = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "music_disc_creeper_song"));
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_REDSTONE_PARADISE = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "music_disc_redstone_paradise"));

    public static void bootstrap(BootstrapContext<JukeboxSong> context) {
        register(context, MUSIC_DISC_WOLF, SoundRegister.MUSIC_DISC_WOLF, 173f,12);
        register(context, MUSIC_DISC_CREEPER_SONG, SoundRegister.MUSIC_DISC_CREEPER_SONG,20f,2);
        register(context, MUSIC_DISC_REDSTONE_PARADISE, SoundRegister.MUSIC_DISC_REDSTONE_PARADISE, 187f,15);
    }

    private static void register(BootstrapContext<JukeboxSong> context, ResourceKey<JukeboxSong> key, Holder<SoundEvent> soundRegister, float length, int output) {
        JukeboxSong jukeboxSong = new JukeboxSong(soundRegister,
                Component.translatable(Util.makeDescriptionId("jukebox_song", key.location())), length, output);
        context.register(key, jukeboxSong);
    }
}
