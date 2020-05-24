package powercrystals.netherores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.teamsevered.netherores.NetherOresReborn;
import com.teamsevered.netherores.util.IHasModel;

public class BlockBase extends Block implements IHasModel
{

    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabUtil.NETHER_ORE_TAB);
        setHarvestLevel("pickaxe", 4);

        Items.ITEMS.add(this);
        Blocks.BLOCKS.add(this);
    }

    @Override
    public void registerModels()
    {
        NetherOresReborn.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
