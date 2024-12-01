package com.java.giaptd.BehavioralPattern.Strategy;

import java.util.List;

public class SelectionSort implements SortStrategy{
    @Override
    public void sortPriceAsc(ItemType[] itemArray) {
        int minPrice = itemArray[0].getItemPrice();
        for (int i = 0; i < itemArray.length; i++) {
            ItemType currentItem = itemArray[i];
            for (int j = i + 1; j < itemArray.length; j++) {
                if (minPrice > itemArray[j].getItemPrice()) {
                    minPrice = itemArray[j].getItemPrice();
                    currentItem = itemArray[j];
                }
            }
            itemArray[i].swap(currentItem);
        }
    }

    @Override
    public void sortPriceDesc(ItemType[] itemArray) {
        int maxPrice = itemArray[0].getItemPrice();
        for (int i = 0; i < itemArray.length; i++) {
            ItemType currentItem = itemArray[i];
            for (int j = i + 1; j < itemArray.length; j++) {
                if (maxPrice < itemArray[j].getItemPrice()) {
                    maxPrice = itemArray[j].getItemPrice();
                    currentItem = itemArray[j];
                }
            }
            itemArray[i].swap(currentItem);
        }
    }
}
