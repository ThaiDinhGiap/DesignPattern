package com.java.giaptd.StructuralPattern.Bridge;

public class PhysicalAttack implements AttackType{
    @Override
    public void attack() {
        System.out.print("Physical Damage!");
    }
}
