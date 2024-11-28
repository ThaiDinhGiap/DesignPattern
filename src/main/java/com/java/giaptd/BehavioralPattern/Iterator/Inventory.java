package com.java.giaptd.BehavioralPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items  = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void useItem(Item item) {
        item.use();
        removeItem(item);
    }

    public void sellItem(Item item) {
        item.sell();
        removeItem(item);
    }

    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) return item;
        }
        return null;
    }

    public ItemIterator<Item> iterator() {
        return new InventoryIterator();
    }

    class InventoryIterator implements ItemIterator<Item> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public Item next() {
            return items.get(index++);
        }
    }
}
