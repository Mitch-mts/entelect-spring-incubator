package com.example.utility.patterns.structural.facade;

public class DvdPlayer {
    void on() {
        System.out.println("DvdPlayer on");
    }

    void off() {
        System.out.println("DvdPlayer off");
    }

    void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
