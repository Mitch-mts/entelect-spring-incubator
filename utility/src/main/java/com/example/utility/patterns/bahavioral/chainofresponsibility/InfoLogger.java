package com.example.utility.patterns.bahavioral.chainofresponsibility;

class InfoLogger extends Logger {
    @Override
    protected boolean canHandle(int level) {
        return level == 1;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}