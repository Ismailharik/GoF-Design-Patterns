package org.example.creational.AbstractFactory;

// Define the abstract product A: Shape
interface Shape {
    void draw();
}

// Define concrete product A1: Circle
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Define concrete product A2: Rectangle
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Define the abstract product B: Color
interface Color {
    void fill();
}

// Define concrete product B1: Red
class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Red color");
    }
}

// Define concrete product B2: Blue
class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Blue color");
    }
}

// Define the abstract factory interface
interface AbstractFactory {
    Shape createShape();
    Color createColor();
}

// Implement the concrete factory 1
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}

// Implement the concrete factory 2
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}

// Client code that uses the abstract factory
class Client {
    private Shape shape;
    private Color color;

    public Client(AbstractFactory factory) {
        shape = factory.createShape();
        color = factory.createColor();
    }

    public void drawAndFill() {
        shape.draw();
        color.fill();
    }
}

// Usage example
public class Main {
    public static void main(String[] args) {
        // Create objects using ConcreteFactory1
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.drawAndFill();

        // Create objects using ConcreteFactory2
        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.drawAndFill();
    }
}

