package class_school.generic;

public class geneticTest {
    public static void main(String[] args) {
        genericBox<Integer> box1 = new genericBox<Integer>();
        box1.setValue(100);
        box1.setValue("hi")
        int val = box1.getValue();

        int val = box1.getValue();
        System.out.println(val);
    }
    
}
