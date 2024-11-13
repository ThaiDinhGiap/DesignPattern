package com.java.giaptd.CreationalPattern.AbstractFactory;

public class CommonItemFactory extends ItemAbstractFactory {
    @Override
    public Sword createSword() {
        return new CommonSword();
    }

    @Override
    public Armor createArmor() {
        return new CommonArmor();
    }
}
