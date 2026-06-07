package com.newjumper.denseores;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.BiConsumer;

public class DenseOres {
    public static final String MOD_ID = "denseores";

    public static CreativeModeTab DENSE_ORES = null;

    public static void registerCreativeTab(BiConsumer<Identifier, CreativeModeTab> registry, CreativeModeTab.Builder builder) {
        DENSE_ORES = builder.title(Component.translatable("itemGroup." + DenseOres.MOD_ID))
                .icon(() -> DenseBlocks.DENSE_DIAMOND_ORE.asItem().getDefaultInstance())
                .displayItems((_, output) -> {
                    output.accept(DenseBlocks.DENSE_COAL_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE);
                    output.accept(DenseBlocks.DENSE_IRON_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE);
                    output.accept(DenseBlocks.DENSE_COPPER_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE);
                    output.accept(DenseBlocks.DENSE_GOLD_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE);
                    output.accept(DenseBlocks.DENSE_REDSTONE_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE);
                    output.accept(DenseBlocks.DENSE_EMERALD_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE);
                    output.accept(DenseBlocks.DENSE_LAPIS_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE);
                    output.accept(DenseBlocks.DENSE_DIAMOND_ORE);
                    output.accept(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE);
                    output.accept(DenseBlocks.DENSE_NETHER_GOLD_ORE);
                    output.accept(DenseBlocks.DENSE_NETHER_QUARTZ_ORE);
                    output.accept(DenseBlocks.ANCIENT_NETHER_ORE);
                }).build();

        registry.accept(DenseOres.id("creative_tab"), DENSE_ORES);
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
