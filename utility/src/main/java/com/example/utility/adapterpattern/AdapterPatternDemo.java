package com.example.utility.adapterpattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("mp4", "movie1.mp4");
        audioPlayer.play("vlc", "video2.vlc");
        audioPlayer.play("avi", "unsupported.avi");
    }
}
