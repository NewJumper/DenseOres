package com.newjumper.denseores.datagen.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;

public class DenseOresLootTableProvider extends LootTableProvider {
    public DenseOresLootTableProvider(PackOutput output) {
        super(output, BuiltInLootTables.all(), List.of(new LootTableProvider.SubProviderEntry(DenseOresLootTables::new, LootContextParamSets.BLOCK)));
    }
}
