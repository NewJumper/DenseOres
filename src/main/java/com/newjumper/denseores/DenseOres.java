package com.newjumper.denseores;

import com.newjumper.denseores.content.DenseBlocks;
import com.newjumper.denseores.datagen.assets.DenseOresBlockStateProvider;
import com.newjumper.denseores.datagen.assets.DenseOresItemModelProvider;
import com.newjumper.denseores.datagen.assets.ENLanguageProvider;
import com.newjumper.denseores.datagen.data.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.concurrent.CompletableFuture;

@Mod(DenseOres.MOD_ID)
public class DenseOres {
    public static final String MOD_ID = "denseores";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DENSE_ORES = CREATIVE_MODE_TABS.register("dense_ores", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + MOD_ID)).icon(() -> new ItemStack(DenseBlocks.DENSE_DIAMOND_ORE)).build());

    public DenseOres(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
        DenseBlocks.BLOCKS.register(eventBus);
        DenseBlocks.ITEMS.register(eventBus);

        eventBus.addListener(this::buildCreativeTab);
        eventBus.addListener(this::generateData);
    }

    public void buildCreativeTab(final BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == DENSE_ORES.get()) DenseBlocks.BLOCKS.getEntries().forEach(block -> event.accept(block.getDelegate().value()));
    }

    public void generateData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // assets
        generator.addProvider(event.includeClient(), new DenseOresBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new DenseOresItemModelProvider(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new ENLanguageProvider(packOutput));

        // data
        DenseOresBlockTagsProvider blockTags = new DenseOresBlockTagsProvider(packOutput, lookupProvider, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new DenseOresItemTagsProvider(packOutput, lookupProvider, blockTags.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new DenseOresBiomeTagsProvider(packOutput, lookupProvider, fileHelper));

        generator.addProvider(event.includeServer(), new DenseOresWorldGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new DenseOresLootTableProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new SmeltingRecipesProvider(packOutput, lookupProvider));
    }
}
