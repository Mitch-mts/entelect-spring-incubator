package com.example.utility.patterns.creational.abstractpattern;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering MacOS button");
    }
}
