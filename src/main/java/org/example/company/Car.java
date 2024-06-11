package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = Boolean.TRUE;
        this.wheels = 4;
    }

    /*
        System.out.println("Class Name: " + getClass().getSimpleName());
        kod okunurluğu açısından buna extract yapabiliriz: kendimiz bir değişken ismi veriyoruz
        printSimpleName
     */

    private void printSimpleName(){
        System.out.println("Class Name: " + getClass().getSimpleName());
    }


    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }

    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake() {
        printSimpleName();
        return "the car is braking";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                '}';
    }
}
