package ch07.shape3;

public abstract class Shape {
    private int x;
    private int y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}
