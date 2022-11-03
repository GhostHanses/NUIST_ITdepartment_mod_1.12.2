package com.Ghost_Hanses.study.block;


import com.Ghost_Hanses.study.Study;
import com.Ghost_Hanses.study.init.ModBlocks;
import com.Ghost_Hanses.study.init.ModItems;
import com.Ghost_Hanses.study.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class shblock extends Block implements IHasModel {
    public shblock(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        super(Material.ROCK);
        setUnlocalizedName(UnlocalizedName);
        setRegistryName(RegistryName);
        setCreativeTab(tab);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
        setHardness(0);
    }

    @Override
    public void registerModels() {
        Study.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
    }
}
