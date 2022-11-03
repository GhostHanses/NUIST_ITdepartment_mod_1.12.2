package com.Ghost_Hanses.study.tab;

import com.Ghost_Hanses.study.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/23 9:08</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.tab/ECTab.java</p>
 * <h1><center>ECTab</center></h1>
 */
public class StudyTab extends CreativeTabs {
    public StudyTab() {
        super("study_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.SULFUR);
    }
}
