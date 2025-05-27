package com.enragementgame.expandedcollections.registries;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.util.ExpandedTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SmithingTemplateItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExpandedCollections.MODID);

    public static final DeferredItem<Item> GUARD_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("guard_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "guard")));

    public static final DeferredItem<Item> MUSIC_DISC_WOLF = ITEMS.register("music_disc_wolf",
            () -> new Item(new Item.Properties().jukeboxPlayable(SoundRegister.MUSIC_DISC_WOLF_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<BannerPatternItem> CROAK_BANNER_PATTERN = ITEMS.register("croak_banner_pattern",
            () -> new BannerPatternItem(ExpandedTags.BannerPatterns.PATTERN_ITEM_CROAK, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<BannerPatternItem> EARS_BANNER_PATTERN = ITEMS.register("ears_banner_pattern",
            () -> new BannerPatternItem(ExpandedTags.BannerPatterns.PATTERN_ITEM_EARS, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}