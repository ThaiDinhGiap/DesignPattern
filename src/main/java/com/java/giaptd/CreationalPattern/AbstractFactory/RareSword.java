package com.java.giaptd.CreationalPattern.AbstractFactory;

public class RareSword implements Sword {
    @Override
    public void create() {
        System.out.println("Create Rare Sword");
    }
}
