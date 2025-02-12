package com.example.utility.patterns.creational.prototypepattern;

public interface Shape extends Cloneable{
    Shape clone();
    void draw();
}
