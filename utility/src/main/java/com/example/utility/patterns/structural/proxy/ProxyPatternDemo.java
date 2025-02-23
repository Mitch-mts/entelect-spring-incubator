package com.example.utility.patterns.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        /*
        * Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
        * A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
        * */
        Image image = new ProxyImage("test_image.jpg");

        // First time: Image is loaded from disk
        image.display();

        // Second time: Image is displayed without loading again
        image.display();
    }
}
