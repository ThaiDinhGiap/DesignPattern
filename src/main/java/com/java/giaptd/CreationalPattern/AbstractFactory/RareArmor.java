package com.java.giaptd.CreationalPattern.AbstractFactory;

public class RareArmor implements Armor {
    @Override
    public void create() {
        System.out.println("Create Rare Armor");
    }
}
