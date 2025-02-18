package com.example.utility.patterns.bahavioral.templatemethod;

class Tea extends DrinkTemplate {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon...");
    }
}