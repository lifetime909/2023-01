package ch05.math;

public class Math {
    int add(int x, int y) {
        return x + y;
    }

    int square(int i) {
        return i * i;
    }
    
    double square(double i) {    
        return i * i;
    }

    public static void main(String[] args) {
        int sum;
        Math math = new Math();
        sum = math.add(2, 3);
        System.out.println("2와 3의 합은 " + sum + "입니다.");
        sum = math.add(7, 8);
        System.out.println("7와 8의 합은 " + sum + "입니다.");
        
        System.out.println(math.square(10));
        System.out.println(math.square(3.14));

    }
}
