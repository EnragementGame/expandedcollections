package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BannerPattern;

public class ExpandedBannerPatterns {
    public static final ResourceKey<BannerPattern> CROAK = ResourceKey.create(Registries.BANNER_PATTERN,
            ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "croak"));
    public static final ResourceKey<BannerPattern> EARS = ResourceKey.create(Registries.BANNER_PATTERN,
            ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "ears"));

    public static void bootstrap(BootstrapContext<BannerPattern> context) {
        register(context, "croak" ,CROAK);
        register(context, "ears" ,EARS);
    }

    private static void register(BootstrapContext<BannerPattern> context, String name, ResourceKey<BannerPattern> key) {
        BannerPattern bannerPattern = new BannerPattern(ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, name),
                Util.makeDescriptionId("block.minecraft.banner", key.location()));
        context.register(key, bannerPattern);
    }
}
