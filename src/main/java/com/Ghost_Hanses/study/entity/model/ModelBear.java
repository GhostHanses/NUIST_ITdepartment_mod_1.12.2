package com.Ghost_Hanses.study.entity.model;// Made with Blockbench 4.4.3

import com.Ghost_Hanses.study.entity.EntityBear;
import com.Ghost_Hanses.study.util.Reference;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class ModelBear extends AnimatedGeoModel<EntityBear> {
	//指定geo模型文件地址
	@Override
	public ResourceLocation getModelLocation(EntityBear object) {
		return new ResourceLocation(Reference.MOD_ID, "geo/bear.geo.json");
	}
	//指定贴图文件地址
	@Override
	public ResourceLocation getTextureLocation(EntityBear object) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entity/bear.png");
	}
	//指定动画文件地址
	@Override
	public ResourceLocation getAnimationFileLocation(EntityBear object) {
		return new ResourceLocation(Reference.MOD_ID, "animations/bear.walk.json");
	}

}
