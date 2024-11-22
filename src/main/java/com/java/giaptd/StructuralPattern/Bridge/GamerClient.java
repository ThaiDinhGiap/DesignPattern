package com.java.giaptd.StructuralPattern.Bridge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class GamerClient {
    public static void main(String[] args) {
        AttackType physical = new PhysicalAttack();
        AttackType magical = new MagicAttack();
        AttackType poison = new PoisonAttack();

        Weapon sword = new Sword(Collections.singletonList(physical));
        sword.attack();

        Weapon dagger = new Dagger(Arrays.asList(physical, poison));
        dagger.attack();
    }
}
