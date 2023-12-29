package com.newjumper.denseores.world;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseOresTags;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class DenseBiomeModifiers {
    public static final ResourceKey<BiomeModifier> DENSE_COAL = createKey("dense_coal");
    public static final ResourceKey<BiomeModifier> DENSE_COAL_BURIED = createKey("dense_coal_buried");
    public static final ResourceKey<BiomeModifier> DENSE_IRON_SMALL = createKey("dense_iron_small");
    public static final ResourceKey<BiomeModifier> DENSE_IRON_LARGE = createKey("dense_iron_large");
    public static final ResourceKey<BiomeModifier> DENSE_COPPER = createKey("dense_copper");
    public static final ResourceKey<BiomeModifier> DENSE_GOLD = createKey("dense_gold");
    public static final ResourceKey<BiomeModifier> DENSE_GOLD_EXTRA = createKey("dense_gold_extra");
    public static final ResourceKey<BiomeModifier> DENSE_REDSTONE_UPPER = createKey("dense_redstone_upper");
    public static final ResourceKey<BiomeModifier> DENSE_REDSTONE_LOWER = createKey("dense_redstone_lower");
    public static final ResourceKey<BiomeModifier> DENSE_EMERALD = createKey("dense_emerald");
    public static final ResourceKey<BiomeModifier> DENSE_LAPIS_UPPER = createKey("dense_lapis_upper");
    public static final ResourceKey<BiomeModifier> DENSE_LAPIS_LOWER = createKey("dense_lapis_lower");
    public static final ResourceKey<BiomeModifier> DENSE_DIAMOND_SMALL = createKey("dense_diamond_small");
    public static final ResourceKey<BiomeModifier> DENSE_DIAMOND_LARGE = createKey("dense_diamond_large");

    public static final ResourceKey<BiomeModifier> DENSE_NETHER_GOLD = createKey("dense_nether_gold");
    public static final ResourceKey<BiomeModifier> DENSE_NETHER_QUARTZ = createKey("dense_nether_quartz");
    public static final ResourceKey<BiomeModifier> ANCIENT_NETHER_UPPER = createKey("ancient_nether_upper");
    public static final ResourceKey<BiomeModifier> ANCIENT_NETHER_LOWER = createKey("ancient_nether_lower");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);

        context.register(DENSE_COAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_COAL)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_COAL_BURIED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_COAL_BURIED)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_IRON_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_IRON_SMALL)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_IRON_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_IRON_LARGE)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_COPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_COPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_GOLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_GOLD)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_GOLD_EXTRA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_BADLANDS), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_GOLD_EXTRA)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_REDSTONE_UPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_REDSTONE_UPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_REDSTONE_LOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_REDSTONE_LOWER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_EMERALD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(DenseOresTags.Biomes.IS_MOUNTAIN), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_EMERALD)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_LAPIS_UPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_LAPIS_UPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_LAPIS_LOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_LAPIS_LOWER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_DIAMOND_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_DIAMOND_SMALL)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_DIAMOND_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_DIAMOND_LARGE)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(DENSE_NETHER_GOLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_NETHER_GOLD)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(DENSE_NETHER_QUARTZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.DENSE_NETHER_QUARTZ)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ANCIENT_NETHER_UPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.ANCIENT_NETHER_UPPER)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ANCIENT_NETHER_LOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(DensePlacedFeatures.ANCIENT_NETHER_LOWER)), GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    public static ResourceKey<BiomeModifier> createKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(DenseOres.MOD_ID, name));
    }
}
