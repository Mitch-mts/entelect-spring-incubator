package com.example.utility.patterns.bahavioral.templatemethod;

abstract class DrinkTemplate {

    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Common step that can be used by all drinks
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Abstract method for the drink-specific brewing step
    protected abstract void brew();

    // Common step for pouring the drink into a cup
    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Abstract method for adding condiments specific to the drink
    protected abstract void addCondiments();
}