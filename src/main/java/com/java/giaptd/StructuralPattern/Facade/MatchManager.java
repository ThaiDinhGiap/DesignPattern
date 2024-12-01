package com.java.giaptd.StructuralPattern.Facade;

import java.util.Arrays;

public class MatchManager {
    private MatchSetup matchSetup;
    private PlayerManager playerManager;
    private ResourceManager resourceManager;
    private ResultManager resultManager;

    public MatchManager() {
        matchSetup = new MatchSetup();
        playerManager = new PlayerManager();
        resourceManager = new ResourceManager();
        resultManager = new ResultManager();
    }

    public void startMatch(String mapName, String[] players) {
        System.out.println("=== Starting Match ===");
        matchSetup.loadMap(mapName);
        matchSetup.configureRules();

        Arrays.stream(players).forEach(playerManager::addPlayer);

        resourceManager.allocateResources();
        System.out.println("Match has started");
    }

    public void endMatch() {
        System.out.println("=== Ending Match ===");
        resultManager.calculateResults();
        resultManager.displayResults();
        resourceManager.releaseResources();
        System.out.println("Match has ended");
    }
}
