package com.example.utility.prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> shapes = new HashMap<>();

    public void registerShape(String key, Shape shape) {
        shapes.put(key, shape);
    }

    public Shape getShape(String key) {
        Shape shape = shapes.get(key);
        return shape != null ? shape.clone() : null;
    }
}
