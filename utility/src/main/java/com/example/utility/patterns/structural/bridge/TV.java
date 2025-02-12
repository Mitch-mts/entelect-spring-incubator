package com.example.utility.patterns.structural.bridge;

public class TV extends Device{
    @Override
    public void printStatus() {
        System.out.println("TV status - Power: " + (isPoweredOn() ? "ON" : "OFF"));
    }
}
