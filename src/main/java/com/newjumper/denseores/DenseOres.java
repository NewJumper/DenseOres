package com.newjumper.denseores;

import com.newjumper.denseores.blocks.DenseBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DenseOres.MOD_ID)
public class DenseOres {
    public static final String MOD_ID = "denseores";

    public DenseOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DenseBlocks.BLOCKS.register(eventBus);
        DenseBlocks.ITEMS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
