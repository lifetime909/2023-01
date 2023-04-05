package ch06.time;

public class Time {
    private int hour; // 0 ~ 23
    private int minute; // 0 ~ 59
    private int second; // 0 ~ 59

    public Time() {
        this(0, 0, 0);
    }

    public Time(int h, int m, int s) {
        this.hour = h >= 0 && h < 24 ? h : 0;
        this.minute = m >= 0 && m < 60 ? m : 0;
        this.second = s >= 0 && s < 60 ? s : 0;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
