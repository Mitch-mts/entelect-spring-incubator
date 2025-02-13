package com.example.utility.patterns.structural.decrator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return decoratorCoffee.getCost() + 1.5;
    }
}
