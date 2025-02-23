package com.example.utility.patterns.bahavioral.iterator;

public class IteratorPatternDemo {
    /*
    * Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation
    * */
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator iterator = namesRepository.getIterator();
        
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }
}