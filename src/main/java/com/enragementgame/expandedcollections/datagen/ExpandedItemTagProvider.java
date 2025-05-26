package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.registries.ItemRegister;
import com.enragementgame.expandedcollections.util.ExpandedTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BannerPatternTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ExpandedItemTagProvider extends ItemTagsProvider {
    public ExpandedItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ExpandedCollections.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ExpandedTags.Items.TRADE_DISC)
                .add(Items.MUSIC_DISC_CHIRP)
                .add(Items.MUSIC_DISC_BLOCKS)
                .add(Items.MUSIC_DISC_FAR)
                .add(Items.MUSIC_DISC_MALL)
                .add(Items.MUSIC_DISC_MELLOHI)
                .add(Items.MUSIC_DISC_STAL)
                .add(Items.MUSIC_DISC_STRAD)
                .add(Items.MUSIC_DISC_WAIT);
        this.tag(ExpandedTags.Items.TREASURE_DISC)
                .add(Items.MUSIC_DISC_13)
                .add(Items.MUSIC_DISC_CAT)
                .add(Items.MUSIC_DISC_11)
                .add(Items.MUSIC_DISC_WARD)
                .add(Items.MUSIC_DISC_5)
                .add(Items.MUSIC_DISC_OTHERSIDE)
                .add(Items.MUSIC_DISC_PIGSTEP)
                .add(Items.MUSIC_DISC_RELIC)
                .add(Items.MUSIC_DISC_CREATOR)
                .add(Items.MUSIC_DISC_CREATOR_MUSIC_BOX)
                .add(Items.MUSIC_DISC_PRECIPICE);

        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ItemRegister.GUARD_ARMOR_TRIM_SMITHING_TEMPLATE.get());


    }
}
