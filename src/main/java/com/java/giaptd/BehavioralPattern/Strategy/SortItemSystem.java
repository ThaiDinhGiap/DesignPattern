package com.java.giaptd.BehavioralPattern.Strategy;

public class SortItemSystem {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add(new ItemType("Sword", 100));
        sortedList.add(new ItemType("Knife", 200));
        sortedList.add(new ItemType("Armor", 300));

        sortedList.setSortStrategy(new SelectionSort());
        sortedList.sortAsc();
        sortedList.print();
        sortedList.sortDesc();
        sortedList.print();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sortAsc();
        sortedList.print();
        sortedList.sortDesc();
        sortedList.print();
    }
}
