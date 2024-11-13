package com.se1858.group4.CreationalPattern.FactoryMethod;

public class CharacterFactory {

    private CharacterFactory() {}

    public static final Character getCharacter(CharacterType characterType) {
        switch (characterType) {
            case Knight:
                return new Knight();
            case Healer:
                return new Healer();
            default:
                throw new IllegalArgumentException("Invalid character type");
        }
    }
}
