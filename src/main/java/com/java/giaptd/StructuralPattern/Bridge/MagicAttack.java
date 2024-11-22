package com.java.giaptd.StructuralPattern.Bridge;

public class MagicAttack implements AttackType{
    @Override
    public void attack() {
        System.out.print("Magic Damage!");
    }
}
