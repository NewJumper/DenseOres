package com.newjumper.denseores.world;

import com.newjumper.denseores.DenseOres;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class DensePlacedFeatures {
    public static final ResourceKey<PlacedFeature> DENSE_COAL = createKey("dense_coal");
    public static final ResourceKey<PlacedFeature> DENSE_COAL_BURIED = createKey("dense_coal_buried");
    public static final ResourceKey<PlacedFeature> DENSE_IRON_SMALL = createKey("dense_iron_small");
    public static final ResourceKey<PlacedFeature> DENSE_IRON_LARGE = createKey("dense_iron_large");
    public static final ResourceKey<PlacedFeature> DENSE_COPPER = createKey("dense_copper");
    public static final ResourceKey<PlacedFeature> DENSE_GOLD = createKey("dense_gold");
    public static final ResourceKey<PlacedFeature> DENSE_GOLD_BURIED = createKey("dense_gold_buried");
    public static final ResourceKey<PlacedFeature> DENSE_REDSTONE_UPPER = createKey("dense_redstone_upper");
    public static final ResourceKey<PlacedFeature> DENSE_REDSTONE_LOWER = createKey("dense_redstone_lower");
    public static final ResourceKey<PlacedFeature> DENSE_EMERALD = createKey("dense_emerald");
    public static final ResourceKey<PlacedFeature> DENSE_LAPIS_UPPER = createKey("dense_lapis_upper");
    public static final ResourceKey<PlacedFeature> DENSE_LAPIS_LOWER = createKey("dense_lapis_lower");
    public static final ResourceKey<PlacedFeature> DENSE_DIAMOND_SMALL = createKey("dense_diamond_small");
    public static final ResourceKey<PlacedFeature> DENSE_DIAMOND_LARGE = createKey("dense_diamond_large");

    public static final ResourceKey<PlacedFeature> DENSE_NETHER_GOLD = createKey("dense_nether_gold");
    public static final ResourceKey<PlacedFeature> DENSE_NETHER_QUARTZ = createKey("dense_nether_quartz");
    public static final ResourceKey<PlacedFeature> ANCIENT_NETHER_UPPER = createKey("ancient_nether_upper");
    public static final ResourceKey<PlacedFeature> ANCIENT_NETHER_LOWER = createKey("ancient_nether_lower");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> feature = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, DENSE_COAL, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_COAL), commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(64), VerticalAnchor.top())));
        PlacementUtils.register(context, DENSE_COAL_BURIED, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_COAL_BURIED), commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(160))));
        PlacementUtils.register(context, DENSE_IRON_SMALL, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_IRON_SMALL), commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
        PlacementUtils.register(context, DENSE_IRON_LARGE, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_IRON_LARGE), commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-112), VerticalAnchor.aboveBottom(112))));
        PlacementUtils.register(context, DENSE_COPPER, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_COPPER), commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(32), VerticalAnchor.aboveBottom(186))));
        PlacementUtils.register(context, DENSE_GOLD, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_GOLD), commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(56), VerticalAnchor.aboveBottom(256))));
        PlacementUtils.register(context, DENSE_GOLD_BURIED, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_GOLD_BURIED), rareOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
        PlacementUtils.register(context, DENSE_REDSTONE_UPPER, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_REDSTONE_UPPER), rareOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(80))));
        PlacementUtils.register(context, DENSE_REDSTONE_LOWER, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_REDSTONE_LOWER), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32))));
        PlacementUtils.register(context, DENSE_EMERALD, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_EMERALD), commonOrePlacement(26, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.top())));
        PlacementUtils.register(context, DENSE_LAPIS_UPPER, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_LAPIS_UPPER), rareOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(128))));
        PlacementUtils.register(context, DENSE_LAPIS_LOWER, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_LAPIS_LOWER), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64))));
        PlacementUtils.register(context, DENSE_DIAMOND_SMALL, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_DIAMOND_SMALL), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-90), VerticalAnchor.aboveBottom(90))));
        PlacementUtils.register(context, DENSE_DIAMOND_LARGE, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_DIAMOND_LARGE), rareOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        PlacementUtils.register(context, DENSE_NETHER_GOLD, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_NETHER_GOLD), commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
        PlacementUtils.register(context, DENSE_NETHER_QUARTZ, feature.getOrThrow(DenseConfiguredFeatures.ORE_DENSE_NETHER_QUARTZ), commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
        PlacementUtils.register(context, ANCIENT_NETHER_UPPER, feature.getOrThrow(DenseConfiguredFeatures.ORE_ANCIENT_NETHER_UPPER), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(8), VerticalAnchor.belowTop(8))));
        PlacementUtils.register(context, ANCIENT_NETHER_LOWER, feature.getOrThrow(DenseConfiguredFeatures.ORE_ANCIENT_NETHER_LOWER), commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(24))));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier pModifier, PlacementModifier pHeightRange) {
        return List.of(pModifier, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pAttempts, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pAttempts), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChances, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChances), pHeightRange);
    }

    private static ResourceKey<PlacedFeature> createKey(String key) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(DenseOres.MOD_ID, key));
    }
}
