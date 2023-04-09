package ch07.shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public void draw() {
        System.out.println("(" + getX() + ", " + getY() + ") 위치에 가로 : " + width + ", 세로 : " + height);
        // getX(), getY(){public} 말고 x, y{private}로 작접 접근시 error
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        System.out.println("Rectangle()");
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }
}