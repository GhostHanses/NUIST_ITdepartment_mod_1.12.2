package com.Ghost_Hanses.study.entity.render;

import com.Ghost_Hanses.study.entity.EntityBear;
import com.Ghost_Hanses.study.entity.model.ModelBear;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.example.client.model.entity.ExampleEntityModel;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RendererBear extends GeoEntityRenderer<EntityBear> {
    //将我们上一步中的模型传入其中
    public RendererBear(RenderManager renderManager) {
        super(renderManager, new ModelBear());
    }

}
