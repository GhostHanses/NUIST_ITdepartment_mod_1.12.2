package com.Ghost_Hanses.study.entity.model;// Made with Blockbench 4.4.3

import net.minecraft.util.ResourceLocation;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelBear extends AnimatedGeoModel<GeoExampleEntity>
{
	@Override
	public ResourceLocation getModelLocation(GeoExampleEntity object)
	{
		return new ResourceLocation(GeckoLib.ModID, "geo/jack.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GeoExampleEntity object)
	{
		return new ResourceLocation(GeckoLib.ModID, "textures/item/jack.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(GeoExampleEntity object)
	{
		return new ResourceLocation(GeckoLib.ModID, "animations/jackinthebox.animation.json");
	}
}