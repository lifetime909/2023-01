package class_school.objectclass;

import class_school.test.*;
public class CarTest{
    public static void main(String[] args) {
        // Car obj = new car();

        // Class classvar = obj.getClass();
        // System.out.println(Classvar.getName());

        // System.out.println("브랜드 : " + Car.brand + ", 모델 : " + Car.model);

        Car car1 = new Car("현대", "그랜져");
        Car car2 = new Car("현대", "그랜져");
        
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car1));
        
        Box box = new Box(10, 20, 30);
    }
}
