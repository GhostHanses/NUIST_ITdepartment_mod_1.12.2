package com.Ghost_Hanses.study.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author RYCBStudio
 * Create Time: 2022/1/28
 * Location:Easy-Tech/com.rycb.etech.proxy/CommonProxy.java
 * Use the IntelliJ IDEA
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {

        //TODO
    }

    public void Init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {
        //TODO
    }

    public void registerItemRender(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}

