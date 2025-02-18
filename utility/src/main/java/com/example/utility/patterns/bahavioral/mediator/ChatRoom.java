package com.example.utility.patterns.bahavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Sender should not receive their own message
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}