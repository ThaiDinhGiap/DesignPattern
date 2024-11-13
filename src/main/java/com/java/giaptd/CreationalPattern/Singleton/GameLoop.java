package com.java.giaptd.CreationalPattern.Singleton;

public class GameLoop {
    private static volatile GameLoop instance;
    private volatile boolean running = true;

    private GameLoop() {}

    public static GameLoop getInstance() {
        if (instance == null) {
            synchronized (GameLoop.class) {
                if (instance == null) {
                    instance = new GameLoop();
                }
            }
        }
        return instance;
    }

    public void start() {
        System.out.println("Starting GameLoop...");
        while (running) {
            update();
            render();
        }
        System.out.println("GameLoop stopped");
    }

    public void stop() {
        running = false;
    }

    public void update() {
        System.out.println("Updating GameLoop...");
    }

    public void render() {
        System.out.println("Rendering GameLoop...");
    }
}
