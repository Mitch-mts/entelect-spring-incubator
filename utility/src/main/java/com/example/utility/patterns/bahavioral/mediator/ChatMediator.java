package com.example.utility.patterns.bahavioral.mediator;

interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}