package com.example.utility.patterns.structural.decrator;

public class CoffeeDecorator implements Coffee{
    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost();
    }
}
