package com.Ghost_Hanses.study.util.handlers;

import com.Ghost_Hanses.study.entity.EntityBear;

//import com.Ghost_Hanses.study.entity.render.RenderBear;

import com.Ghost_Hanses.study.entity.render.RendererBear;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        //模型渲染文件注册
        RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, RendererBear::new);
    }

}
