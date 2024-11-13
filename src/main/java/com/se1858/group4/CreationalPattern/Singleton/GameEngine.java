package com.se1858.group4.CreationalPattern.Singleton;

public class GameEngine {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        System.out.println("Resolution: " + configurationManager.getConfig("resolution"));

        LogManager logManager = LogManager.getInstance();
        logManager.log("Game has been initialized");

        GameLoop gameLoop = GameLoop.getInstance();
        Thread gameLoopThread = new Thread(gameLoop::start);
        gameLoopThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        gameLoop.stop();
    }
}
