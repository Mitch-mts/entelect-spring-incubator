package com.example.utility.patterns.structural.bridge;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device muted");
    }
}
