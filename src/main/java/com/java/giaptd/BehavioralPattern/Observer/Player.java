package com.java.giaptd.BehavioralPattern.Observer;

public class Player implements Observer {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(String bossName, int hp) {
        System.out.println(playerName + " is notified: " + bossName + "'s HP: " + hp);
    }
}
