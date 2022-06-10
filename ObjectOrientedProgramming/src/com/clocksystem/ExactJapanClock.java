package com.clocksystem;

public class ExactJapanClock extends JapanClock {

    public ExactJapanClock(String name) {
        super(name);
    }

    @Override
    public void showTime() {
        System.out.println(getTime() + "." + time.getMilliseconds());
    }
}
