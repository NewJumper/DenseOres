package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.DenseOresTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.world.level.biome.Biomes;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("NullableProblems, unchecked")
public class BiomeTagsGenerator extends BiomeTagsProvider {
    public BiomeTagsGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, DenseOres.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(DenseOresTags.Biomes.GENERATES_EMERALDS).add(
                Biomes.MEADOW,
                Biomes.CHERRY_GROVE,
                Biomes.GROVE,
                Biomes.SNOWY_SLOPES,
                Biomes.JAGGED_PEAKS,
                Biomes.FROZEN_OCEAN,
                Biomes.STONY_PEAKS,
                Biomes.WINDSWEPT_HILLS,
                Biomes.WINDSWEPT_GRAVELLY_HILLS,
                Biomes.WINDSWEPT_FOREST
        );
    }
}
