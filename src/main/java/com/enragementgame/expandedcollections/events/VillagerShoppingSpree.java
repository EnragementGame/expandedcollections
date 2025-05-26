package com.enragementgame.expandedcollections.events;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.registries.DataRegister;
import net.minecraft.world.Containers;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.TradeWithVillagerEvent;

@EventBusSubscriber(modid = ExpandedCollections.MODID, bus = EventBusSubscriber.Bus.GAME)
public class VillagerShoppingSpree {
    private static final int requiredTrades = 50;

    @SubscribeEvent
    public static void completeTrade(TradeWithVillagerEvent event){
        int currentTradeCount = event.getAbstractVillager().getData(DataRegister.TRADE_COUNT);
        if(currentTradeCount >= requiredTrades) {
            //if(event.getAbstractVillager().getData())
            //{

            //}
            Containers.dropItemStack(event.getAbstractVillager().level(),
                    event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), new ItemStack(Items.DIAMOND));
            event.getAbstractVillager().setData(DataRegister.TRADE_COUNT, 0);
            return;
        }
        int newTradeCount = currentTradeCount + 1;
        event.getAbstractVillager().setData(DataRegister.TRADE_COUNT, newTradeCount);
    }
}
