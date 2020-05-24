package com.teamsevered.netheroresreborn;

import com.teamsevered.netheroresreborn.proxy.CommonProxy;
import com.teamsevered.netheroresreborn.util.Reference;
import com.teamsevered.netheroresreborn.util.TabUtil;
import com.teamsevered.netheroresreborn.world.WorldGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.logging.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class NetherOresReborn
{
	private static Logger logger;

	@Mod.Instance
	public static NetherOresReborn instance;

	public static final CreativeTabs NETHER_ORES_TAB = new TabUtil("Nether Ores: Reborn");

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS ,serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new WorldGeneration(), 0);
	}

	@EventHandler
	public void load(FMLInitializationEvent evt)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{

	}

	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent evt)
	{

	}
}
