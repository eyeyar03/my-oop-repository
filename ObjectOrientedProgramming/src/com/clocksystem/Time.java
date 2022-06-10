package com.clocksystem;

public class Time {

    private int hour;

    private int minutes;

    private int seconds;

    private int milliseconds;

    public Time(int hour, int minutes, int seconds, int milliseconds) throws Exception {
        if(hour < 0) {
            throw new Exception("Time is invalid!");
        }

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.milliseconds = milliseconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMilliseconds() {
        return milliseconds;
    }
}
