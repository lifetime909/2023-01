package ch07.animal;

public abstract class AbstractAnimal {
    public abstract void move();

    public void eat() {
        System.out.println("먹습니다.");
    }
}
