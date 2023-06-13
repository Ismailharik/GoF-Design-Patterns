package org.example.creational.builderPattern.externalBuilder;

class Car {
    private String make;
    private String model;
    private int year;
    private boolean hasSunroof;
    private boolean hasNavigation;

    public Car(String make, String model, int year, boolean hasSunroof, boolean hasNavigation) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hasSunroof = hasSunroof;
        this.hasNavigation = hasNavigation;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public boolean hasNavigation() {
        return hasNavigation;
    }
}

class CarBuilder {
    private String make;
    private String model;
    private int year;
    private boolean hasSunroof;
    private boolean hasNavigation;

    public CarBuilder() {
    }

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public CarBuilder setHasNavigation(boolean hasNavigation) {
        this.hasNavigation = hasNavigation;
        return this;
    }

    public Car build() {
        return new Car(make, model, year, hasSunroof, hasNavigation);
    }
}

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.setMake("Tesla");
        builder.setModel("Model S");
        builder.setYear(2022);
        builder.setHasSunroof(true);
        builder.setHasNavigation(true);

        Car car = builder.build();

        // Use the constructed car object
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Has Sunroof: " + car.hasSunroof());
        System.out.println("Has Navigation: " + car.hasNavigation());
    }
}
