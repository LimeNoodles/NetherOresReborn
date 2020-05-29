package com.teamsevered.netheroresreborn.world;

import com.teamsevered.netheroresreborn.configuration.ConfigurationHandler;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneration implements IWorldGenerator
{
    private WorldGenerator NETHER_ADAMANTIUM_ORE;
    private WorldGenerator NETHER_ALUMINIUM_ORE;
    private WorldGenerator NETHER_AMBER_ORE;
    private WorldGenerator NETHER_COAL_ORE;
    private WorldGenerator NETHER_COPPER_ORE;
    private WorldGenerator NETHER_DIAMOND_ORE;
    private WorldGenerator NETHER_EMERALD_ORE;
    private WorldGenerator NETHER_GOLD_ORE;
    private WorldGenerator NETHER_IRIDIUM_ORE;
    private WorldGenerator NETHER_IRON_ORE;
    private WorldGenerator NETHER_LAPIS_ORE;
    private WorldGenerator NETHER_LEAD_ORE;
    private WorldGenerator NETHER_MAGNESIUM_ORE;
    private WorldGenerator NETHER_MYTHRIL_ORE;
    private WorldGenerator NETHER_NICKEL_ORE;
    private WorldGenerator NETHER_NIKOLITE_ORE;
    private WorldGenerator NETHER_OSMIUM_ORE;
    private WorldGenerator NETHER_PERIDOT_ORE;
    private WorldGenerator NETHER_PLATINUM_ORE;
    private WorldGenerator NETHER_REDSTONE_ORE;
    private WorldGenerator NETHER_RUBY_ORE;
    private WorldGenerator NETHER_RUTILE_ORE;
    private WorldGenerator NETHER_SALT_ORE;
    private WorldGenerator NETHER_SALTPETER_ORE;
    private WorldGenerator NETHER_SAPPHIRE_ORE;
    private WorldGenerator NETHER_SILVER_ORE;
    private WorldGenerator NETHER_STEEL_ORE;
    private WorldGenerator NETHER_SULFUR_ORE;
    private WorldGenerator NETHER_TENNANTITE_ORE;
    private WorldGenerator NETHER_TIN_ORE;
    private WorldGenerator NETHER_TITANIUM_ORE;
    private WorldGenerator NETHER_TUNGSTEN_ORE;
    private WorldGenerator NETHER_URANIUM_ORE;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        int minY = 25;
        int maxY = 120;

        if(world.provider.getDimension() == -1)
        {
            if(ConfigurationHandler.getBoolean("worldgen","adamantium-ore"))
            {
                runGenerator(NETHER_ADAMANTIUM_ORE, world, random, chunkX, chunkZ, 30, 120,5);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "aluminium-ore"))
            {
                runGenerator(NETHER_ALUMINIUM_ORE, world, random, chunkX , chunkZ, 30, 12, 44);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "amber-ore"))
            {
                runGenerator(NETHER_AMBER_ORE, world, random, chunkX , chunkZ, 30, 12, 55);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "coal-ore"))
            {
                runGenerator(NETHER_COAL_ORE, world, random, chunkX , chunkZ, 30, 12, 52);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "copper-ore"))
            {
                runGenerator(NETHER_COPPER_ORE, world, random, chunkX , chunkZ, 30, 12, 36);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "diamond-ore"))
            {
                runGenerator(NETHER_DIAMOND_ORE, world, random, chunkX , chunkZ, 30, 12, 10);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "emerald-ore"))
            {
                runGenerator(NETHER_EMERALD_ORE, world, random, chunkX , chunkZ, 30, 12, 5);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "gold-ore"))
            {
                runGenerator(NETHER_GOLD_ORE, world, random, chunkX , chunkZ, 30, 12, 38);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "iridium-ore"))
            {
                runGenerator(NETHER_IRIDIUM_ORE, world, random, chunkX, chunkZ, 30, 12, 3);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "iron-ore"))
            {
                runGenerator(NETHER_IRON_ORE, world, random, chunkX, chunkZ, 30, 12, 50);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "lapis-ore"))
            {
                runGenerator(NETHER_LAPIS_ORE, world, random, chunkX , chunkZ, 30, 12, 44);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "lead-ore"))
            {
                runGenerator(NETHER_LEAD_ORE, world, random, chunkX , chunkZ, 30, 12, 12);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "magnesium-ore"))
            {
                runGenerator(NETHER_MAGNESIUM_ORE, world, random, chunkX , chunkZ, 30, 12, 32);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "mythril-ore"))
            {
                runGenerator(NETHER_MYTHRIL_ORE, world, random, chunkX , chunkZ, 30, 12, 18);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "nickel-ore"))
            {
                runGenerator(NETHER_NICKEL_ORE, world, random, chunkX , chunkZ, 30, 12, 15);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "nikolite-ore"))
            {
                runGenerator(NETHER_NIKOLITE_ORE, world, random, chunkX , chunkZ, 30, 12, 18);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "osmium-ore"))
            {
                runGenerator(NETHER_OSMIUM_ORE, world, random, chunkX, chunkZ, 30, 12, 28);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "peridot-ore"))
            {
                runGenerator(NETHER_PERIDOT_ORE, world, random, chunkX, chunkZ, 30, 12, 25);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "platinum-ore"))
            {
                runGenerator(NETHER_PLATINUM_ORE, world, random, chunkX , chunkZ, 30, 12, 4);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "redstone-ore"))
            {
                runGenerator(NETHER_REDSTONE_ORE, world, random, chunkX , chunkZ, 30, 12, 52);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "ruby-ore"))
            {
                runGenerator(NETHER_RUBY_ORE, world, random, chunkX , chunkZ, 30, 12, 25);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "rutile-ore"))
            {
                runGenerator(NETHER_RUTILE_ORE, world, random, chunkX , chunkZ, 30, 12, 18);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "salt-ore"))
            {
                runGenerator(NETHER_SALT_ORE, world, random, chunkX , chunkZ, 30, 12, 35);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "saltpeter-ore"))
            {
                runGenerator(NETHER_SALTPETER_ORE, world, random, chunkX , chunkZ, 30, 12, 30);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "sapphire-ore"))
            {
                runGenerator(NETHER_SAPPHIRE_ORE, world, random, chunkX , chunkZ, 30, 12, 35);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "silver-ore"))
            {
                runGenerator(NETHER_SILVER_ORE, world, random, chunkX , chunkZ, 30, 12, 45);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "steel-ore"))
            {
                runGenerator(NETHER_STEEL_ORE, world, random, chunkX , chunkZ, 30, 12, 4);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "suifur-ore"))
            {
                runGenerator(NETHER_SULFUR_ORE, world, random, chunkX , chunkZ, 30, 12, 60);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "tennantite-ore"))
            {
                runGenerator(NETHER_TENNANTITE_ORE, world, random, chunkX , chunkZ, 30, 12, 25);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "tin-ore"))
            {
                runGenerator(NETHER_TIN_ORE, world, random, chunkX , chunkZ, 30, 12, 55);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "titanium-ore"))
            {
                runGenerator(NETHER_TITANIUM_ORE, world, random, chunkX , chunkZ, 30, 12, 30);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "tungsten-ore"))
            {
                runGenerator(NETHER_TUNGSTEN_ORE, world, random, chunkX , chunkZ, 30, 12, 40);
            }

            if(ConfigurationHandler.getBoolean("worldgen", "uranium-ore"))
            {
                runGenerator(NETHER_URANIUM_ORE, world, random, chunkX, chunkZ, 30, 12, 20);
            }
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int minY, int maxY, int chances)
    {

        if(minY > maxY || minY < 0 || maxY > 256)
        {
            throw new IllegalArgumentException(TextFormatting.DARK_AQUA + "[Nether Ores Reborn] -> " + TextFormatting.RED + "Ore Generated below or above the min and max height!");
        }

        int difference = maxY - minY + 1;

        for(int i = 0; i < chances; i++)
        {
            int x = chunkX  + random.nextInt(16);
            int y = minY + random.nextInt(difference);
            int z = chunkZ  + random.nextInt(16);

            generator.generate(world, random, new BlockPos(x,y,z));
        }
    }
}
