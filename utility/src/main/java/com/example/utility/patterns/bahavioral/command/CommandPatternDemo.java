package com.example.utility.patterns.bahavioral.command;

public class CommandPatternDemo {

    /*
    * Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.
    * This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations
    * */

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