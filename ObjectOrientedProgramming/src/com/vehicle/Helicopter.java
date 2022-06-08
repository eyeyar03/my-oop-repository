package com.vehicle;

public class Helicopter extends Vehicle implements Flyable {

    @Override
    public void fly() {
        System.out.println("Helicopter is flying...");

    }

    @Override
    public void preno() {
        System.out.println("Helicopter is breaking...");
    }
}
