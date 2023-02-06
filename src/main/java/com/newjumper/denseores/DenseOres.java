package com.newjumper.denseores;

import com.newjumper.denseores.content.DenseBlocks;
import com.newjumper.denseores.datagen.assets.DenseOresBlockStateProvider;
import com.newjumper.denseores.datagen.assets.DenseOresItemModelProvider;
import com.newjumper.denseores.datagen.assets.ENLanguageProvider;
import com.newjumper.denseores.datagen.data.DenseOresBlockTagsProvider;
import com.newjumper.denseores.datagen.data.DenseOresItemTagsProvider;
import com.newjumper.denseores.datagen.data.DenseOresLootTableProvider;
import com.newjumper.denseores.datagen.data.SmeltingRecipesProvider;
import com.newjumper.denseores.world.DenseConfiguredFeatures;
import com.newjumper.denseores.world.DensePlacedFeatures;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DenseOres.MOD_ID)
public class DenseOres {
    public static final String MOD_ID = "denseores";

    public DenseOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DenseBlocks.BLOCKS.register(eventBus);
        DenseConfiguredFeatures.CONFIGURED_FEATURES.register(eventBus);
        DensePlacedFeatures.PLACED_FEATURES.register(eventBus);
        DenseBlocks.ITEMS.register(eventBus);

        eventBus.addListener(this::generateData);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void generateData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        // assets
        generator.addProvider(event.includeClient(), new DenseOresBlockStateProvider(generator, fileHelper));
        generator.addProvider(event.includeClient(), new DenseOresItemModelProvider(generator, fileHelper));
        generator.addProvider(event.includeClient(), new ENLanguageProvider(generator));

        // data
        DenseOresBlockTagsProvider blockTags = new DenseOresBlockTagsProvider(generator, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new DenseOresItemTagsProvider(generator, blockTags, fileHelper));

        generator.addProvider(event.includeServer(), new DenseOresLootTableProvider(generator));
        generator.addProvider(event.includeServer(), new SmeltingRecipesProvider(generator));
    }
}
