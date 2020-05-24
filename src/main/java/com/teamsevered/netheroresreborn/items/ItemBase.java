package com.teamsevered.netheroresreborn.items;

import com.teamsevered.netheroresreborn.NetherOresReborn;
import com.teamsevered.netheroresreborn.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NetherOresReborn.NETHER_ORES_TAB);

        Items.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        NetherOresReborn.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
