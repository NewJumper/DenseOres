package com.newjumper.denseores;


import com.newjumper.denseores.datagen.assets.ENLanguageProvider;
import com.newjumper.denseores.datagen.assets.ModelGenerator;
import com.newjumper.denseores.datagen.data.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Mod(DenseOres.MOD_ID)
public class NeoForgeDenseOres {
    public NeoForgeDenseOres(IEventBus eventBus) {
        eventBus.addListener(RegisterEvent.class, event -> {
            register(event, Registries.BLOCK, DenseBlocks::registerBlocks);
            register(event, Registries.ITEM, DenseBlocks::registerItems);
            register(event, Registries.CREATIVE_MODE_TAB, c -> DenseOres.registerCreativeTab(c, CreativeModeTab.builder()));
        });

        eventBus.addListener(this::generateData);
    }

    private static <T> void register(RegisterEvent event, ResourceKey<Registry<T>> registry, Consumer<BiConsumer<Identifier, T>> consumer) {
        event.register(registry, r -> consumer.accept(r::register));
    }

    public void generateData(final GatherDataEvent.Client event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();

        event.addProvider(new ModelGenerator(output));
        event.addProvider(new ENLanguageProvider(output));

        BlockTagsGenerator blockTags = new BlockTagsGenerator(output, lookup);
        event.addProvider(blockTags);
        event.addProvider(new ItemTagsGenerator(output, lookup, blockTags.contentsGetter()));
        event.addProvider(new BiomeTagsGenerator(output, lookup));
        event.addProvider(new DatapackEntriesGenerator(output, lookup));
        event.addProvider(new LootTableGenerator(output, lookup));
        event.addProvider(new SmeltingRecipesGenerator.Runner(output, lookup));
    }
}
