package com.example.utility.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightPatternDemo {
    /*
    * Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
    * */
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        forest.add(new Tree(10,30, TreeFactory.getTreeType("Oak", "Green", "Rough")));
        forest.add(new Tree(15,40, TreeFactory.getTreeType("Oak", "Green", "Rough")));
        forest.add(new Tree(20,50, TreeFactory.getTreeType("Oak", "Green", "Rough")));
        forest.add(new Tree(25,60, TreeFactory.getTreeType("Oak", "Green", "Rough")));

        for (Tree tree : forest) {
            tree.draw();
        }
    }
}
