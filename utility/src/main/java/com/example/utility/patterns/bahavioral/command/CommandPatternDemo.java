package com.example.utility.patterns.bahavioral.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        
        RemoteControl remote = new RemoteControl();
        
        // Turn the light ON
        remote.setCommand(lightOn);
        remote.pressButton();
        
        // Undo turning the light ON
        remote.pressUndo();
        
        // Turn the light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
        
        // Undo turning the light OFF
        remote.pressUndo();
    }
}