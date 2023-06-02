package com.newjumper.denseores;

import com.newjumper.denseores.content.DenseBlocks;
import com.newjumper.denseores.datagen.assets.DenseOresBlockStateProvider;
import com.newjumper.denseores.datagen.assets.DenseOresItemModelProvider;
import com.newjumper.denseores.datagen.assets.ENLanguageProvider;
import com.newjumper.denseores.datagen.data.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DenseOres.MOD_ID)
public class DenseOres {
    public static final String MOD_ID = "denseores";

    public DenseOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DenseBlocks.BLOCKS.register(eventBus);
        DenseBlocks.ITEMS.register(eventBus);

        eventBus.addListener(this::registerCreativeTab);
        eventBus.addListener(this::generateData);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void registerCreativeTab(final CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "denseores"), builder -> builder.icon(() -> new ItemStack(DenseBlocks.DENSE_DIAMOND_ORE.get()))
                .title(Component.translatable("itemGroup." + MOD_ID))
                .displayItems((itemDisplay, output) -> {
                    output.accept(DenseBlocks.DENSE_COAL_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get());
                    output.accept(DenseBlocks.DENSE_IRON_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get());
                    output.accept(DenseBlocks.DENSE_COPPER_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get());
                    output.accept(DenseBlocks.DENSE_GOLD_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get());
                    output.accept(DenseBlocks.DENSE_REDSTONE_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get());
                    output.accept(DenseBlocks.DENSE_EMERALD_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get());
                    output.accept(DenseBlocks.DENSE_LAPIS_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get());
                    output.accept(DenseBlocks.DENSE_DIAMOND_ORE.get());
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());
                    output.accept(DenseBlocks.DENSE_NETHER_GOLD_ORE.get());
                    output.accept(DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get());
                    output.accept(DenseBlocks.ANCIENT_NETHER_ORE.get());
                })
        );
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

        generator.addProvider(event.includeServer(), new DenseOresLootTableProvider(packOutput));
        generator.addProvider(event.includeServer(), new SmeltingRecipesProvider(packOutput));

        generator.addProvider(event.includeServer(), new DenseOresWorldGen(packOutput, event.getLookupProvider()));
    }
}
