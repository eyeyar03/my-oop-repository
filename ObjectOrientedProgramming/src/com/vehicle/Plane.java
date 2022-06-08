package com.vehicle;

public class Plane extends Vehicle implements Acceleratable, Flyable {

    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }

    @Override
    public void accelerate() {
        System.out.println("Plane is accelerating...");
    }

    @Override
    public void preno() {
        System.out.println("Plane is breaking....");
    }
}
