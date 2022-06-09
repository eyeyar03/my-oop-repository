package com.animal;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    private List<Flyable> flyingAnimals = new ArrayList<>();

    public void cage(Flyable flyingAnimal) {
        System.out.println("Caging " + Flyable.class);
        flyingAnimals.add(flyingAnimal);
    }

    public void free() {
        for(Flyable flyable : flyingAnimals) {
            flyable.fly();
        }
    }
}
