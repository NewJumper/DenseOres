package com.newjumper.denseores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FabricDenseOres implements ModInitializer {
    @Override
    public void onInitialize() {
        register(BuiltInRegistries.BLOCK, DenseBlocks::registerBlocks);
        register(BuiltInRegistries.ITEM, DenseBlocks::registerItems);
        register(BuiltInRegistries.CREATIVE_MODE_TAB, c -> DenseOres.registerCreativeTab(c, FabricCreativeModeTab.builder()));

        DenseOresBiomeModifications.modifyBiomes();
    }

    private static <T> void register(Registry<T> registry, Consumer<BiConsumer<Identifier, T>> consumer) {
        consumer.accept((id, t) -> Registry.register(registry, id, t));
    }
}
