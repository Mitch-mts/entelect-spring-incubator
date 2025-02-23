package com.example.utility.patterns.bahavioral.visitor;

import lombok.Getter;

@Getter
public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}