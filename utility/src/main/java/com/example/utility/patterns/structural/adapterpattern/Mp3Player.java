package com.example.utility.patterns.structural.adapterpattern;

public class Mp3Player implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            System.out.println("Invalid mp3 audio type: " + audioType);
        }
    }
}
