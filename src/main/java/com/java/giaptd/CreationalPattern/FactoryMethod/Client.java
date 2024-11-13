package com.java.giaptd.CreationalPattern.FactoryMethod;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        CharacterType option = chooseCharacterType();

        if (option != null) {
            Character character = CharacterFactory.getCharacter(option);
            System.out.println("You selected " + character.getCharacterName());
        } else {
            System.out.println("You have not selected any character");
        }
    }

    public static CharacterType chooseCharacterType() {
        System.out.println("Choose one of the following characters (or 0 to exit):");

        CharacterType[] types = CharacterType.values();
        System.out.println("0. Exit");
        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 0 || choice > types.length) {
            System.out.print("Enter the number of your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice == 0) return null;

                if (choice < 1 || choice > types.length) {
                    System.out.println("Invalid choice. Please choose a number between 0 and " + types.length + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return types[choice - 1];
    }
}
