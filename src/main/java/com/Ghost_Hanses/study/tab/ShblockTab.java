package com.Ghost_Hanses.study.tab;

import com.Ghost_Hanses.study.init.ModBlocks;
import com.Ghost_Hanses.study.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ShblockTab extends CreativeTabs {
    public ShblockTab() {
        super("shblock_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.BLOCK);
    }
}
