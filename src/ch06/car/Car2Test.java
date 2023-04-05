package ch06.car;

public class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2("S600", "white", 150);
        Car2 c2 = new Car2("E500", "blue", 120);

        // System.out.println("지금까지 생산된 자동차 수 = " + Car2.numbers);
        
        System.out.println("지금까지 생산된 자동차 수 = " + Car2.getNumbers());
    }
}
