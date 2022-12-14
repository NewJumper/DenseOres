package com.newjumper.denseores.world;

import com.newjumper.denseores.DenseOres;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class DensePlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, DenseOres.MOD_ID);

    public static final RegistryObject<PlacedFeature> DENSE_COAL = PLACED_FEATURES.register("dense_coal", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_COAL.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(256)))));
    public static final RegistryObject<PlacedFeature> DENSE_COAL_BURIED = PLACED_FEATURES.register("dense_coal_buried", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_COAL_BURIED.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(160)))));
    public static final RegistryObject<PlacedFeature> DENSE_IRON_SMALL = PLACED_FEATURES.register("dense_iron_small", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_IRON_SMALL.getHolder().get(), commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(176), VerticalAnchor.absolute(336)))));
    public static final RegistryObject<PlacedFeature> DENSE_IRON_LARGE = PLACED_FEATURES.register("dense_iron_large", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_IRON_LARGE.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-112), VerticalAnchor.aboveBottom(112)))));
    public static final RegistryObject<PlacedFeature> DENSE_COPPER = PLACED_FEATURES.register("dense_copper", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_COPPER.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(16), VerticalAnchor.aboveBottom(144)))));
    public static final RegistryObject<PlacedFeature> DENSE_GOLD = PLACED_FEATURES.register("dense_gold", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_GOLD.getHolder().get(), commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(128)))));
    public static final RegistryObject<PlacedFeature> DENSE_GOLD_BURIED = PLACED_FEATURES.register("dense_gold_buried", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_GOLD_BURIED.getHolder().get(), rareOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-96), VerticalAnchor.aboveBottom(96)))));
    public static final RegistryObject<PlacedFeature> DENSE_REDSTONE_UPPER = PLACED_FEATURES.register("dense_redstone_upper", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_REDSTONE_UPPER.getHolder().get(), rareOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> DENSE_REDSTONE_LOWER = PLACED_FEATURES.register("dense_redstone_lower", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_REDSTONE_LOWER.getHolder().get(), commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32)))));
    public static final RegistryObject<PlacedFeature> DENSE_EMERALD = PLACED_FEATURES.register("dense_emerald", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_EMERALD.getHolder().get(), rareOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.top()))));
    public static final RegistryObject<PlacedFeature> DENSE_LAPIS_UPPER = PLACED_FEATURES.register("dense_lapis_upper", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_LAPIS_UPPER.getHolder().get(), rareOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(128)))));
    public static final RegistryObject<PlacedFeature> DENSE_LAPIS_LOWER = PLACED_FEATURES.register("dense_lapis_lower", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_LAPIS_LOWER.getHolder().get(), commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64)))));
    public static final RegistryObject<PlacedFeature> DENSE_DIAMOND_SMALL = PLACED_FEATURES.register("dense_diamond_small", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_DIAMOND_SMALL.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-90), VerticalAnchor.aboveBottom(90)))));
    public static final RegistryObject<PlacedFeature> DENSE_DIAMOND_LARGE = PLACED_FEATURES.register("dense_diamond_large", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_DIAMOND_LARGE.getHolder().get(), rareOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> DENSE_NETHER_GOLD = PLACED_FEATURES.register("dense_nether_gold", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_NETHER_GOLD.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10)))));
    public static final RegistryObject<PlacedFeature> DENSE_NETHER_QUARTZ = PLACED_FEATURES.register("dense_nether_quartz", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_DENSE_NETHER_QUARTZ.getHolder().get(), commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10)))));
    public static final RegistryObject<PlacedFeature> ANCIENT_NETHER_UPPER = PLACED_FEATURES.register("ancient_nether_upper", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_ANCIENT_NETHER_UPPER.getHolder().get(), commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(8), VerticalAnchor.belowTop(8)))));
    public static final RegistryObject<PlacedFeature> ANCIENT_NETHER_LOWER = PLACED_FEATURES.register("ancient_nether_lower", () -> new PlacedFeature(DenseConfiguredFeatures.ORE_ANCIENT_NETHER_LOWER.getHolder().get(), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(20)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier pModifier, PlacementModifier pHeightRange) {
        return List.of(pModifier, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }
    public static List<PlacementModifier> commonOrePlacement(int pAttempts, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pAttempts), pHeightRange);
    }
    public static List<PlacementModifier> rareOrePlacement(int pChances, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChances), pHeightRange);
    }
}
