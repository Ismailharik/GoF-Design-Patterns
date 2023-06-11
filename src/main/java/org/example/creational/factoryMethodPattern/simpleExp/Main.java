package org.example.creational.factoryMethodPattern.simpleExp;

//Define the Product Interface/Class
interface Vehicle {
    void start();
}


//Implement the Concrete Products
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}
class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }
}


//Create the Creator Abstract Class/Interface
interface VehicleFactory {
     Vehicle createVehicle();
}


// Implement the Concrete Creators
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start(); // Output: "Car started."

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.start(); // Output: "Motorcycle started."
    }
}

