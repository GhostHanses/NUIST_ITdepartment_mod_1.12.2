package com.Ghost_Hanses.study.item.base;


import com.Ghost_Hanses.study.Study;
import com.Ghost_Hanses.study.init.ModItems;
import com.Ghost_Hanses.study.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasicBase extends Item implements IHasModel {
    /**
     *
     * @param UnlocalizedName 未初始化名
     * @param RegistryName 注册名
     * @param tab 创造模式物品栏
     */
    public ItemBasicBase(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Study.proxy.registerItemRender(this, 0, "inventory");
    }
}

