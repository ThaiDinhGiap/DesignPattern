package com.java.giaptd.BehavioralPattern.Iterator;
import lombok.*;

@Getter
@ToString
public class Item {
    private String name;
    private String type;
    private int value;
    private int price;

    public Item(String name, String type, int value, int price) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.price = price;
    }

    public void use() {
        System.out.println("Using " + name + ". Effect: " + value);
    }

    public void sell() {
        System.out.println("Selling " + name + ". Price: " + price);
    }
}
