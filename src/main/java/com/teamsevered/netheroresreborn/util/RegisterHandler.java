package com.teamsevered.netheroresreborn.util;

import com.teamsevered.netheroresreborn.blocks.Blocks;
import com.teamsevered.netheroresreborn.items.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegisterHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(Items.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(Blocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Block block : Blocks.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel) block).registerModels();
            }
        }

        for(Item item : Items.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel) item).registerModels();
            }
        }
    }

    public static void registerSmelting()
    {
        GameRegistry.addSmelting(Blocks.NETHER_GOLD_ORE, new ItemStack(net.minecraft.init.Items.GOLD_INGOT,1), 1.5F);
        GameRegistry.addSmelting(Blocks.NETHER_IRON_ORE, new ItemStack(net.minecraft.init.Items.IRON_INGOT,1), 1.5F);
    }
}
