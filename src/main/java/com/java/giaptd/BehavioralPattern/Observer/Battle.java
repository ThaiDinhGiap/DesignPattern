package com.java.giaptd.BehavioralPattern.Observer;

public class Battle {
    public static void main(String[] args) {
        Boss boss = new Boss("Black Dragon", 100);

        Player Knight = new Player("Knight");
        Player Healer = new Player("Healer");
        Player Swordsman = new Player("Swordsman");

        boss.attach(Knight);
        boss.attach(Healer);
        boss.attach(Swordsman);

        boss.takeDamage(20);
        boss.takeDamage(10);
    }
}
