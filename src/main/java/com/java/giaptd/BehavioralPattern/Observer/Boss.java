package com.java.giaptd.BehavioralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject{
    private String name;
    private int hp;
    private List<Observer> observers = new ArrayList<>();

    public Boss(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if (observers.contains(observer)) observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(name, hp);
        }
    }

    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println(name + " takes " + damage + " damage. HP: " + hp);

        notifyAllObserver();
    }
}
