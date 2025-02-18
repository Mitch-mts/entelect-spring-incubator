package com.example.utility.patterns.bahavioral.state;

public class StatePatternExample {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Current Light: " + trafficLight.getCurrentState());
            trafficLight.changeLight();
        }
    }
}