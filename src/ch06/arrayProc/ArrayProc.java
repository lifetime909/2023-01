
package ch06.arrayProc;

import java.util.Scanner;

public class ArrayProc {
    void increase(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    public void getValues(int[] array) {
        Scanner scan = new Scanner(System.in);
        System.out.println(array.length + "개의 성적을 입력하세요.");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "번째 성적을 입력하시오 : ");
            array[i] = scan.nextInt();
        }
    }

    public double getAverage (int[] array) {
        double total = 0;
        for (int i = 0 ; i < array.length ; i++){
            total += array[i];
        }

        return total/array.length;
    }
}