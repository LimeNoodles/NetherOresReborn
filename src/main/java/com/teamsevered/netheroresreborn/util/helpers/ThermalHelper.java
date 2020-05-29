package com.teamsevered.netheroresreborn.util.helpers;

import com.teamsevered.netheroresreborn.blocks.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import net.minecraftforge.fml.common.event.FMLInterModComms;

import javax.annotation.Nullable;


public class ThermalHelper
{
    public static void addPulverizerRecipe(int energyRequired, ItemStack input, ItemStack primaryOutput, ItemStack secondaryOutput, int secondaryChance)
    {
        if(input == null || primaryOutput == null)
        {
            return;
        }

        NBTTagCompound toSend = new NBTTagCompound();
        toSend.setInteger("energy", energyRequired);
        toSend.setTag("input", new NBTTagCompound());
        toSend.setTag("primaryOutput", new NBTTagCompound());

        if (secondaryOutput != null)
        {
            toSend.setTag("secondaryOutput", new NBTTagCompound());
        }

        input.writeToNBT(toSend.getCompoundTag("input"));
        primaryOutput.writeToNBT(toSend.getCompoundTag("primaryOutput"));

        if (secondaryOutput != null)
        {
            secondaryOutput.writeToNBT(toSend.getCompoundTag("secondaryOutput"));
            toSend.setInteger("secondaryChance", secondaryChance);
        }

        FMLInterModComms.sendMessage("ThermalExpansion", "pulverizerrecipe", toSend);

        //ThermalExpansionHelper.addPulverizerRecipe(3000, new ItemStack(Item.getItemFromBlock(Blocks.NETHER_GOLD_ORE)), new ItemStack(Item.getByNameOrId(OreDictionary.getOres("dustGold").toString())), new ItemStack(Item.getByNameOrId(OreDictionary.getOres("dustGold").toString())), 100);
        //ThermalExpansionHelper.addPulverizerRecipe(100, new ItemStack(Item.getItemFromBlock(Blocks.NETHER_ADAMANTIUM_ORE)), new ItemStack(Item.getByNameOrId(OreDictionary.getOres("ingotAdamantium").toString())));
    }

    public static void addFurnaceRecipe()
    {
        NBTTagCompound recipe = new NBTTagCompound();
        recipe.setInteger("energy", 3000);
        recipe.setTag("input", new ItemStack(Item.getItemFromBlock(Blocks.NETHER_GOLD_ORE)).writeToNBT(new NBTTagCompound()));
        recipe.setTag("output", new ItemStack(Items.GOLD_INGOT,2).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("ThermalExpansion", "addfurnacerecipe", recipe);
    }
}
