package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = ExpandedCollections.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ExtendedDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ExpandedRecipeProvider(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new ExpandedBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ExpandedItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ExpandedBannerTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new ExpandedItemModelProvider(packOutput,existingFileHelper));

        generator.addProvider(event.includeServer(), new ExpandedDatapackProvider(packOutput, lookupProvider));
    }
}
