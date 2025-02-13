package com.example.utility.patterns.structural.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        /*
        * Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
        * */
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector);
        homeTheater.watchMovie("Avengers");

        homeTheater.stopMovie();
    }
}
