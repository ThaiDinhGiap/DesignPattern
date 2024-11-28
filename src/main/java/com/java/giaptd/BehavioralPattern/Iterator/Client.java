package com.java.giaptd.BehavioralPattern.Iterator;

public class Client {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Sword", "Weapon", 100, 500));
        inventory.addItem(new Item("Health Potion", "Potion", 50, 200));
        inventory.addItem(new Item("Magic Herb", "Material", 30, 1000));
        inventory.addItem(new Item("Shield", "Weapon", 150, 500));
        inventory.addItem(new Item("Mana Potion", "Potion", 60, 600));

        System.out.println("=== All Items ===");
        ItemIterator<Item> iterator = inventory.iterator();
        System.out.print("| ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getName() + " | ");
        }
        System.out.println();

        System.out.println("=== Using Health Potion ===");
        Item healthPotion = inventory.findItem("Health Potion");
        inventory.useItem(healthPotion);

        System.out.println("=== Sell Magic Herb ===");
        Item magicHerb = inventory.findItem("Magic Herb");
        inventory.sellItem(magicHerb);

        System.out.println("=== All Items ===");
        iterator = inventory.iterator();
        System.out.print("| ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getName() + " | ");
        }
        System.out.println();
    }
}
