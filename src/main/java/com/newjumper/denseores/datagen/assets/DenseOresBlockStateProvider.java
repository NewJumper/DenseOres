package com.newjumper.denseores.datagen.assets;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DenseOresBlockStateProvider extends BlockStateProvider {
    public DenseOresBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DenseOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(DenseBlocks.DENSE_COAL_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get());
        simpleBlock(DenseBlocks.DENSE_IRON_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get());
        simpleBlock(DenseBlocks.DENSE_COPPER_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get());
        simpleBlock(DenseBlocks.DENSE_GOLD_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get());
        simpleBlock(DenseBlocks.DENSE_REDSTONE_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get());
        simpleBlock(DenseBlocks.DENSE_EMERALD_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get());
        simpleBlock(DenseBlocks.DENSE_LAPIS_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DIAMOND_ORE.get());
        simpleBlock(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());

        simpleBlock(DenseBlocks.DENSE_NETHER_GOLD_ORE.get());
        simpleBlock(DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get());
        simpleBlock(DenseBlocks.ANCIENT_NETHER_ORE.get());
    }
}
