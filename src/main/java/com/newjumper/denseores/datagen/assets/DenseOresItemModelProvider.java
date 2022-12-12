package com.newjumper.denseores.datagen.assets;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class DenseOresItemModelProvider extends ItemModelProvider {
    public DenseOresItemModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DenseOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerModels() {
        blockModel(DenseBlocks.DENSE_COAL_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE);
        blockModel(DenseBlocks.DENSE_IRON_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE);
        blockModel(DenseBlocks.DENSE_COPPER_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE);
        blockModel(DenseBlocks.DENSE_GOLD_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE);
        blockModel(DenseBlocks.DENSE_REDSTONE_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE);
        blockModel(DenseBlocks.DENSE_EMERALD_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE);
        blockModel(DenseBlocks.DENSE_LAPIS_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE);
        blockModel(DenseBlocks.DENSE_DIAMOND_ORE);
        blockModel(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE);

        blockModel(DenseBlocks.DENSE_NETHER_GOLD_ORE);
        blockModel(DenseBlocks.DENSE_NETHER_QUARTZ_ORE);
    }

    public void blockModel(RegistryObject<Block> block) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }
}
