package com.java.giaptd.StructuralPattern.Adapter;

public class ConvertAdapter implements JoystickTarget{

    private KeyboardAdaptee adaptee;

    public ConvertAdapter(KeyboardAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String command) {
        System.out.println("User command: " + command);
        String keyboardCommand = convert(command);
        System.out.println("Adapter command: " + keyboardCommand);
        adaptee.receive(keyboardCommand);
    }

    private String convert(String command) {
        switch (command) {
            case "up":
                return "↑";
            case "down":
                return "↓";
            case "left":
                return "←";
            case "right":
                return "→";
        }
        return "";
    }
}
