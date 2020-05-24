package com.teamsevered.netheroresreborn.util;

import com.teamsevered.netheroresreborn.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabUtil extends CreativeTabs
{

    public TabUtil(String label)
    {
        super("noreborn");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(Item.getItemFromBlock(Blocks.NETHER_ADAMANTIUM_ORE));
    }
}
