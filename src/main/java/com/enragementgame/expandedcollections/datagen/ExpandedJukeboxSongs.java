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

public class ExpandedJukeboxSongs {
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_WOLF = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "music_disc_wolf"));

    public static void bootstrap(BootstrapContext<JukeboxSong> context) {
        register(context, MUSIC_DISC_WOLF);
    }

    private static void register(BootstrapContext<JukeboxSong> context, ResourceKey<JukeboxSong> key) {
        JukeboxSong jukeboxSong = new JukeboxSong((Holder<SoundEvent>) SoundRegister.MUSIC_DISC_WOLF,
                Component.translatable(Util.makeDescriptionId("item", key.registry()) + ".desc"), 173f, 12);
        context.register(key, jukeboxSong);
    }
}
