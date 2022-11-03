package com.Ghost_Hanses.study.init;

import com.Ghost_Hanses.study.Study;
import com.Ghost_Hanses.study.block.shblock;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block BLOCK = new shblock("block", "block", Study.Shblock_TAB);
    public static final Block LY_XC = new shblock("ly&xc", "ly&xc", Study.Shblock_TAB);
}
