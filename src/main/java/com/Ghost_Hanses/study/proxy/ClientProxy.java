package com.Ghost_Hanses.study.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * @author RYCBStudio
 * Create Time: 2022/1/28
 * Location:Easy-Tech/com.rycb.etech.proxy/ClientProxy.java
 * Use the IntelliJ IDEA
 */
public class ClientProxy extends CommonProxy{
    /*
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Override
    public void Init(FMLInitializationEvent event)
    {
        super.Init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
    */
    @Override
    public void registerItemRender(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}

