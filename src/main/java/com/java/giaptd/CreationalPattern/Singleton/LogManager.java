package com.java.giaptd.CreationalPattern.Singleton;

public class LogManager {
    private LogManager() {}

    private static class SingletonHelper {
        private static final LogManager INSTANCE = new LogManager();
    }

    public static LogManager getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
