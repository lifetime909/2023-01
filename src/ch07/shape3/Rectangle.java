package ch07.shape3;

public class Rectangle extends Shape {
    private int width, height;

    @Override
    public void draw() {
        System.out.println("사각형 그리기 메소드");
    }
}
