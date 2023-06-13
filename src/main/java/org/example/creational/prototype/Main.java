package org.example.creational.prototype;

import java.util.HashMap;
import java.util.Map;

// Prototype interface
interface Shape extends Cloneable {
    void draw();
    Shape clone();
}

// Concrete prototype classes
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public Shape clone() {
        return new Circle();
    }
}

// Prototype registry
class ShapeRegistry {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    static {
        shapeMap.put("rectangle", new Rectangle());
        shapeMap.put("circle", new Circle());
    }

    public static Shape getShape(String type) {
        Shape shape = null;
        try {
            shape = shapeMap.get(type).clone();
        } catch (NullPointerException e) {
            System.out.println("Shape not found: " + type);
        }
        return shape;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeRegistry.getShape("rectangle");
        rectangle.draw();

        Shape circle = ShapeRegistry.getShape("circle");
        circle.draw();
    }
}
