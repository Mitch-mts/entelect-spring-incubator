package com.example.utility.patterns.bahavioral.chainofresponsibility;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        // Setting up the chain: INFO -> DEBUG -> ERROR
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        
        // Test messages
        infoLogger.logMessage(1, "This is an informational message.");
        infoLogger.logMessage(2, "This is a debug message.");
        infoLogger.logMessage(3, "This is an error message.");
    }
}