package com.enragementgame.expandedcollections.datagen;


import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.util.ExpandedTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BannerPatternTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ExpandedBannerTagProvider extends BannerPatternTagsProvider {
    public ExpandedBannerTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                     @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ExpandedCollections.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ExpandedTags.BannerPatterns.PATTERN_ITEM_CROAK)
                .add(ExpandedBannerPatterns.CROAK);
        this.tag(ExpandedTags.BannerPatterns.PATTERN_ITEM_EARS)
                .add(ExpandedBannerPatterns.EARS);
        this.tag(ExpandedTags.BannerPatterns.PATTERN_ITEM_RIVETS)
                .add(ExpandedBannerPatterns.RIVETS);
    }
}
