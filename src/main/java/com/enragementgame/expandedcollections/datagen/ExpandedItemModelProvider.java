package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.registries.ItemRegister;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ExpandedItemModelProvider extends ItemModelProvider {
    public ExpandedItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExpandedCollections.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemRegister.GUARD_ARMOR_TRIM_SMITHING_TEMPLATE.get());
        basicItem(ItemRegister.MUSIC_DISC_WOLF.get());
        basicItem(ItemRegister.MUSIC_DISC_CREEPER_SONG.get());
        basicItem(ItemRegister.CROAK_BANNER_PATTERN.get());
        basicItem(ItemRegister.EARS_BANNER_PATTERN.get());
        basicItem(ItemRegister.RIVETS_BANNER_PATTERN.get());
    }
}
