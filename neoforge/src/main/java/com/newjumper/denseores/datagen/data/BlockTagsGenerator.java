package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.DenseBlocks;
import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.DenseOresTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("NullableProblems, unchecked")
public class BlockTagsGenerator extends BlockTagsProvider {
    public BlockTagsGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, DenseOres.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES, DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);
        tag(BlockTags.NEEDS_STONE_TOOL).add(DenseBlocks.DENSE_IRON_ORE, DenseBlocks.DENSE_DEEPSLATE_IRON_ORE, DenseBlocks.DENSE_COPPER_ORE, DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE, DenseBlocks.DENSE_LAPIS_ORE, DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE);
        tag(BlockTags.NEEDS_IRON_TOOL).add(DenseBlocks.DENSE_GOLD_ORE, DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE, DenseBlocks.DENSE_REDSTONE_ORE, DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE, DenseBlocks.DENSE_EMERALD_ORE, DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE, DenseBlocks.DENSE_DIAMOND_ORE, DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE);
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(DenseBlocks.ANCIENT_NETHER_ORE);

        tag(BlockTags.COAL_ORES).add(DenseBlocks.DENSE_COAL_ORE, DenseBlocks.DENSE_DEEPSLATE_COAL_ORE);
        tag(BlockTags.IRON_ORES).add(DenseBlocks.DENSE_IRON_ORE, DenseBlocks.DENSE_DEEPSLATE_IRON_ORE);
        tag(BlockTags.COPPER_ORES).add(DenseBlocks.DENSE_COPPER_ORE, DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE);
        tag(BlockTags.GOLD_ORES).add(DenseBlocks.DENSE_GOLD_ORE, DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE, DenseBlocks.DENSE_NETHER_GOLD_ORE);
        tag(BlockTags.REDSTONE_ORES).add(DenseBlocks.DENSE_REDSTONE_ORE, DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE);
        tag(BlockTags.EMERALD_ORES).add(DenseBlocks.DENSE_EMERALD_ORE, DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE);
        tag(BlockTags.LAPIS_ORES).add(DenseBlocks.DENSE_LAPIS_ORE, DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE);
        tag(BlockTags.DIAMOND_ORES).add(DenseBlocks.DENSE_DIAMOND_ORE, DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE);

        tag(Tags.Blocks.ORES).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES);
        tag(Tags.Blocks.ORES_COAL).add(DenseBlocks.DENSE_COAL_ORE, DenseBlocks.DENSE_DEEPSLATE_COAL_ORE);
        tag(Tags.Blocks.ORES_IRON).add(DenseBlocks.DENSE_IRON_ORE, DenseBlocks.DENSE_DEEPSLATE_IRON_ORE);
        tag(Tags.Blocks.ORES_COPPER).add(DenseBlocks.DENSE_COPPER_ORE, DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE);
        tag(Tags.Blocks.ORES_GOLD).add(DenseBlocks.DENSE_GOLD_ORE, DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE, DenseBlocks.DENSE_NETHER_GOLD_ORE);
        tag(Tags.Blocks.ORES_REDSTONE).add(DenseBlocks.DENSE_REDSTONE_ORE, DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE);
        tag(Tags.Blocks.ORES_EMERALD).add(DenseBlocks.DENSE_EMERALD_ORE, DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE);
        tag(Tags.Blocks.ORES_LAPIS).add(DenseBlocks.DENSE_LAPIS_ORE, DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE);
        tag(Tags.Blocks.ORES_DIAMOND).add(DenseBlocks.DENSE_DIAMOND_ORE, DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE);
        tag(Tags.Blocks.ORES_NETHERITE_SCRAP).add(DenseBlocks.ANCIENT_NETHER_ORE);
        tag(Tags.Blocks.ORE_RATES_DENSE).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES, DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_STONE).addTag(DenseOresTags.Blocks.DENSE_STONE_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).addTag(DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK).addTag(DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);

        tag(DenseOresTags.Blocks.DENSE_STONE_ORES).add(DenseBlocks.DENSE_COAL_ORE, DenseBlocks.DENSE_IRON_ORE, DenseBlocks.DENSE_COPPER_ORE, DenseBlocks.DENSE_GOLD_ORE, DenseBlocks.DENSE_REDSTONE_ORE, DenseBlocks.DENSE_EMERALD_ORE, DenseBlocks.DENSE_LAPIS_ORE, DenseBlocks.DENSE_DIAMOND_ORE);
        tag(DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES).add(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE, DenseBlocks.DENSE_DEEPSLATE_IRON_ORE, DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE, DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE, DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE, DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE, DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE, DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE);
        tag(DenseOresTags.Blocks.DENSE_NETHERRACK_ORES).add(DenseBlocks.DENSE_NETHER_GOLD_ORE, DenseBlocks.DENSE_NETHER_QUARTZ_ORE, DenseBlocks.ANCIENT_NETHER_ORE);
    }
}
