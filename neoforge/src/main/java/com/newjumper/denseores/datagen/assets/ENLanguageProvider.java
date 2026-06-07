package com.newjumper.denseores.datagen.assets;

import com.newjumper.denseores.DenseBlocks;
import com.newjumper.denseores.DenseOres;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ENLanguageProvider extends LanguageProvider {
    public ENLanguageProvider(PackOutput output) {
        super(output, DenseOres.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        DenseBlocks.ITEMS.forEach(this::addItem);
        add("itemGroup." + DenseOres.MOD_ID, "Dense Ores");

        add("tag.item." + DenseOres.MOD_ID + ".dense_stone_ores", "Dense Stone Ores");
        add("tag.item." + DenseOres.MOD_ID + ".dense_deepslate_ores", "Dense Deepslate Ores");
        add("tag.item." + DenseOres.MOD_ID + ".dense_netherrack_ores", "Dense Netherrack Ores");
    }

    private void addItem(String key, Item block) {
        add("item." + DenseOres.MOD_ID + "." + key, convertToName(key));
    }

    private String convertToName(String key) {
        StringBuilder builder = new StringBuilder(key.substring(0, 1).toUpperCase() + key.substring(1));
        for(int i = 1; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        String name = builder.toString();
        if(name.contains("Lapis")) name = name.substring(0, name.indexOf("Ore")) + "Lazuli Ore";

        return name;
    }
}
