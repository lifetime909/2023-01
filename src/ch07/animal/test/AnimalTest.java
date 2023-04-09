package ch07.animal.test;

import ch07.animal.*;

public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        // lion.eat(); #error
        // lion.sleep(); #error
        lion.roar();
        System.out.println("\n------------------------------------------\n");
        Eagle eagle = new Eagle();
        // eagle.eat(); #error
        // eagle.sleep(); #error
        eagle.fly();
    }

}
