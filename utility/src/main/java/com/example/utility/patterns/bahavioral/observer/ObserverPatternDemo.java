package com.example.utility.patterns.bahavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        System.out.println("Sending first update...");
        subject.notifyObservers("First update!");

        subject.removeObserver(observer1);

        System.out.println("Sending second update...");
        subject.notifyObservers("Second update!");
    }
}