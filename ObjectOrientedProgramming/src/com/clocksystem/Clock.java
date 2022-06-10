package com.clocksystem;

public class Clock {

    protected String name;

    protected Time time;

    public Clock(String name) {
        this.name = name;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void showTime() {
        System.out.println("[" + name + "]" + time.getHour() + ":" + time.getMinutes());
    }
}
