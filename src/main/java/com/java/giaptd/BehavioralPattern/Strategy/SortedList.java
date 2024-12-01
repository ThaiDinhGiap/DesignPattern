package com.java.giaptd.BehavioralPattern.Strategy;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedList {
    @Setter
    private SortStrategy sortStrategy;
    private List<ItemType> items = new ArrayList<>();

    public void add(ItemType item) {
        items.add(item);
    }

    public void sortAsc() {
        ItemType[] itemArr = items.toArray(new ItemType[items.size()]);
        sortStrategy.sortPriceAsc(itemArr);
        items.clear();
        items.addAll(Arrays.asList(itemArr));
        System.out.println("Sorted List Ascending: ");
    }

    public void sortDesc() {
        ItemType[] itemArr = items.toArray(new ItemType[items.size()]);
        sortStrategy.sortPriceDesc(itemArr);
        items.clear();
        items.addAll(Arrays.asList(itemArr));
        System.out.println("Sorted List Descending: ");
    }

    public void print() {
        for (ItemType item : items) {
            System.out.print(item.getItemName() + " | ");
        }
        System.out.println();
    }
}
