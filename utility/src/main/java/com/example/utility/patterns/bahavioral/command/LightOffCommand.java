package com.example.utility.patterns.bahavioral.command;

class LightOffCommand implements Command {
    private Light light;
    
    LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.turnOff();
    }
    
    @Override
    public void undo() {
        light.turnOn();
    }
}