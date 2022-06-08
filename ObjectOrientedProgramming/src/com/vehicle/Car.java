package com.vehicle;

public class Car extends Vehicle implements Acceleratable {

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void preno() {
        System.out.println("Car is breaking...");
    }
}
