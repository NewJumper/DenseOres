package com.newjumper.denseores;

import com.newjumper.denseores.content.DenseBlocks;
import com.newjumper.denseores.datagen.assets.DenseOresBlockStateProvider;
import com.newjumper.denseores.datagen.assets.DenseOresItemModelProvider;
import com.newjumper.denseores.datagen.assets.ENLanguageProvider;
import com.newjumper.denseores.datagen.data.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod(DenseOres.MOD_ID)
public class DenseOres {
    public static final String MOD_ID = "denseores";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> DENSE_ORES = CREATIVE_MODE_TABS.register("dense_ores", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + MOD_ID)).icon(() -> new ItemStack(DenseBlocks.DENSE_DIAMOND_ORE.get())).build());

    public DenseOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CREATIVE_MODE_TABS.register(eventBus);
        DenseBlocks.BLOCKS.register(eventBus);
        DenseBlocks.ITEMS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(this::buildCreativeTab);
        eventBus.addListener(this::generateData);
    }

    public void buildCreativeTab(final BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == DENSE_ORES.get()) DenseBlocks.BLOCKS.getEntries().forEach(event::accept);
    }

    public void generateData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        // assets
        generator.addProvider(event.includeClient(), new DenseOresBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new DenseOresItemModelProvider(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new ENLanguageProvider(packOutput));

        // data
        DenseOresBlockTagsProvider blockTags = new DenseOresBlockTagsProvider(packOutput, event.getLookupProvider(), fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new DenseOresItemTagsProvider(packOutput, event.getLookupProvider(), blockTags, fileHelper));
        generator.addProvider(event.includeServer(), new DenseOresBiomeTagsProvider(packOutput, event.getLookupProvider(), fileHelper));

        generator.addProvider(event.includeServer(), new DenseOresWorldGen(packOutput, event.getLookupProvider()));
        generator.addProvider(event.includeServer(), new DenseOresLootTableProvider(packOutput));
        generator.addProvider(event.includeServer(), new SmeltingRecipesProvider(packOutput));
    }
}
