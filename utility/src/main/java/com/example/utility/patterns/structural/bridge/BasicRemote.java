package com.example.utility.patterns.structural.bridge;

public class BasicRemote implements RemoteControl{
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }
    @Override
    public void power() {
        device.setPower(!device.isPoweredOn());
        System.out.println("Power toggled: " + (device.isPoweredOn() ? "ON" : "OFF"));
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
        System.out.println("Volume increased to: " + device.getVolume());
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
        System.out.println("Volume decreased to: " + device.getVolume());
    }
}
