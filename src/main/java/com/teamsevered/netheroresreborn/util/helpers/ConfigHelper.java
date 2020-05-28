package com.teamsevered.netheroresreborn.util.helpers;

import com.teamsevered.netheroresreborn.configuration.ConfigurationHandler;

public class CreateConfigurationHandler
{

    public static void createSections(String file)
    {
        ConfigurationHandler.setFile(file);
        ConfigurationHandler.writeConfig("worldgen", "worldgen enabled", true);
    }

}
