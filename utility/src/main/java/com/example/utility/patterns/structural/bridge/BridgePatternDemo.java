package com.example.utility.patterns.structural.bridge;

public class BridgePatternDemo {
    public static void main(String[]args) {
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemote(tv);

        System.out.println("Testing Basic remote with TV:");
        basicRemote.power();
        basicRemote.volumeUp();
        tv.printStatus();

        System.out.println("\nTesting advanced remote with Radio:");
        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        radio.printStatus();
    }
}
