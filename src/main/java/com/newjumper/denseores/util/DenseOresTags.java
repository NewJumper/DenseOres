package com.newjumper.denseores.util;

import com.newjumper.denseores.DenseOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DenseOresTags {
    public static class Blocks {
        public static final TagKey<Block> DENSE_ORES = tag("dense_ores");
        public static final TagKey<Block> DENSE_DEEPSLATE_ORES = tag("dense_deepslate_ores");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DenseOres.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> DENSE_ORES = tag("dense_ores");
        public static final TagKey<Item> DENSE_DEEPSLATE_ORES = tag("dense_deepslate_ores");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DenseOres.MOD_ID, name));
        }
    }
}
