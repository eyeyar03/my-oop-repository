package com.shapes;

public class ObtuseTriangle extends Shape implements Bouncable {

    @Override
    public void draw() {
        System.out.println("Drawing ObtuseTriangle..");
    }

    @Override
    public void bounce() {
        System.out.println("ObtuseTriangle is bouncing 3x..");
    }
}
