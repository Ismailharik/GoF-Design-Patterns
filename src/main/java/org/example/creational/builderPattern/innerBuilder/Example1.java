package org.example.creational.builderPattern.innerBuilder;

class Car{
    private String make;
    private String model;
    private int year;
    private boolean hasSunroof;
    private boolean hasNavigation;

    public  Car(Builder builder){
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.hasSunroof = builder.hasSunroof;
        this.hasNavigation = builder.hasNavigation;

    }
    public static class Builder{
        private String make;
        private String model;
        private int year;
        private boolean hasSunroof;
        private boolean hasNavigation;

        public Builder(String make , String model,int year ){
            this.make = make;
            this.model = model;
            this.year = year;
        }
        public Builder(){}

        public Builder setHasNavigation(boolean hasNavigation) {
            this.hasNavigation = hasNavigation;
            return this;
        }

        public Builder setHasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hasSunroof=" + hasSunroof +
                ", hasNavigation=" + hasNavigation +
                '}';
    }
}

public class Example1 {

    public static void main(String[] args) {
        Car car1 = new Car.Builder().setMake("Range").
                setModel("2022").
                setHasNavigation(true).
                setHasSunroof(true).
                setYear(2023).
                build();

        System.out.println(car1.toString());
    }
}
