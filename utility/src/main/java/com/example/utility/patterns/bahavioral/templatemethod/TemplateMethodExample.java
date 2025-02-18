package com.example.utility.patterns.bahavioral.templatemethod;

public class TemplateMethodExample {

    public static void main(String[] args) {
        DrinkTemplate tea = new Tea();
        DrinkTemplate coffee = new Coffee();

        System.out.println("Preparing Tea:");
        tea.prepareRecipe();

        System.out.println("\nPreparing Coffee:");
        coffee.prepareRecipe();
    }
}