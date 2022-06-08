package com.shapes;

public class Square extends Quadrilateral implements Bouncable {

    public Square(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing square..");
    }

    @Override
    public void bounce() {
        System.out.println("Square is bouncing 4x..");
    }
}
