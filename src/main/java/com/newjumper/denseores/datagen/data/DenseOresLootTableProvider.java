package com.newjumper.denseores.datagen.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class DenseOresLootTableProvider extends LootTableProvider {
    private final List<SubProviderEntry> lootTables = List.of(new LootTableProvider.SubProviderEntry(DenseOresLootTables::new, LootContextParamSets.BLOCK));

    public DenseOresLootTableProvider(PackOutput output) {
        super(output, BuiltInLootTables.all(), List.of(new LootTableProvider.SubProviderEntry(DenseOresLootTables::new, LootContextParamSets.BLOCK)));
    }

    @Override
    public @NotNull List<SubProviderEntry> getTables() {
        return lootTables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationcontext) {
        map.forEach((id, table) -> LootTables.validate(validationcontext, id, table));
    }
}
