package com.java.giaptd.CreationalPattern.AbstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ItemAbstractFactory itemAbstractFactory = ItemFactory.getFactory(chooseRarityItemType());
        switch (chooseItemType()) {
            case Armor:
                Armor armor = itemAbstractFactory.createArmor();
                armor.create();
                break;
            case Sword:
                Sword sword = itemAbstractFactory.createSword();
                sword.create();
                break;
            default:
                break;
        }
    }

    public static RarityItemType chooseRarityItemType() {
        System.out.println("Choose Rarity Item: ");

        RarityItemType[] rarityItemTypes = RarityItemType.values();
        for (int i = 0; i < rarityItemTypes.length; i++) {
            System.out.println((i+1) + ": " + rarityItemTypes[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 1 || choice > rarityItemTypes.length) {
            System.out.print("Enter the number of your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice < 1 || choice > rarityItemTypes.length) {
                    System.out.println("Invalid choice. Please choose a number between 1 and " + rarityItemTypes.length + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return rarityItemTypes[choice - 1];
    }

    public static ItemType chooseItemType() {
        System.out.println("Choose Item: ");

        ItemType[] itemTypes = ItemType.values();
        for (int i = 0; i < itemTypes.length; i++) {
            System.out.println((i+1) + ": " + itemTypes[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 1 || choice > itemTypes.length) {
            System.out.print("Enter the number of your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice < 1 || choice > itemTypes.length) {
                    System.out.println("Invalid choice. Please choose a number between 1 and " + itemTypes.length + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return itemTypes[choice - 1];
    }
}
