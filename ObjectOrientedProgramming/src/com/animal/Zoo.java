package com.animal;


public class Zoo {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Flyable bird = new Bird();
        Eagle eagle = new Eagle();
        cat.makeNoise();
        dog.makeNoise();
        eagle.makeNoise();

        Cage cage = new Cage();
        cage.cage(bird);
        cage.cage(eagle);
        cage.free();
    }
}
