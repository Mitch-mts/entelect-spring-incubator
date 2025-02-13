package com.example.utility.patterns.structural.decrator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        /*
        * Decorator is a structural design pattern that lets you attach
        * new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
        * */
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());
    }
}
