package ch06.circle;

public class Circle {
    private int radius;
    private Point center;

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    public String toString() {
        return "Circle [ radius = " + radius + ", center = " + center + "]";
    }
}
