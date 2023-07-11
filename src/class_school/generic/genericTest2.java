package generic;

public class GenericTest2 {
  public static void main(String[] args) {
    // GenericPair 클래스 객체 2개 생성해서 값을 넣고 빼고 해보세요.
    GenericPair<String, Integer> gp = new GenericPair<>("홍길동", 20);
    String key = gp.getKey();
    int val = gp.getValue(); // auto unboxing

    // Generic 클래스의 타입 파라미터 값으로는 반드시 참조형 타입이 와야 한다. 
    // 기초자료형(primitive type)은 절대 올 수 없다. 
    //GenericPair<String, int> gp2 = new GenericPair<>("고길동", 30);
    // 타입 파라미터로 기초자료형의 배열은 올 수 있나? 
    int[] jumsus = {90, 87, 88, 78, 93};
    GenericPair<String, int[]> gp3 = new GenericPair<String,int[]>("1조 점수", jumsus);
  }
}
