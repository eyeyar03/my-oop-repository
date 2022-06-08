package com.shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle..");
    }
}
