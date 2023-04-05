package ch06.car;

public class Car2 {
    private String model;
    private String color;
    private int speed;

    private int id;
    // static int numbers = 0;
    private static int numbers = 0;

    public Car2 (String m, String c, int s) {
        model = m;
        color = c;
        speed = s;
        id = ++numbers;
    }

    public static int getNumbers() {
        return numbers;
    }
}
