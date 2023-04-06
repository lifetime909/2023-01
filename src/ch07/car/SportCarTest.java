package ch07.car;

public class SportCarTest {
    public static void main(String[] args) {
        SportCar sc = new SportCar();
        sc.setSpeed(150);
        sc.setTurbo(true);
        
        System.out.println("speed [ " + sc.getSpeed() + " ], turbo [ " + sc.isTurbo() + " ]");
    }
}
