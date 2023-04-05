package ch06.arrayProc;

public class ArrayProcTest {
    public static void main(String[] args) {
        // int[] list = {1, 2, 3, 4, 5};
        // ArrayProc obj = new ArrayProc();

        // obj.increase(list);

        // for (int i = 0; i < list.length; i++) {
        //     System.out.println(list[i] + " ");
        // }

        int[] scores = new int[5];
        ArrayProc obj = new ArrayProc();
        obj.getValues(scores);
        System.out.println("평균은 = " + obj.getAverage(scores));
    }
}
