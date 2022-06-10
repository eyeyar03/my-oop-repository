package com.clocksystem;

public class ClockSystem {

    public static void main(String[] args) throws Exception {
        Time time1 = new Time(12, 30, 25, 100);
        Time time2 = new Time(14, 25, 23, 111);

        Clock clock = new Clock("Default Clock");
        clock.setTime(time1);
        clock.showTime();

        clock.setTime(time2);
        clock.showTime();

        Clock exactClock = new ExactClock("Exact Clock");
        exactClock.setTime(time1);
        exactClock.showTime();

        Clock japanClock = new JapanClock("Japan Clock");
        japanClock.setTime(time1);
        japanClock.showTime();

        Clock exactJapanClock = new ExactJapanClock("Exact Japan Clock");
        exactJapanClock.setTime(time1);
        exactJapanClock.showTime();
    }
}
