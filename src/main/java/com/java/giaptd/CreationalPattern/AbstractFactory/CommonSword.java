package com.java.giaptd.CreationalPattern.AbstractFactory;

public class CommonSword implements Sword {
    @Override
    public void create() {
        System.out.println("Create Common Sword");
    }
}
