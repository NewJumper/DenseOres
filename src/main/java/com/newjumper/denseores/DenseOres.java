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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod(DenseOres.MOD_ID)
public class DenseOres {
    public static final String MOD_ID = "denseores";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public DenseOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DenseBlocks.BLOCKS.register(eventBus);
        DenseBlocks.ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);

        eventBus.addListener(this::generateData);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final RegistryObject<CreativeModeTab> denseOresTab = CREATIVE_MODE_TABS.register("dense_ores_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(DenseBlocks.DENSE_DIAMOND_ORE.get()))
            .title(Component.translatable("itemGroup." + MOD_ID))
            .displayItems((itemDisplay, output) -> DenseBlocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()))).build()
    );

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

        generator.addProvider(event.includeServer(), new DenseOresLootTableProvider(packOutput));
        generator.addProvider(event.includeServer(), new SmeltingRecipesProvider(packOutput));

        generator.addProvider(event.includeServer(), new DenseOresWorldGen(packOutput, event.getLookupProvider()));
    }
}
