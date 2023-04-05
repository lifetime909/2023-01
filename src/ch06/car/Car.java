package ch06.car;

public class Car {
    private int speed;

    Car() {
        System.out.println("속도는 " + speed);
    }

    {
        speed = 100;
    }

    public String toString() {
        return "Car [speed = " + speed + "]";
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
    }
}
