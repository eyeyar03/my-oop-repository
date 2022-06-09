package com.animal;

public class Bird extends Animal implements Flyable {

    @Override
    public void makeNoise() {
        System.out.println("tweet!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
