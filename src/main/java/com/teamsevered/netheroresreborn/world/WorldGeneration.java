package com.teamsevered.netheroresreborn.world;

import com.teamsevered.netheroresreborn.blocks.Blocks;
import com.teamsevered.netheroresreborn.configuration.ConfigurationHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGeneration implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        if(world.provider.getDimension() == -1)
        {
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    public void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        if(ConfigurationHandler.getBoolean("worldgen","adamantium-ore"))
        {
            generateOre(Blocks.NETHER_ADAMANTIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "aluminium-ore"))
        {
            generateOre(Blocks.NETHER_ALUMINIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "amber-ore"))
        {
            generateOre(Blocks.NETHER_AMBER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "coal-ore"))
        {
            generateOre(Blocks.NETHER_COAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "copper-ore"))
        {
            generateOre(Blocks.NETHER_COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "diamond-ore"))
        {
            generateOre(Blocks.NETHER_DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "emerald-ore"))
        {
            generateOre(Blocks.NETHER_EMERALD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "gold-ore"))
        {
            generateOre(Blocks.NETHER_GOLD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "iridium-ore"))
        {
            generateOre(Blocks.NETHER_IRIDIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "iron-ore"))
        {
            generateOre(Blocks.NETHER_IRON_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "lapis-ore"))
        {
            generateOre(Blocks.NETHER_LAPIS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "lead-ore"))
        {
            generateOre(Blocks.NETHER_LEAD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "magnesium-ore"))
        {
            generateOre(Blocks.NETHER_MAGNESIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "mythril-ore"))
        {
            generateOre(Blocks.NETHER_MYTHRIL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "nickel-ore"))
        {
            generateOre(Blocks.NETHER_NICKEL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "nikolite-ore"))
        {
            generateOre(Blocks.NETHER_NIKOLITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "osmium-ore"))
        {
            generateOre(Blocks.NETHER_OSMIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "peridot-ore"))
        {
            generateOre(Blocks.NETHER_PERIDOT_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "platinum-ore"))
        {
            generateOre(Blocks.NETHER_PLATINUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "redstone-ore"))
        {
            generateOre(Blocks.NETHER_REDSTONE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "ruby-ore"))
        {
            generateOre(Blocks.NETHER_RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "rutile-ore"))
        {
            generateOre(Blocks.NETHER_RUTILE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "salt-ore"))
        {
            generateOre(Blocks.NETHER_SALT_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "saltpeter-ore"))
        {
            generateOre(Blocks.NETHER_SALTPETER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "sapphire-ore"))
        {
            generateOre(Blocks.NETHER_SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "silver-ore"))
        {
            generateOre(Blocks.NETHER_SILVER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "steel-ore"))
        {
            generateOre(Blocks.NETHER_STEEL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "suifur-ore"))
        {
            generateOre(Blocks.NETHER_SULFUR_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "tennantite-ore"))
        {
            generateOre(Blocks.NETHER_TENNANTITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "tin-ore"))
        {
            generateOre(Blocks.NETHER_TIN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "titanium-ore"))
        {
            generateOre(Blocks.NETHER_TITANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "tungsten-ore"))
        {
            generateOre(Blocks.NETHER_TUNGSTEN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }

        if(ConfigurationHandler.getBoolean("worldgen", "uranium-ore"))
        {
            generateOre(Blocks.NETHER_URANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        }
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
    {
        int deltaY = maxY - minY;

        for(int i = 0; i < chances; i++)
        {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
