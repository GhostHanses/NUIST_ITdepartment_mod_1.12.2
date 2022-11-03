package com.Ghost_Hanses.study.item.base;

import com.Ghost_Hanses.study.Study;
import com.Ghost_Hanses.study.init.ModItems;
import com.Ghost_Hanses.study.util.IHasModel;
import javafx.scene.paint.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Weapon extends ItemSword implements IHasModel {

    public Weapon(String UnlocalizedName, String RegistryName, CreativeTabs tab){
        super(EnumHelper.addToolMaterial("newtool", 0, 0, 0F, 20.0F, 100));
        setUnlocalizedName(UnlocalizedName);
        setRegistryName(RegistryName);
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Study.proxy.registerItemRender(this, 0, "inventory");
    }
}
