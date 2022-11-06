package com.Ghost_Hanses.study;

import com.Ghost_Hanses.study.proxy.CommonProxy;
import com.Ghost_Hanses.study.tab.ShblockTab;
import com.Ghost_Hanses.study.tab.StudyTab;
import com.Ghost_Hanses.study.util.Reference;
import com.Ghost_Hanses.study.util.handlers.RegistryHandler;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.registry.EntityRegistry;
import software.bernie.geckolib3.GeckoLib;


/**
 * @author RYCBStudio
 */


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class Study {

    //public final CreativeTabs study;

    @Mod.Instance(Reference.MOD_ID)
    public static Study instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        RegistryHandler.preInitRegistries( );
        GeckoLib.initialize();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.Init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
    public static CommonProxy proxy;

    public static CreativeTabs Study_TAB = new StudyTab();
    public static CreativeTabs Shblock_TAB = new ShblockTab();

}


