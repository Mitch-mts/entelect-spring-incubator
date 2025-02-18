package com.example.utility.patterns.bahavioral.state;

interface TrafficLightState {
    void handleRequest(TrafficLightContext context);
    String getState();
}