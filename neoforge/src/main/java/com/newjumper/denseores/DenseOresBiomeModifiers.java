package com.newjumper.denseores;

import com.newjumper.denseores.world.DensePlacedFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class DenseOresBiomeModifiers {
    public static final ResourceKey<BiomeModifier> DENSE_COAL = key("dense_coal");
    public static final ResourceKey<BiomeModifier> DENSE_COAL_BURIED = key("dense_coal_buried");
    public static final ResourceKey<BiomeModifier> DENSE_IRON_SMALL = key("dense_iron_small");
    public static final ResourceKey<BiomeModifier> DENSE_IRON_LARGE = key("dense_iron_large");
    public static final ResourceKey<BiomeModifier> DENSE_COPPER = key("dense_copper");
    public static final ResourceKey<BiomeModifier> DENSE_GOLD = key("dense_gold");
    public static final ResourceKey<BiomeModifier> DENSE_GOLD_EXTRA = key("dense_gold_extra");
    public static final ResourceKey<BiomeModifier> DENSE_REDSTONE_UPPER = key("dense_redstone_upper");
    public static final ResourceKey<BiomeModifier> DENSE_REDSTONE_LOWER = key("dense_redstone_lower");
    public static final ResourceKey<BiomeModifier> DENSE_EMERALD = key("dense_emerald");
    public static final ResourceKey<BiomeModifier> DENSE_LAPIS_UPPER = key("dense_lapis_upper");
    public static final ResourceKey<BiomeModifier> DENSE_LAPIS_LOWER = key("dense_lapis_lower");
    public static final ResourceKey<BiomeModifier> DENSE_DIAMOND_SMALL = key("dense_diamond_small");
    public static final ResourceKey<BiomeModifier> DENSE_DIAMOND_LARGE = key("dense_diamond_large");

    public static final ResourceKey<BiomeModifier> DENSE_NETHER_GOLD = key("dense_nether_gold");
    public static final ResourceKey<BiomeModifier> DENSE_NETHER_QUARTZ = key("dense_nether_quartz");
    public static final ResourceKey<BiomeModifier> ANCIENT_NETHER_UPPER = key("ancient_nether_upper");
    public static final ResourceKey<BiomeModifier> ANCIENT_NETHER_LOWER = key("ancient_nether_lower");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);

        context.register(DENSE_COAL, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_COAL)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_COAL_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_COAL_BURIED)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_IRON_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_IRON_SMALL)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_IRON_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_IRON_LARGE)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_COPPER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_COPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_GOLD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_GOLD)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_GOLD_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_BADLANDS), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_GOLD_EXTRA)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_REDSTONE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_REDSTONE_UPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_REDSTONE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_REDSTONE_LOWER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_EMERALD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(DenseOresTags.Biomes.GENERATES_EMERALDS), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_EMERALD)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_LAPIS_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_LAPIS_UPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_LAPIS_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_LAPIS_LOWER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_DIAMOND_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_DIAMOND_SMALL)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_DIAMOND_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_DIAMOND_LARGE)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(DENSE_NETHER_GOLD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_NETHER_GOLD)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_NETHER_QUARTZ, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_NETHER_QUARTZ)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ANCIENT_NETHER_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.ANCIENT_NETHER_UPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ANCIENT_NETHER_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.ANCIENT_NETHER_LOWER)), GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    public static ResourceKey<BiomeModifier> key(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, DenseOres.id(name));
    }
}
