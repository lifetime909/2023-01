package ch07.polymorphism;

public class ShapeTest2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();
        shapes[3] = new Cylinder();

        drawShapes(shapes);
    }

    public static void drawShapes(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
    }
}