package class_school.teststatic;

public class Car {
  private String model;
  private String color;
  private int speed;

  // 상수란? : 한번 초기화되면 절대 값을 변경할 수 없는 값
  // 자바에서는 상수를 어떻게 만드나? final keyword 사용.
  // 자바에서 상수는 static으로 만드는 것이 바람직. 
  // 상수는 대문자로 사용하는 것이 관례
  // 상수는 일반적으로 public으로 선언한다. 
  // public static final int MAX_SPEED = 350;
  public static final int MAX_SPEED;
  static 
  {
    MAX_SPEED = 350;
    System.out.println("MAX_SPEED가 초기화되었습니다. ");
  }

  {
    model = "그랜저";
    color = "흰색";
  }

  // 자동차의 시리얼 넘버
  private int id;
  // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자. 
  private static int numbers = 0;

  // static method가 맞나? instance method로 구현하는 것이 맞나? : static
  // static method는 instance method를 호출할 수 있다 없다? : 없다. 
  public static int getNumbers() {
    // print();
    return numbers;
  }

  // instance method : instance가 생성되어야만 존재하는 메소드
  public void print() {
    System.out.println("Hi~~~~~~~");
  }

  // 생성자 
  /* id = ++numbers ; */
  public Car(String argModel, String argColor, int argSpeed ){
    id = ++numbers;
    model = argModel;
    color = argColor;
    speed = argSpeed;
    // max_speed = 500;
  }


  public static void main(String[] args) {
    Car c1, c2, c3;
    c1 = new Car("s600", "white", 80);
    c2 = new Car("E500", "blue", 20);
    c3 = new Car("E300", "gray", 160);

    // System.out.println("생성된 자동차 수:" + c1.getNumbers());
    // System.out.println("생성된 자동차 수:" + c2.getNumbers());
    // System.out.println("생성된 자동차 수:" + c3.getNumbers());
    System.out.println("생성된 자동차 수:" + Car.getNumbers());

    // 자바의 수학관련 라이브러리 클래스는 정적 메서드를 이용
    double d = Math.sqrt(9);
    System.out.println("9의 제곱근: " + d);

    System.out.println(Car.MAX_SPEED);
  }
}
