package com.teamsevered.netheroresreborn.blocks;

import com.teamsevered.netheroresreborn.NetherOresReborn;
import com.teamsevered.netheroresreborn.items.Items;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public class NetherEmeraldOre extends BlockBase
{
    public NetherEmeraldOre(String name, Material material)
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
        return net.minecraft.init.Items.EMERALD;
    }

    @Override
    public int quantityDropped(Random rand)
    {
        int max = 7;
        int min = 1;

        return rand.nextInt(max) + min;
    }
}