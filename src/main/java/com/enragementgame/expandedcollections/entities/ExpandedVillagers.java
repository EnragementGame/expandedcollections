package com.enragementgame.expandedcollections.entities;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ExpandedVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, ExpandedCollections.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSION =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, ExpandedCollections.MODID);

    public static final Holder<PoiType> MUSICIAN_POI = POI_TYPES.register("musician_poi", () -> new PoiType(ImmutableSet.copyOf(Blocks.JUKEBOX.getStateDefinition().getPossibleStates()), 1, 1));

    public static final Holder<VillagerProfession> MUSICIAN = VILLAGER_PROFESSION.register("musician",
            () -> new VillagerProfession("musician", holder -> holder.value() == MUSICIAN_POI.value(),
                    poiTypeHolder -> poiTypeHolder.value() == MUSICIAN_POI.value(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.NOTE_BLOCK_BASEDRUM.value()));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSION.register(eventBus);
    }
}
