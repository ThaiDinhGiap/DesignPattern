package com.java.giaptd.StructuralPattern.Bridge;

import java.util.List;

public class Dagger extends Weapon{
    public Dagger(List<AttackType> attackTypes) {
        super(attackTypes);
    }

    @Override
    public void attack() {
        System.out.print("Using Dagger to attack. ");
        System.out.print("Attack:");
        for (AttackType attackType: attackTypes) {
            System.out.print(" ");
            attackType.attack();
        }
        System.out.println();
    }
}
