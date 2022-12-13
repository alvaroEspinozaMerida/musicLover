package com.elena_alvaro.musicLover.data;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> config;

    private ConfigurationManager() {
        // Private constructor, prevents instantiation from outside the class
        this.config = new HashMap<>();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        this.config.put(key, value);
    }

    public String getConfig(String key) {
        return this.config.get(key);
    }

    public void loadDatabaseConfig() {
        //call username and password from application.properties and store them in variables
        String username = System.getProperty("spring.datasource.username");
        String password = System.getProperty("spring.datasource.password");

        // Set the username and password in the DatabaseConnectionManager
        DatabaseConnectionManager manager = DatabaseConnectionManager.getInstance();
        manager.setUsername(username);
        manager.setPassword(password);
    }
}
