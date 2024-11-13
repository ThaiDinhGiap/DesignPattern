package com.se1858.group4.CreationalPattern.Singleton;

import java.util.Properties;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties config;

    private ConfigurationManager() {
        config = new Properties();
        // Load configuration
        config.setProperty("volumn", "80");
        config.setProperty("resolution", "1080x1080");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.getProperty(key);
    }
}
