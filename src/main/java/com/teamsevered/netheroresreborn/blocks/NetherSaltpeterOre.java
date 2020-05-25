package com.teamsevered.netheroresreborn.blocks;

import com.teamsevered.netheroresreborn.items.Items;


import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class NetherSaltpeterOre extends BlockBase
{
    public NetherSaltpeterOre(String name, Material material)
    {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setHarvestLevel("pickaxe", 3);
        setResistance(15.0F);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return Items.SALTPETER;
    }

    @Override
    public int quantityDropped(Random rand)
    {
        int max = 7;
        int min = 1;

        return rand.nextInt(max) + min;
    }
}
