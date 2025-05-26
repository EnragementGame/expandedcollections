package com.enragementgame.expandedcollections.util;

import com.enragementgame.expandedcollections.ExpandedCollections;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BannerPatternTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerPattern;

public class ExpandedTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRADE_DISC = createTag("trade_disc");
        public static final TagKey<Item> TREASURE_DISC = createTag("treasure_disc");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, name));
        }
    }

    public static class BannerPatterns {
        public static final TagKey<BannerPattern> CROAK = createTag("croak");

        private static TagKey<BannerPattern> createTag(String name) {
            return TagKey.create(Registries.BANNER_PATTERN, ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, name));
        }
    }

}
