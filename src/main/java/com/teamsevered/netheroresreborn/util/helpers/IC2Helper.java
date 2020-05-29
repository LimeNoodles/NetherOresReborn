/*******************************************************
 * Copyright (C) 2010-2011 {name} <{email}>
 *
 * This file is part of {project}.
 *
 * Unauthorised copying of this file, via any medium is strictly prohibited
 *
 * permission of {name}
 *******************************************************/

package com.teamsevered.netheroresreborn.util.helpers;

import com.teamsevered.netheroresreborn.blocks.Blocks;
import ic2.api.recipe.*;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import javax.annotation.Nullable;
import java.util.List;

public class IC2Helper
{
    public static void registerMaceratorRecipe(IRecipeInput input, @Nullable NBTTagCompound metadata, ItemStack output)
    {
        Recipes.macerator.addRecipe(input, metadata, false, output);
    }

    public static void registerSmelterRecipe(ItemStack input, ItemStack output, NBTTagCompound metadata)
    {
        Recipes.furnace.addRecipe(input, output, metadata, false);
    }
}
