package com.example.utility.patterns.bahavioral.visitor;

public class DrawVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a Circle with radius: " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing a Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
    }
}