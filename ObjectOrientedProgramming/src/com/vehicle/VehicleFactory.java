package com.vehicle;

public class VehicleFactory {

    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();
        Helicopter helicopter = new Helicopter();

        /**
        car.accelerate();
        car.preno();
        plane.accelerate();
        plane.fly();
        plane.preno();
        helicopter.fly();
        helicopter.preno();*/

        preno(car);
        preno(plane);
        preno(helicopter);

        accelerate(car);
        accelerate(plane);

        fly(plane);
        fly(helicopter);
    }

    public static void preno(Vehicle vehicle) {
        vehicle.preno();
    }

    public static void accelerate(Acceleratable acceleratable) {
        acceleratable.accelerate();
    }

    public static void fly(Flyable flyable) {
        flyable.fly();
    }
}
