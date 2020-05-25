package com.teamsevered.netheroresreborn.blocks;

import com.teamsevered.netheroresreborn.NetherOresReborn;
import com.teamsevered.netheroresreborn.items.Items;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class NetherCoalOre extends BlockBase
{
    public NetherCoalOre(String name, Material material)
    {
        super(name, material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NetherOresReborn.NETHER_ORES_TAB);
        setHarvestLevel("pickaxe", 4);

        Items.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        Blocks.BLOCKS.add(this);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return net.minecraft.init.Items.COAL;
    }

    @Override
    public int quantityDropped(Random rand)
    {
        int max = 7;
        int min = 1;

        return rand.nextInt(max) + min;
    }
}