package com.example.utility.patterns.bahavioral.state;

class YellowLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Yellow Light - Slow down!");
        context.setState(new RedLightState());
    }
    @Override
    public String getState() { return "Yellow"; }
}