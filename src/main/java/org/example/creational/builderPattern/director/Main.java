package org.example.creational.builderPattern.director;
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

interface CarBuilder {
    CarBuilder setMake(String make);
    CarBuilder setModel(String model);
    CarBuilder setYear(int year);
    CarBuilder setHasSunroof(boolean hasSunroof);
    CarBuilder setHasNavigation(boolean hasNavigation);
    Car build();
}

class CarBuilderImpl implements CarBuilder {
    private String make;
    private String model;
    private int year;
    private boolean hasSunroof;
    private boolean hasNavigation;

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

class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructStandardCar() {
        return builder.setMake("Tesla")
                .setModel("Model S")
                .setYear(2022)
                .setHasSunroof(false)
                .setHasNavigation(true)
                .build();
    }

    public Car constructPremiumCar() {
        return builder.setMake("Mercedes")
                .setModel("S-Class")
                .setYear(2022)
                .setHasSunroof(true)
                .setHasNavigation(true)
                .build();
    }
}

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilderImpl();
        CarDirector director = new CarDirector(builder);

        Car standardCar = director.constructStandardCar();
        System.out.println("Standard Car:");
        System.out.println("Make: " + standardCar.getMake());
        System.out.println("Model: " + standardCar.getModel());
        System.out.println("Year: " + standardCar.getYear());
        System.out.println("Has Sunroof: " + standardCar.hasSunroof());
        System.out.println("Has Navigation: " + standardCar.hasNavigation());

        System.out.println();

        Car premiumCar = director.constructPremiumCar();
        System.out.println("Premium Car:");
        System.out.println("Make: " + premiumCar.getMake());
        System.out.println("Model: " + premiumCar.getModel());
        System.out.println("Year: " + premiumCar.getYear());
        System.out.println("Has Sunroof: " + premiumCar.hasSunroof());
        System.out.println("Has Navigation: " + premiumCar.hasNavigation());
    }
}
