package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseOresTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DenseOresBiomeTagsProvider extends BiomeTagsProvider {
    public DenseOresBiomeTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookup, ExistingFileHelper exFileHelper) {
        super(packOutput, lookup, DenseOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        tag(DenseOresTags.Biomes.IS_MOUNTAIN).add(Biomes.WINDSWEPT_HILLS, Biomes.MEADOW, Biomes.FROZEN_PEAKS, Biomes.JAGGED_PEAKS, Biomes.STONY_PEAKS, Biomes.SNOWY_SLOPES, Biomes.GROVE);
    }
}
