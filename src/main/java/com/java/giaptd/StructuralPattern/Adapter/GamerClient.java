package com.java.giaptd.StructuralPattern.Adapter;

public class GamerClient {
    public static void main(String[] args) {
        JoystickTarget client = new ConvertAdapter(new KeyboardAdaptee());
        System.out.println("Command 1");
        client.send("up");
        System.out.println("Command 2");
        client.send("down");
        System.out.println("Command 3");
        client.send("left");
        System.out.println("Command 4");
        client.send("right");
    }
}
