package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseBlocks;
import com.newjumper.denseores.content.DenseOresTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class DenseOresBlockTagsProvider extends BlockTagsProvider {
    public DenseOresBlockTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DenseOres.MOD_ID, exFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES, DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);
        tag(BlockTags.NEEDS_STONE_TOOL).add(DenseBlocks.DENSE_IRON_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get(), DenseBlocks.DENSE_COPPER_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get(), DenseBlocks.DENSE_LAPIS_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DenseBlocks.DENSE_GOLD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), DenseBlocks.DENSE_REDSTONE_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get(), DenseBlocks.DENSE_EMERALD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get(), DenseBlocks.DENSE_DIAMOND_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());

        tag(BlockTags.COAL_ORES).add(DenseBlocks.DENSE_COAL_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get());
        tag(BlockTags.IRON_ORES).add(DenseBlocks.DENSE_IRON_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get());
        tag(BlockTags.COPPER_ORES).add(DenseBlocks.DENSE_COPPER_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get());
        tag(BlockTags.GOLD_ORES).add(DenseBlocks.DENSE_GOLD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), DenseBlocks.DENSE_NETHER_GOLD_ORE.get());
        tag(BlockTags.REDSTONE_ORES).add(DenseBlocks.DENSE_REDSTONE_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get());
        tag(BlockTags.EMERALD_ORES).add(DenseBlocks.DENSE_EMERALD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get());
        tag(BlockTags.LAPIS_ORES).add(DenseBlocks.DENSE_LAPIS_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get());
        tag(BlockTags.DIAMOND_ORES).add(DenseBlocks.DENSE_DIAMOND_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());

        tag(Tags.Blocks.ORES).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES);
        tag(Tags.Blocks.ORES_COAL).add(DenseBlocks.DENSE_COAL_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get());
        tag(Tags.Blocks.ORES_IRON).add(DenseBlocks.DENSE_IRON_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get());
        tag(Tags.Blocks.ORES_COPPER).add(DenseBlocks.DENSE_COPPER_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get());
        tag(Tags.Blocks.ORES_GOLD).add(DenseBlocks.DENSE_GOLD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), DenseBlocks.DENSE_NETHER_GOLD_ORE.get());
        tag(Tags.Blocks.ORES_REDSTONE).add(DenseBlocks.DENSE_REDSTONE_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get());
        tag(Tags.Blocks.ORES_EMERALD).add(DenseBlocks.DENSE_EMERALD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get());
        tag(Tags.Blocks.ORES_LAPIS).add(DenseBlocks.DENSE_LAPIS_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get());
        tag(Tags.Blocks.ORES_DIAMOND).add(DenseBlocks.DENSE_DIAMOND_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());
        tag(Tags.Blocks.ORE_RATES_DENSE).addTags(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES, DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_STONE).addTag(DenseOresTags.Blocks.DENSE_STONE_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).addTag(DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES);
        tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK).addTag(DenseOresTags.Blocks.DENSE_NETHERRACK_ORES);

        tag(DenseOresTags.Blocks.DENSE_STONE_ORES).add(DenseBlocks.DENSE_COAL_ORE.get(), DenseBlocks.DENSE_IRON_ORE.get(), DenseBlocks.DENSE_COPPER_ORE.get(), DenseBlocks.DENSE_GOLD_ORE.get(), DenseBlocks.DENSE_REDSTONE_ORE.get(), DenseBlocks.DENSE_EMERALD_ORE.get(), DenseBlocks.DENSE_LAPIS_ORE.get(), DenseBlocks.DENSE_DIAMOND_ORE.get());
        tag(DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES).add(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());
        tag(DenseOresTags.Blocks.DENSE_NETHERRACK_ORES).add(DenseBlocks.DENSE_NETHER_GOLD_ORE.get(), DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get());
    }

    @NotNull
    @Override
    public String getName() {
        return "Block Tags";
    }
}
