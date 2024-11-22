package com.java.giaptd.StructuralPattern.Bridge;

import java.util.List;

public abstract class Weapon {
    protected List<AttackType> attackTypes;

    public Weapon(List<AttackType> attackTypes) {
        this.attackTypes = attackTypes;
    }

    public void addAttackType(AttackType attackType) {
        attackTypes.add(attackType);
    }

    public void removeAttackType(AttackType attackType) {
        attackTypes.remove(attackType);
    }

    public abstract void attack();
}
