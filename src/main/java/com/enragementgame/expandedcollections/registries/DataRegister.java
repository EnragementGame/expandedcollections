package com.enragementgame.expandedcollections.registries;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.mojang.serialization.Codec;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class DataRegister {
    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, ExpandedCollections.MODID);

    public static final Supplier<AttachmentType<Integer>> TRADE_COUNT = ATTACHMENT_TYPES.register(
            "trade_count", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );

    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);
    }
}
