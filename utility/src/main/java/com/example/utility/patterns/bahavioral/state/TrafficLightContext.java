package com.example.utility.patterns.bahavioral.state;

class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        state = new RedLightState(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeLight() {
        state.handleRequest(this);
    }
    
    public String getCurrentState() {
        return state.getState();
    }
}