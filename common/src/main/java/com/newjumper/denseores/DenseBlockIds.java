package com.newjumper.denseores;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class DenseBlockIds {
    public static Map<String, ResourceKey<Block>> BLOCK_IDS = new HashMap<>();

    public static final ResourceKey<Block> DENSE_COAL_ORE = block("dense_coal_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_COAL_ORE = block("dense_deepslate_coal_ore");
    public static final ResourceKey<Block> DENSE_IRON_ORE = block("dense_iron_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_IRON_ORE = block("dense_deepslate_iron_ore");
    public static final ResourceKey<Block> DENSE_COPPER_ORE = block("dense_copper_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_COPPER_ORE = block("dense_deepslate_copper_ore");
    public static final ResourceKey<Block> DENSE_GOLD_ORE = block("dense_gold_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_GOLD_ORE = block("dense_deepslate_gold_ore");
    public static final ResourceKey<Block> DENSE_REDSTONE_ORE = block("dense_redstone_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_REDSTONE_ORE = block("dense_deepslate_redstone_ore");
    public static final ResourceKey<Block> DENSE_EMERALD_ORE = block("dense_emerald_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_EMERALD_ORE = block("dense_deepslate_emerald_ore");
    public static final ResourceKey<Block> DENSE_LAPIS_ORE = block("dense_lapis_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_LAPIS_ORE = block("dense_deepslate_lapis_ore");
    public static final ResourceKey<Block> DENSE_DIAMOND_ORE = block("dense_diamond_ore");
    public static final ResourceKey<Block> DENSE_DEEPSLATE_DIAMOND_ORE = block("dense_deepslate_diamond_ore");
    public static final ResourceKey<Block> DENSE_NETHER_GOLD_ORE = block("dense_nether_gold_ore");
    public static final ResourceKey<Block> DENSE_NETHER_QUARTZ_ORE = block("dense_nether_quartz_ore");
    public static final ResourceKey<Block> ANCIENT_NETHER_ORE = block("ancient_nether_ore");

    private static ResourceKey<Block> block(String name) {
        var id = ResourceKey.create(Registries.BLOCK, DenseOres.id(name));
        BLOCK_IDS.put(name, id);
        return id;
    }
}
