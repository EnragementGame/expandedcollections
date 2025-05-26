package com.enragementgame.expandedcollections.events;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.entities.ExpandedVillagers;

import com.enragementgame.expandedcollections.registries.ItemRegister;
import com.enragementgame.expandedcollections.util.ExpandedTags;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;


@EventBusSubscriber(modid = ExpandedCollections.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ExpandedEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ExpandedVillagers.MUSICIAN.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.PAPER, 24),
                    new ItemStack(Items.EMERALD,1), 16, 2, 0.05f));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_BLOCKS, 1), 2, 5, 0.2f));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_STRAD, 1), 2, 5, 0.2f));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_CHIRP, 1), 2, 5, 0.2f));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_WAIT, 1), 2, 5, 0.2f));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(ItemRegister.MUSIC_DISC_WOLF.get(), 1), 2, 5, 0.2f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Items.NOTE_BLOCK, 1), 16, 4, 0.05f));
            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.AMETHYST_SHARD, 22),
                    new ItemStack(Items.EMERALD, 1), 8, 3, 0.05f));
            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_13, 1),
                    new ItemStack(Items.EMERALD, 10), 4, 10, 0.2f));
            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_CAT, 1),
                    new ItemStack(Items.EMERALD, 12), 4, 10, 0.2f));
            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_11, 1),
                    new ItemStack(Items.EMERALD, 10), 4, 10, 0.2f));
            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_WARD, 1),
                    new ItemStack(Items.EMERALD, 12), 4, 10, 0.2f));

            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_FAR, 1), 2, 14, 0.2f));
            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_MALL, 1), 2, 14, 0.2f));
            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_MELLOHI, 1), 2, 14, 0.2f));
            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(Items.MUSIC_DISC_STAL, 1), 2, 14, 0.2f));


            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_PIGSTEP, 1),
                    new ItemStack(Items.EMERALD, 18), 4, 18, 0.2f));
            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_RELIC, 1),
                    new ItemStack(Items.EMERALD, 18), 4, 18, 0.2f));
            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_CREATOR, 1),
                    new ItemStack(Items.EMERALD, 18), 4, 18, 0.2f));
            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_CREATOR_MUSIC_BOX, 1),
                    new ItemStack(Items.EMERALD, 18), 4, 18, 0.2f));

            trades.get(5).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_5, 1),
                    new ItemStack(Items.EMERALD, 18), 4, 18, 0.2f));
            trades.get(5).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.MUSIC_DISC_OTHERSIDE, 1),
                    new ItemStack(Items.EMERALD, 18), 4, 18, 0.2f));
        }
    }

}
