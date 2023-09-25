package com.singleton;

/**
 * Singleton - only one object get created
 */
public class Logger {

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }

        return logger;
    }
}
