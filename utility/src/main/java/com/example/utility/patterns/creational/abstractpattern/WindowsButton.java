package com.example.utility.patterns.creational.abstractpattern;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering WindowsButton");
    }
}
