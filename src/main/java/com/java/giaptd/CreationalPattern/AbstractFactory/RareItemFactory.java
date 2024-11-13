package com.java.giaptd.CreationalPattern.AbstractFactory;

public class RareItemFactory extends ItemAbstractFactory{
    @Override
    public Sword createSword() {
        return new RareSword();
    }

    @Override
    public Armor createArmor() {
        return new RareArmor();
    }
}
