package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.world.DenseBiomeModifiers;
import com.newjumper.denseores.world.DenseConfiguredFeatures;
import com.newjumper.denseores.world.DensePlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class DenseOresWorldGen extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder().add(ForgeRegistries.Keys.BIOME_MODIFIERS, DenseBiomeModifiers::bootstrap).add(Registries.CONFIGURED_FEATURE, DenseConfiguredFeatures::bootstrap).add(Registries.PLACED_FEATURE, DensePlacedFeatures::bootstrap);

    public DenseOresWorldGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(DenseOres.MOD_ID));
    }
}
