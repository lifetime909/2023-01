package ch07.polymorphism;

public class ShapeTest3 {
    public static void main(String[] args) {
        Rectangle rt = new Rectangle();
        Triangle tg = new Triangle();
        Circle cc = new Circle();

        // printLocation(rt);
        // printLocation(tg);
        // printLocation(cc);

        print(rt);
        print(tg);
        print(cc);
    }

    public static void printLocation(Shape shape) {
        System.out.println("x = " + shape.getX() + ", " + shape.getY());
    }

    public static void print(Object obj) {
        if (obj instanceof Shape) {
            printLocation((Shape) obj);
        } else {
            System.out.println("I can't handle this object!");
        }
    }
}
