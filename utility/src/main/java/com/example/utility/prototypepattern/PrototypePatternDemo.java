package com.example.utility.prototypepattern;

public class PrototypePatternDemo {
    /*
    * Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.*/
    public static void main(String[] args) {
        ShapeRegistry shapeRegistry = new ShapeRegistry();
        shapeRegistry.registerShape("Circle", new Circle(5));
        shapeRegistry.registerShape("Rectangle", new Rectangle(10, 20));

        Shape clonedCircle = shapeRegistry.getShape("Circle");
        clonedCircle.draw();

        Shape clonedRectangle = shapeRegistry.getShape("Rectangle");
        clonedRectangle.draw();

        if (clonedCircle instanceof Circle) {
            ((Circle) clonedCircle).setRadius(15);
            clonedCircle.draw();
        }
    }
}
