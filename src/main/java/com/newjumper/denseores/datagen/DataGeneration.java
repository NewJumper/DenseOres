package com.newjumper.denseores.datagen;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.datagen.assets.DenseOresBlockStateProvider;
import com.newjumper.denseores.datagen.assets.DenseOresItemModelProvider;
import com.newjumper.denseores.datagen.assets.ENLanguageProvider;
import com.newjumper.denseores.datagen.data.DenseOresBlockTagsProvider;
import com.newjumper.denseores.datagen.data.DenseOresItemTagsProvider;
import com.newjumper.denseores.datagen.data.DenseOresLootTableProvider;
import com.newjumper.denseores.datagen.data.SmeltingRecipesProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DenseOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        // assets
        generator.addProvider(event.includeClient(), new ENLanguageProvider(generator));

        generator.addProvider(event.includeClient(), new DenseOresBlockStateProvider(generator, fileHelper));
        generator.addProvider(event.includeClient(), new DenseOresItemModelProvider(generator, fileHelper));

        // data
        generator.addProvider(event.includeServer(), new SmeltingRecipesProvider(generator));

        DenseOresBlockTagsProvider blockTags = new DenseOresBlockTagsProvider(generator, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new DenseOresItemTagsProvider(generator, blockTags, fileHelper));

        generator.addProvider(event.includeServer(), new DenseOresLootTableProvider(generator));
    }
}
