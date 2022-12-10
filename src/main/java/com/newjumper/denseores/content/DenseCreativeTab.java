package com.newjumper.denseores.content;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DenseCreativeTab {
    public static final CreativeModeTab DENSEORES = new CreativeModeTab("denseores") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DenseBlocks.DENSE_DIAMOND_ORE.get());
        }
    };
}
