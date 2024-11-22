package com.java.giaptd.StructuralPattern.Bridge;

public class PoisonAttack implements AttackType{
    @Override
    public void attack() {
        System.out.print("Poison Damage!");
    }
}
