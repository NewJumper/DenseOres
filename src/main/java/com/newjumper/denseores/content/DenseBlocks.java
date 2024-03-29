package com.newjumper.denseores.content;

import com.newjumper.denseores.DenseOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DenseBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, DenseOres.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, DenseOres.MOD_ID);

    public static final RegistryObject<Block> DENSE_COAL_ORE = register("dense_coal_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_COAL_ORE = register("dense_deepslate_coal_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> DENSE_IRON_ORE = register("dense_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_IRON_ORE = register("dense_deepslate_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> DENSE_COPPER_ORE = register("dense_copper_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_COPPER_ORE = register("dense_deepslate_copper_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final RegistryObject<Block> DENSE_GOLD_ORE = register("dense_gold_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_GOLD_ORE = register("dense_deepslate_gold_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final RegistryObject<Block> DENSE_REDSTONE_ORE = register("dense_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_REDSTONE_ORE = register("dense_deepslate_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(DENSE_REDSTONE_ORE.get())));
    public static final RegistryObject<Block> DENSE_EMERALD_ORE = register("dense_emerald_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_EMERALD_ORE = register("dense_deepslate_emerald_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> DENSE_LAPIS_ORE = register("dense_lapis_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE), UniformInt.of(4, 7)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_LAPIS_ORE = register("dense_deepslate_lapis_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE), UniformInt.of(4, 7)));
    public static final RegistryObject<Block> DENSE_DIAMOND_ORE = register("dense_diamond_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> DENSE_DEEPSLATE_DIAMOND_ORE = register("dense_deepslate_diamond_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE), UniformInt.of(5, 9)));

    public static final RegistryObject<Block> DENSE_NETHER_GOLD_ORE = register("dense_nether_gold_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE), UniformInt.of(2, 3)));
    public static final RegistryObject<Block> DENSE_NETHER_QUARTZ_ORE = register("dense_nether_quartz_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE), UniformInt.of(4, 7)));
    public static final RegistryObject<Block> ANCIENT_NETHER_ORE = register("ancient_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(12, 100), UniformInt.of(2, 3)));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> pBlock) {
        RegistryObject<T> block = BLOCKS.register(name, pBlock);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
