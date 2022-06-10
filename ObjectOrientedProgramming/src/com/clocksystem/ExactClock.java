package com.clocksystem;

public class ExactClock extends Clock {

    public ExactClock(String name) {
        super(name);
    }

    @Override
    public void showTime() {
        System.out.println("[" + name + "]" + time.getHour() + ":" + time.getMinutes() + ":" + time.getSeconds() + ":" + time.getMilliseconds());
    }
}
