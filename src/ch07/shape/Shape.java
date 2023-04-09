package ch07.shape;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        System.out.println("Shape()");
        this.x = x;
        this.y = y;
    }

    public Shape() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print() {
        System.out.println("X 좌표 : " + x + ", Y 좌표 : " + y);
    }
}
