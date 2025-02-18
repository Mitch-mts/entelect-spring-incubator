package com.example.utility.patterns.bahavioral.state;

class GreenLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Green Light - Go!");
        context.setState(new YellowLightState());
    }
    @Override
    public String getState() { return "Green"; }
}