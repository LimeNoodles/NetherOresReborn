package powercrystals.netherores.items;

import net.minecraft.item.Item;
import powercrystals.netherores.NetherOresReborn;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabUtil.NETHER_ORES_TAB);

        Items.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        NetherOresReborn.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
