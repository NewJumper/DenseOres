package com.newjumper.denseores.datagen.assets;

import com.newjumper.denseores.DenseBlocks;
import com.newjumper.denseores.DenseOres;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import org.jspecify.annotations.NonNull;

public class ModelGenerator extends ModelProvider {
    public ModelGenerator(PackOutput output) {
        super(output, DenseOres.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, @NonNull ItemModelGenerators itemModels) {
        DenseBlocks.BLOCKS.values().forEach(blockModels::createTrivialCube);
    }
}
