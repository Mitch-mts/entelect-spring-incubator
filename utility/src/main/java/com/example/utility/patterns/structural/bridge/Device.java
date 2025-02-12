package com.example.utility.patterns.structural.bridge;

abstract class Device {
    private boolean power;
    private int volume = 50;

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean isPoweredOn() {
        return power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(volume, 100));
    }

    public abstract void printStatus();
}
