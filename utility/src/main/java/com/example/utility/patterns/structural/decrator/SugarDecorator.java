package com.example.utility.patterns.structural.decrator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return decoratorCoffee.getCost() + 0.5;
    }
}
