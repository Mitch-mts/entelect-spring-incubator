package com.example.utility.patterns.bahavioral.state;

public class StatePatternExample {
    public static void main(String[] args) {
        /*
        * State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
        * It appears as if the object changed its class.
        * */
        TrafficLightContext trafficLight = new TrafficLightContext();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Current Light: " + trafficLight.getCurrentState());
            trafficLight.changeLight();
        }
    }
}