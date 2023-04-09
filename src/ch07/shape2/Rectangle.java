package ch07.shape2;

public class Rectangle extends Shape {
    public Rectangle() {
        // 생성자는 묵시적을 부모클래스의 생성자를 호출한다.(super)
        // super("from Rectangle");
        System.out.println("Rectangle 생성자()");
    }

    public static void main(String[] args) {
        Rectangle rt = new Rectangle();
    }
}
