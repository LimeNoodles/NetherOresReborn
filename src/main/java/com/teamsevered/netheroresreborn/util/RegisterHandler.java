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
        GameRegistry.addSmelting(Blocks.NETHER_ADAMANTIUM_ORE, new ItemStack(Items.ADAMANTIUM_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_ALUMINIUM_ORE, new ItemStack(Items.ALUMINIUM_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_COPPER_ORE, new ItemStack(Items.COPPER_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_GOLD_ORE, new ItemStack(net.minecraft.init.Items.GOLD_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_IRIDIUM_ORE, new ItemStack(Items.IRIDIUM_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_IRON_ORE, new ItemStack(net.minecraft.init.Items.IRON_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_LEAD_ORE, new ItemStack(Items.LEAD_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_MAGNESIUM_ORE, new ItemStack(Items.MAGNESIUM_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_MYTHRIL_ORE, new ItemStack(Items.MYTHRIL_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_NICKEL_ORE, new ItemStack(Items.NICKEL_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_NIKOLITE_ORE, new ItemStack(Items.NIKOLITE_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_OSMIUM_ORE, new ItemStack(Items.OSMIUM_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_PLATINUM_ORE, new ItemStack(Items.PLATINUM_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_RUTILE_ORE, new ItemStack(Items.RUTILE_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_SILVER_ORE, new ItemStack(Items.SILVER_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_STEEL_ORE, new ItemStack(Items.STEEL_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_TENNANTITE_ORE, new ItemStack(Items.TENNANTITE_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_TIN_ORE, new ItemStack(Items.TIN_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_TITANIUM_ORE, new ItemStack(Items.TITANIUM_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_TUNGSTEN_ORE, new ItemStack(Items.TUNGSTEN_INGOT,2), 3.0F);
        GameRegistry.addSmelting(Blocks.NETHER_URANIUM_ORE, new ItemStack(Items.URANIUM_INGOT,2), 3.0F);

    }
}
