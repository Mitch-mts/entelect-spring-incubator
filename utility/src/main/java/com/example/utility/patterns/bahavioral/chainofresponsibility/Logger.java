package com.example.utility.patterns.bahavioral.chainofresponsibility;

abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // method responsible to check is a logger method can handle the request or move it to the next
    public void logMessage(int level, String message) {
        if (canHandle(level)) {
            write(message);
        }
        // if a logger method cant handle the level it passes to the next
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    
    protected abstract boolean canHandle(int level);
    protected abstract void write(String message);
}