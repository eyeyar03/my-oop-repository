package com.clocksystem;

public class JapanClock extends Clock {

    public JapanClock(String name) {
        super(name);
    }

    @Override
    public void showTime() {
        System.out.println(getTime());
    }

    protected String getTime() {
        return "[" + name + "]" + (time.getHour() + 2) + ":" + time.getMinutes();
    }
}
