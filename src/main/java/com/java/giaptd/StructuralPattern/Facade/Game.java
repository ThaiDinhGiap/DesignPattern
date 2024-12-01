package com.java.giaptd.StructuralPattern.Facade;

public class Game {
    public static void main(String[] args) {
        MatchManager matchManager = new MatchManager();

        String[] players = {"Knight", "Healer", "Mage"};
        matchManager.startMatch("VietNam HaTinh", players);

        System.out.println("\n=== Processing Match ==\n");
        matchManager.endMatch();
    }
}
