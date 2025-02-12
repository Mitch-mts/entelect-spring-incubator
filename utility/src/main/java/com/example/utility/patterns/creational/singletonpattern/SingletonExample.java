package com.example.utility.patterns.creational.singletonpattern;

public class SingletonExample {
    /*
    * Singleton is a creational design pattern that lets you ensure that a class has only one instance,
    * while providing a global access point to this instance.*/
    private static SingletonExample instance;

    private SingletonExample() {
        System.out.println("Singleton instance created");
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();

        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
        System.out.println(SingletonExample.getInstance().toString());
    }

}
