package ch06.box;

public class BoxTest {
    public static void main(String[] args) {
        Box obj1 = new Box(10, 20, 50);
        Box obj2 = new Box(10, 30, 30);

        // Box larger = obj1.getLargerBox(obj1, obj2);
        // System.out.println("(" + larger.getWidth() + ", " + larger.getLength() + ", " + larger.getHeight() + ")");
    
        System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
    }
}
