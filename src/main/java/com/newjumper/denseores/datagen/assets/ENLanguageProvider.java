package com.newjumper.denseores.datagen.assets;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.blocks.DenseBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ENLanguageProvider extends LanguageProvider {
    public ENLanguageProvider(DataGenerator gen) {
        super(gen, DenseOres.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        DenseBlocks.BLOCKS.getEntries().forEach(this::addBlock);

        add("itemGroup." + DenseOres.MOD_ID, "Dense Ores");
    }

    private void addBlock(RegistryObject<Block> block) {
        String key = block.getId().getPath();
        add("block." + DenseOres.MOD_ID + "." + key, convertToName(key));
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
