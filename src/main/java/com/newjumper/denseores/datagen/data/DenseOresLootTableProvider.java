package com.newjumper.denseores.datagen.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.*;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class DenseOresLootTableProvider extends LootTableProvider {
    public DenseOresLootTableProvider(PackOutput pOutput) {
        super(pOutput, BuiltInLootTables.all(), List.of(new LootTableProvider.SubProviderEntry(DenseOresBlockLoot::new, LootContextParamSets.BLOCK)));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @NotNull ValidationContext context) {
        map.forEach((id, table) -> table.validate(context.setParams(table.getParamSet()).enterElement("{" + id + "}", new LootDataId<>(LootDataType.TABLE, id))));
    }
}
