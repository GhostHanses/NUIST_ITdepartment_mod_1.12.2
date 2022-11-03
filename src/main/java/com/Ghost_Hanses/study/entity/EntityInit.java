package com.Ghost_Hanses.study.entity;


import com.Ghost_Hanses.study.Study;
import com.Ghost_Hanses.study.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    //对生物信息进行注册
    public static void registerEntities(){
        //生物名称，所编写的生物类，在Reference中的名称，追踪范围，生物蛋颜色1，颜色2
        registerEntity("bear", EntityBear.class, Reference.ent_1, 20, 14833957, 0);
        //registerEntity("dimi", EntityDimi.class, Reference.Dimi, 20, 14833957, 0);
        //...
    }


    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range,int color1,int color2) {

        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Study.instance, range, 1, true, color1, color2);

    }


}
