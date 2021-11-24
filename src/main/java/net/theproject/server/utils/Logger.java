package net.theproject.server.utils;

import org.apache.logging.log4j.LogManager;

import static net.theproject.server.Init.MOD_ID;

public class Logger {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();

    public static void logError(String error) {
        LOGGER.error(MOD_ID + " " + error);
    }

    public static void logInfo(String info) {
        LOGGER.info(MOD_ID + " " + info);
    }
    
    public static void logError(String LogName, String error) {
        LOGGER.error(LogName + " " + error);
    }

    public static void logInfo(String LogName, String info) {
        LOGGER.info(LogName + " " + info);
    }

}