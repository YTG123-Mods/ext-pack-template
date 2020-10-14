package com.songsounds.extpacks.meme;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MemeExtPack implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "meme-ext-pack";
    public static final String MOD_NAME = "Meme Songs Extension Pack for Song Sounds";

    @Override
    public void onInitialize() {}

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}
