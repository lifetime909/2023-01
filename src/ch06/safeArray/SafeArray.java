package ch06.safeArray;

public class SafeArray {
    private int[] array;
    public final int length;

    public SafeArray(int size) {
        array = new int[size];
        length = size;
    }

    public int get(int index) {
        if (index >= 0 && index < length) {
            return array[index];
        }

        return -1;
    }

    public void put(int index, int value) {
        if (index >= 0 && index < length){
            array[index] = value;
        }else {
            System.out.println("잘못된 인덱스 " + index + "입니다.");
        }
    }
}
