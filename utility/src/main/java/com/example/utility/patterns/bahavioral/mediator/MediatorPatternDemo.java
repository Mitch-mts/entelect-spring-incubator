package com.example.utility.patterns.bahavioral.mediator;

public class MediatorPatternDemo {
    /*
    * Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
    * The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
    * */
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello, everyone!");
        user2.send("Hey Alice!");
    }
}