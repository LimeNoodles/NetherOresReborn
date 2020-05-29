package com.teamsevered.netheroresreborn.util.helpers;

import com.teamsevered.netheroresreborn.configuration.ConfigurationHandler;

public class ConfigHelper
{

    public static void createSections(String file)
    {
        ConfigurationHandler.setFile(file);
        ConfigurationHandler.writeConfig("worldgen", "adamantium-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "aluminium-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "amber-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "coal-ore", true);
        ConfigurationHandler.writeConfig("worldgen", "copper-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "diamond-ore", true);
        ConfigurationHandler.writeConfig("worldgen", "emerald-ore", true);
        ConfigurationHandler.writeConfig("worldgen", "gold-ore", true);
        ConfigurationHandler.writeConfig("worldgen", "iridium-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "iron-ore", true);
        ConfigurationHandler.writeConfig("worldgen", "lapis-ore", true);
        ConfigurationHandler.writeConfig("worldgen", "lead-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "magnesium-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "mythril-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "nickel-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "nikolite-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "osmium-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "peridot-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "platinum-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "redstone-ore", true);
        ConfigurationHandler.writeConfig("worldgen", "ruby-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "rutile-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "salt-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "saltpeter-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "sapphire-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "silver-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "steel-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "sulfur-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "tennantite-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "titanium-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "tungsten-ore", false);
        ConfigurationHandler.writeConfig("worldgen", "uranium-ore", false);
    }

}
