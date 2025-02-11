package com.example.utility.factorypattern;

public class FactoryMethod {
    /*
    * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
    * but allows subclasses to alter the type of objects that will be created.*/
    public static void main(String [] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

    }
}
