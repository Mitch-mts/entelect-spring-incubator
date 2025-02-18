package com.example.utility.patterns.bahavioral.visitor;

// Element interface
public interface Shape {
    void accept(ShapeVisitor visitor);
}
