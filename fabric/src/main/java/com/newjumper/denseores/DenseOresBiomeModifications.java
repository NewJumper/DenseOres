package com.newjumper.denseores;

import com.newjumper.denseores.world.DensePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public class DenseOresBiomeModifications {
    public static void modifyBiomes() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_COAL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_COAL_BURIED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_IRON_SMALL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_IRON_LARGE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_COPPER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_GOLD);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BADLANDS), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_GOLD_EXTRA);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_REDSTONE_UPPER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_REDSTONE_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.tag(DenseOresTags.Biomes.GENERATES_EMERALDS), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_EMERALD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_LAPIS_UPPER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_LAPIS_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_DIAMOND_SMALL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_DIAMOND_LARGE);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_NETHER_GOLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.DENSE_NETHER_QUARTZ);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.ANCIENT_NETHER_UPPER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, DensePlacedFeatures.ANCIENT_NETHER_LOWER);
    }
}
