package com.example.utility.patterns.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // First time: Image is loaded from disk
        image.display();

        // Second time: Image is displayed without loading again
        image.display();
    }
}
