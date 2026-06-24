package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.DenseBlockIds;
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
        tag(BlockTags.NEEDS_STONE_TOOL).add(DenseBlockIds.DENSE_IRON_ORE, DenseBlockIds.DENSE_DEEPSLATE_IRON_ORE, DenseBlockIds.DENSE_COPPER_ORE, DenseBlockIds.DENSE_DEEPSLATE_COPPER_ORE, DenseBlockIds.DENSE_LAPIS_ORE, DenseBlockIds.DENSE_DEEPSLATE_LAPIS_ORE);
        tag(BlockTags.NEEDS_IRON_TOOL).add(DenseBlockIds.DENSE_GOLD_ORE, DenseBlockIds.DENSE_DEEPSLATE_GOLD_ORE, DenseBlockIds.DENSE_REDSTONE_ORE, DenseBlockIds.DENSE_DEEPSLATE_REDSTONE_ORE, DenseBlockIds.DENSE_EMERALD_ORE, DenseBlockIds.DENSE_DEEPSLATE_EMERALD_ORE, DenseBlockIds.DENSE_DIAMOND_ORE, DenseBlockIds.DENSE_DEEPSLATE_DIAMOND_ORE);
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(DenseBlockIds.ANCIENT_NETHER_ORE);

        tag(BlockTags.IRON_ORES).add(DenseBlockIds.DENSE_IRON_ORE, DenseBlockIds.DENSE_DEEPSLATE_IRON_ORE);
        tag(BlockTags.COPPER_ORES).add(DenseBlockIds.DENSE_COPPER_ORE, DenseBlockIds.DENSE_DEEPSLATE_COPPER_ORE);
        tag(BlockTags.GOLD_ORES).add(DenseBlockIds.DENSE_GOLD_ORE, DenseBlockIds.DENSE_DEEPSLATE_GOLD_ORE, DenseBlockIds.DENSE_NETHER_GOLD_ORE);

        tag(Tags.Blocks.ORES).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES);
        tag(Tags.Blocks.ORES_COAL).add(DenseBlockIds.DENSE_COAL_ORE, DenseBlockIds.DENSE_DEEPSLATE_COAL_ORE);
        tag(Tags.Blocks.ORES_IRON).add(DenseBlockIds.DENSE_IRON_ORE, DenseBlockIds.DENSE_DEEPSLATE_IRON_ORE);
        tag(Tags.Blocks.ORES_COPPER).add(DenseBlockIds.DENSE_COPPER_ORE, DenseBlockIds.DENSE_DEEPSLATE_COPPER_ORE);
        tag(Tags.Blocks.ORES_GOLD).add(DenseBlockIds.DENSE_GOLD_ORE, DenseBlockIds.DENSE_DEEPSLATE_GOLD_ORE, DenseBlockIds.DENSE_NETHER_GOLD_ORE);
        tag(Tags.Blocks.ORES_REDSTONE).add(DenseBlockIds.DENSE_REDSTONE_ORE, DenseBlockIds.DENSE_DEEPSLATE_REDSTONE_ORE);
        tag(Tags.Blocks.ORES_EMERALD).add(DenseBlockIds.DENSE_EMERALD_ORE, DenseBlockIds.DENSE_DEEPSLATE_EMERALD_ORE);
        tag(Tags.Blocks.ORES_LAPIS).add(DenseBlockIds.DENSE_LAPIS_ORE, DenseBlockIds.DENSE_DEEPSLATE_LAPIS_ORE);
        tag(Tags.Blocks.ORES_DIAMOND).add(DenseBlockIds.DENSE_DIAMOND_ORE, DenseBlockIds.DENSE_DEEPSLATE_DIAMOND_ORE);
        tag(Tags.Blocks.ORES_NETHERITE_SCRAP).add(DenseBlockIds.ANCIENT_NETHER_ORE);
        tag(Tags.Blocks.ORE_RATES_DENSE).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES, DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_STONE).addTag(DenseOresTags.Blocks.DENSE_STONE_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).addTag(DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK).addTag(DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);

        tag(DenseOresTags.Blocks.DENSE_STONE_ORES).add(DenseBlockIds.DENSE_COAL_ORE, DenseBlockIds.DENSE_IRON_ORE, DenseBlockIds.DENSE_COPPER_ORE, DenseBlockIds.DENSE_GOLD_ORE, DenseBlockIds.DENSE_REDSTONE_ORE, DenseBlockIds.DENSE_EMERALD_ORE, DenseBlockIds.DENSE_LAPIS_ORE, DenseBlockIds.DENSE_DIAMOND_ORE);
        tag(DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES).add(DenseBlockIds.DENSE_DEEPSLATE_COAL_ORE, DenseBlockIds.DENSE_DEEPSLATE_IRON_ORE, DenseBlockIds.DENSE_DEEPSLATE_COPPER_ORE, DenseBlockIds.DENSE_DEEPSLATE_GOLD_ORE, DenseBlockIds.DENSE_DEEPSLATE_REDSTONE_ORE, DenseBlockIds.DENSE_DEEPSLATE_EMERALD_ORE, DenseBlockIds.DENSE_DEEPSLATE_LAPIS_ORE, DenseBlockIds.DENSE_DEEPSLATE_DIAMOND_ORE);
        tag(DenseOresTags.Blocks.DENSE_NETHERRACK_ORES).add(DenseBlockIds.DENSE_NETHER_GOLD_ORE, DenseBlockIds.DENSE_NETHER_QUARTZ_ORE, DenseBlockIds.ANCIENT_NETHER_ORE);
    }
}
