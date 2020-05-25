package com.teamsevered.netheroresreborn.blocks;

import com.teamsevered.netheroresreborn.NetherOresReborn;
import com.teamsevered.netheroresreborn.items.Items;
import com.teamsevered.netheroresreborn.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{

    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NetherOresReborn.NETHER_ORES_TAB);

        Blocks.BLOCKS.add(this);
        Items.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        NetherOresReborn.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
