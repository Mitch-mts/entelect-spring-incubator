package com.example.utility.patterns.creational.prototypepattern;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}
