package com.teamsevered.netheroresreborn.world;

import com.teamsevered.netheroresreborn.blocks.Blocks;
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
        generateOre(Blocks.NETHER_ADAMANTIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_ALUMINIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_AMBER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_COAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_EMERALD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_GOLD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_IRIDIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_IRON_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_LAPIS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_LEAD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_MAGNESIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_MITHRIL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_NICKEL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_NICKOLITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_OSMIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_PERIDOT_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_PLATINUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_REDSTONE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_RUTILE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_SALT_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_SALTPETER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_SILVER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_STEEL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_SULFUR_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_TENNANTITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_TIN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_TITANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_TUNGSTEN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
        generateOre(Blocks.NETHER_URANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 120,random.nextInt(4) + 4, 18);
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
