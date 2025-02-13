package com.example.utility.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-"  + color + "-" + texture;

        if( !treeTypes.containsKey(key) ) {
            treeTypes.put(key, new TreeType(name, color, texture));
            System.out.println("Tree type " + key + " created");
        }
        return treeTypes.get(key);
    }
}
