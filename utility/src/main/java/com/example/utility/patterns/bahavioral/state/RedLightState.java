package com.example.utility.patterns.bahavioral.state;

class RedLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Red Light - Stop!");
        context.setState(new GreenLightState());
    }
    @Override
    public String getState() { return "Red"; }
}