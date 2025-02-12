package com.example.utility.patterns.structural.bridge;

public class Radio extends Device{
    @Override
    public void printStatus() {
        System.out.println("Radio status - Power: " + (isPoweredOn() ? "ON" : "OFF"));
    }
}
