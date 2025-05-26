package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ExpandedDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.TRIM_PATTERN, ExpandedTrimPatterns::bootstrap)
            .add(Registries.JUKEBOX_SONG, ExpandedJukeboxSongs::bootstrap)
            .add(Registries.BANNER_PATTERN, ExpandedBannerPatterns::bootstrap);

    public ExpandedDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(ExpandedCollections.MODID));
    }
}
