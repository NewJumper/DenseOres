package com.newjumper.denseores;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class DenseOresTags {
    public static class Blocks {
        public static final TagKey<Block> DENSE_STONE_ORES = tag("dense_stone_ores");
        public static final TagKey<Block> DENSE_DEEPSLATE_ORES = tag("dense_deepslate_ores");
        public static final TagKey<Block> DENSE_NETHERRACK_ORES = tag("dense_netherrack_ores");

        private static TagKey<Block> tag(String name) {
            return TagKey.create(Registries.BLOCK, DenseOres.id(name));
        }
    }

    public static class Items {
        public static final TagKey<Item> DENSE_STONE_ORES = tag("dense_stone_ores");
        public static final TagKey<Item> DENSE_DEEPSLATE_ORES = tag("dense_deepslate_ores");
        public static final TagKey<Item> DENSE_NETHERRACK_ORES = tag("dense_netherrack_ores");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, DenseOres.id(name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> GENERATES_EMERALDS = TagKey.create(Registries.BIOME, DenseOres.id("generates_emeralds"));
    }
}
