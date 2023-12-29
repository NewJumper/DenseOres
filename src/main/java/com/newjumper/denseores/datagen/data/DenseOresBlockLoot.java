package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.content.DenseBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DenseOresBlockLoot extends BlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(Blocks.DRAGON_EGG, Blocks.BEACON, Blocks.CONDUIT, Blocks.SKELETON_SKULL, Blocks.WITHER_SKELETON_SKULL, Blocks.PLAYER_HEAD, Blocks.ZOMBIE_HEAD, Blocks.CREEPER_HEAD, Blocks.DRAGON_HEAD, Blocks.PIGLIN_HEAD, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX).map(ItemLike::asItem).collect(Collectors.toSet());

    public DenseOresBlockLoot() {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(DenseBlocks.DENSE_COAL_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_COAL_ORE.get(), Items.COAL, 2, 4));
        this.add(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get(), Items.COAL, 2, 4));
        this.add(DenseBlocks.DENSE_IRON_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_IRON_ORE.get(), Items.RAW_IRON, 2, 4));
        this.add(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get(), Items.RAW_IRON, 2, 4));
        this.add(DenseBlocks.DENSE_COPPER_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_COPPER_ORE.get(), Items.RAW_COPPER, 4, 12));
        this.add(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get(), Items.RAW_COPPER, 4, 12));
        this.add(DenseBlocks.DENSE_GOLD_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_GOLD_ORE.get(), Items.RAW_GOLD, 2, 4));
        this.add(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), Items.RAW_GOLD, 2, 4));
        this.add(DenseBlocks.DENSE_REDSTONE_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_REDSTONE_ORE.get(), Items.REDSTONE, 6, 12));
        this.add(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get(), Items.REDSTONE, 6, 12));
        this.add(DenseBlocks.DENSE_EMERALD_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_EMERALD_ORE.get(), Items.EMERALD, 2, 3));
        this.add(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get(), Items.EMERALD, 2, 3));
        this.add(DenseBlocks.DENSE_LAPIS_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 6, 18));
        this.add(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 6, 18));
        this.add(DenseBlocks.DENSE_DIAMOND_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 3));
        this.add(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 3));

        this.add(DenseBlocks.DENSE_NETHER_GOLD_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_NETHER_GOLD_ORE.get(), Items.GOLD_NUGGET, 4, 12));
        this.add(DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get(), createDenseOreDrop(DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get(), Items.QUARTZ, 2, 4));
        this.add(DenseBlocks.ANCIENT_NETHER_ORE.get(), createDenseOreDrop(DenseBlocks.ANCIENT_NETHER_ORE.get(), Items.NETHERITE_SCRAP, 1, 2));
    }

    private LootTable.Builder createDenseOreDrop(Block pBlock, Item pItem, int pMin, int pMax) {
        return createSilkTouchDispatchTable(pBlock, applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem).apply(SetItemCountFunction.setCount(UniformGenerator.between(pMin, pMax))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @NotNull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DenseBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
