package com.newjumper.denseores;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class DenseBlocks {
    public static Map<String, Block> BLOCKS = new HashMap<>();
    public static Map<String, Item> ITEMS = new HashMap<>();

    public static Block DENSE_COAL_ORE = oreBlock("dense_coal_ore", UniformInt.of(2, 4), Blocks.COAL_ORE);
    public static Block DENSE_DEEPSLATE_COAL_ORE = oreBlock("dense_deepslate_coal_ore", UniformInt.of(2, 4), Blocks.DEEPSLATE_COAL_ORE);
    public static Block DENSE_IRON_ORE = oreBlock("dense_iron_ore", ConstantInt.of(0), Blocks.IRON_ORE);
    public static Block DENSE_DEEPSLATE_IRON_ORE = oreBlock("dense_deepslate_iron_ore", ConstantInt.of(0), Blocks.DEEPSLATE_IRON_ORE);
    public static Block DENSE_COPPER_ORE = oreBlock("dense_copper_ore", ConstantInt.of(0), Blocks.COPPER_ORE);
    public static Block DENSE_DEEPSLATE_COPPER_ORE = oreBlock("dense_deepslate_copper_ore", ConstantInt.of(0), Blocks.DEEPSLATE_COPPER_ORE);
    public static Block DENSE_GOLD_ORE = oreBlock("dense_gold_ore", ConstantInt.of(0), Blocks.GOLD_ORE);
    public static Block DENSE_DEEPSLATE_GOLD_ORE = oreBlock("dense_deepslate_gold_ore", ConstantInt.of(0), Blocks.DEEPSLATE_GOLD_ORE);
    public static Block DENSE_REDSTONE_ORE = register("dense_redstone_ore", RedStoneOreBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE));
    public static Block DENSE_DEEPSLATE_REDSTONE_ORE = register("dense_deepslate_redstone_ore", RedStoneOreBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static Block DENSE_EMERALD_ORE = oreBlock("dense_emerald_ore", UniformInt.of(5, 9), Blocks.EMERALD_ORE);
    public static Block DENSE_DEEPSLATE_EMERALD_ORE = oreBlock("dense_deepslate_emerald_ore", UniformInt.of(5, 9), Blocks.DEEPSLATE_EMERALD_ORE);
    public static Block DENSE_LAPIS_ORE = oreBlock("dense_lapis_ore", UniformInt.of(4, 7), Blocks.LAPIS_ORE);
    public static Block DENSE_DEEPSLATE_LAPIS_ORE = oreBlock("dense_deepslate_lapis_ore", UniformInt.of(4, 7), Blocks.DEEPSLATE_LAPIS_ORE);
    public static Block DENSE_DIAMOND_ORE = oreBlock("dense_diamond_ore", UniformInt.of(5, 9), Blocks.DIAMOND_ORE);
    public static Block DENSE_DEEPSLATE_DIAMOND_ORE = oreBlock("dense_deepslate_diamond_ore", UniformInt.of(5, 9), Blocks.DEEPSLATE_DIAMOND_ORE);

    public static Block DENSE_NETHER_GOLD_ORE = oreBlock("dense_nether_gold_ore", UniformInt.of(2, 3), Blocks.NETHER_GOLD_ORE);
    public static Block DENSE_NETHER_QUARTZ_ORE = oreBlock("dense_nether_quartz_ore", UniformInt.of(4, 7), Blocks.NETHER_QUARTZ_ORE);
    public static Block ANCIENT_NETHER_ORE = register("ancient_nether_ore", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS).strength(30f, 500f));

    private static Block oreBlock(String name, IntProvider xpRange, Block copy) {
        DropExperienceBlock block = new DropExperienceBlock(xpRange, BlockBehaviour.Properties.ofFullCopy(copy).setId(ResourceKey.create(Registries.BLOCK, DenseOres.id(name))));
        BLOCKS.put(name, block);
        ITEMS.put(name, new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, DenseOres.id(name)))));
        return block;
    }

    private static Block register(String name, Function<BlockBehaviour.Properties, ? extends Block> func, BlockBehaviour.Properties properties) {
        Block block = func.apply(properties.setId(DenseBlockIds.BLOCK_IDS.get(name)));
        BLOCKS.put(name, block);
        ITEMS.put(name, new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, DenseOres.id(name)))));
        return block;
    }

    public static void registerBlocks(BiConsumer<Identifier, Block> registry) {
        BLOCKS.forEach((s, block) -> registry.accept(DenseOres.id(s), block));
    }

    public static void registerItems(BiConsumer<Identifier, Item> registry) {
        ITEMS.forEach((s, item) -> registry.accept(DenseOres.id(s), item));
    }
}
