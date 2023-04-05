package ch06.test;

public class Test {
    int value = 0 ;
    public void increase(int a) {
        a = a + 1;
    }

    public void increase (Test obj) {
        obj.value = obj.value + 1;
    }
    

    public static void main(String[] args) {
        Test obj = new Test();
        int x = 10;
        obj.increase(x);
        System.out.println( "x = " + x);

        System.out.println("obj.value - " + obj.value);
        obj.increase(obj);
        System.out.println("obj.value - " + obj.value);
    }
}
