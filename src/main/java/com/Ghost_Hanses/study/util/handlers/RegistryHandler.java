package com.Ghost_Hanses.study.util.handlers;

import com.Ghost_Hanses.study.entity.EntityBear;
//import com.Ghost_Hanses.study.entity.EntityInit;
//import com.Ghost_Hanses.study.entity.render.RenderBear;
import com.Ghost_Hanses.study.entity.EntityInit;
import com.Ghost_Hanses.study.entity.model.ModelBear;
import com.Ghost_Hanses.study.entity.render.RendererBear;
import com.Ghost_Hanses.study.init.ModBlocks;
import com.Ghost_Hanses.study.init.ModItems;
import com.Ghost_Hanses.study.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.util.List;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        modelRegistryHelper(ModItems.ITEMS);
        modelRegistryHelper(ModBlocks.BLOCKS);
    }
    @SubscribeEvent
    public static void registerRenderers(ModelRegistryEvent event) {
        RenderHandler.registerEntityRenders();
    }

    public static void preInitRegistries(){
        EntityInit.registerEntities();
    }

    public static void postInitRegistries() {

    }

    public static <T> void modelRegistryHelper(List<T> list) {
        for(T element : list){
            if(element instanceof IHasModel){
                ((IHasModel)element).registerModels();
            }
        }
    }

}
