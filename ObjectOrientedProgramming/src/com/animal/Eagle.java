package com.animal;

public class Eagle extends Animal implements Flyable {

    @Override
    public void makeNoise() {
        System.out.println("ook!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
