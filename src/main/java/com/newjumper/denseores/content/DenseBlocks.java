package com.newjumper.denseores.content;

import com.newjumper.denseores.DenseOres;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DenseBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DenseOres.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DenseOres.MOD_ID);

    public static final DeferredBlock<Block> DENSE_COAL_ORE = register("dense_coal_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_COAL_ORE = register("dense_deepslate_coal_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final DeferredBlock<Block> DENSE_IRON_ORE = register("dense_iron_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_IRON_ORE = register("dense_deepslate_iron_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredBlock<Block> DENSE_COPPER_ORE = register("dense_copper_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_COPPER_ORE = register("dense_deepslate_copper_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final DeferredBlock<Block> DENSE_GOLD_ORE = register("dense_gold_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_GOLD_ORE = register("dense_deepslate_gold_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final DeferredBlock<Block> DENSE_REDSTONE_ORE = register("dense_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_REDSTONE_ORE = register("dense_deepslate_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(DENSE_REDSTONE_ORE.get())));
    public static final DeferredBlock<Block> DENSE_EMERALD_ORE = register("dense_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 9), BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_EMERALD_ORE = register("dense_deepslate_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 9), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final DeferredBlock<Block> DENSE_LAPIS_ORE = register("dense_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_LAPIS_ORE = register("dense_deepslate_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final DeferredBlock<Block> DENSE_DIAMOND_ORE = register("dense_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 9), BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_DIAMOND_ORE = register("dense_deepslate_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 9), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static final DeferredBlock<Block> DENSE_NETHER_GOLD_ORE = register("dense_nether_gold_ore", () -> new DropExperienceBlock(UniformInt.of(2, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));
    public static final DeferredBlock<Block> DENSE_NETHER_QUARTZ_ORE = register("dense_nether_quartz_ore", () -> new DropExperienceBlock(UniformInt.of(4, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredBlock<Block> ANCIENT_NETHER_ORE = register("ancient_nether_ore", () -> new DropExperienceBlock(UniformInt.of(2, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).strength(12, 100)));

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> properties) {
        DeferredBlock<T> block = BLOCKS.register(name, properties);
        ITEMS.registerSimpleBlockItem(name, block);
        return block;
    }
}
