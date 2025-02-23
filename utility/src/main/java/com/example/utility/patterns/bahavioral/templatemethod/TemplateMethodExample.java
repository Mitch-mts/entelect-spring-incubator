package com.example.utility.patterns.bahavioral.templatemethod;

public class TemplateMethodExample {

    public static void main(String[] args) {
        /*
        * Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
        * but lets subclasses override specific steps of the algorithm without changing its structure.
        * */
        DrinkTemplate tea = new Tea();
        DrinkTemplate coffee = new Coffee();

        System.out.println("Preparing Tea:");
        tea.prepareRecipe();

        System.out.println("\nPreparing Coffee:");
        coffee.prepareRecipe();
    }
}