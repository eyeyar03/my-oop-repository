package com.shapes;

public abstract class Shape {

    private String name;

    private int numberOfSides;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract void draw();
}
