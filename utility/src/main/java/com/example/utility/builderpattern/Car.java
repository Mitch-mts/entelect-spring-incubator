package com.example.utility.builderpattern;

public class Car {
    /*
    * Builder is a creational design pattern that lets you construct complex objects step by step.
    * The pattern allows you to produce different types and representations of an object using the same construction code.*/
    private final String engine;
    private final int wheels;
    private final boolean sunroof;
    private final String color;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.sunroof = builder.sunroof;
        this.color = builder.color;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Wheels=" + wheels + ", Sunroof=" + sunroof + ", Color=" + color + "]";
    }

    public static class CarBuilder {
        private String engine;
        private int wheels;
        private boolean sunroof = false;
        private String color = "Black";

        public CarBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("V8", 4)
                .setSunroof(true)
                .setColor("Red")
                .build();

        Car car2 = new Car.CarBuilder("V6", 4)
                .setColor("Blue")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
