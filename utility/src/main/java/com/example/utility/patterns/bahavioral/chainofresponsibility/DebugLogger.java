package com.example.utility.patterns.bahavioral.chainofresponsibility;

class DebugLogger extends Logger {
    @Override
    protected boolean canHandle(int level) {
        return level == 2;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}