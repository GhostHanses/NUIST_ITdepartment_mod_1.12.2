package com.Ghost_Hanses.study.init;


import com.Ghost_Hanses.study.Study;
import com.Ghost_Hanses.study.item.base.ItemBasicBase;
import com.Ghost_Hanses.study.item.base.Weapon;
import com.Ghost_Hanses.study.tab.StudyTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ColorHandlerEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/5 16:21</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.init/ModItems.java</p>
 * <h1><center>ModItems</center></h1>
 */
public class ModItems{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    /**
     * Ores
     */
    //硫
    public static final Item SULFUR = new ItemBasicBase("sulfur", "sulfur", Study.Study_TAB);
    public static final Item OPPO = new Weapon("oppo_reno6", "oppo_reno6", Study.Study_TAB);


}
