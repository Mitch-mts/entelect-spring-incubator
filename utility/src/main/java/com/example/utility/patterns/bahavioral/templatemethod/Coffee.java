package com.example.utility.patterns.bahavioral.templatemethod;

class Coffee extends DrinkTemplate {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}