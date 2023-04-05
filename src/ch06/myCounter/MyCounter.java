package ch06.myCounter;

public class MyCounter {
    private int counter;

    MyCounter() {
        counter = 1;
    }
    
    MyCounter(int value) {
        counter = value;
    }

    public void increase() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        // MyCounter cntObj1 =new MyCounter();
        // MyCounter cntObj2 =new MyCounter();
        
        // cntObj2.increase();
        
        MyCounter cntObj1 =new MyCounter(100);
        MyCounter cntObj2 =new MyCounter(200);

        System.out.println("cntObj1의 counter : " + cntObj1.getCounter());
        System.out.println("cntObj2의 counter : " + cntObj2.getCounter());
    }
}
