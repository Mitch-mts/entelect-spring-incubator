package com.example.utility.patterns.bahavioral.chainofresponsibility;

class ErrorLogger extends Logger {
    @Override
    protected boolean canHandle(int level) {
        return level == 3;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}