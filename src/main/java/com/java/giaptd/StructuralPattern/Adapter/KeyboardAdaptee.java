package com.java.giaptd.StructuralPattern.Adapter;

public class KeyboardAdaptee {
    public void receive(String command) {
        System.out.println("Command from Adapter: " + command);
    }
}
