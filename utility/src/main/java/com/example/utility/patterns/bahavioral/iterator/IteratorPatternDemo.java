package com.example.utility.patterns.bahavioral.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator iterator = namesRepository.getIterator();
        
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }
}