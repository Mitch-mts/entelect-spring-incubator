package com.example.utility.patterns.bahavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        /*
        * Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
        * */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        // Visitors
        ShapeVisitor drawVisitor = new DrawVisitor();
        ShapeVisitor areaVisitor = new AreaVisitor();

        System.out.println("=== Drawing Shapes ===");
        for (Shape shape : shapes) {
            shape.accept(drawVisitor);
        }

        System.out.println("\n=== Calculating Areas ===");
        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }
    }
}