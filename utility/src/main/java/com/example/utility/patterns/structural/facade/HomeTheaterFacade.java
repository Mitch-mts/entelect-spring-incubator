package com.example.utility.patterns.structural.facade;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;


    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    void watchMovie(String movie) {
        System.out.println("Starting movie " + movie);
        amplifier.on();
        dvdPlayer.on();
        projector.on();
        dvdPlayer.play(movie);
    }

    void stopMovie() {
        System.out.println("Stopping movie");
        projector.off();
        dvdPlayer.off();
        amplifier.off();
    }
}
