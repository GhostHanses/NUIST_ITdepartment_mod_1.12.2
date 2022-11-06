package com.Ghost_Hanses.study.entity;


import com.Ghost_Hanses.study.Study;
import com.Ghost_Hanses.study.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
    private static int ENTITY_NEXT_ID = 1;

    public static void registerEntities() {

        registerEntity("bear", EntityBear.class, ENTITY_NEXT_ID, 30, 2330893, 16144);

        DataFixer datafixer = new DataFixer(1343);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name),
                entity,
                name,
                id,
                Study.instance,
                range,
                1,
                true,
                color1, color2
        );
        ENTITY_NEXT_ID++;
    }
}
