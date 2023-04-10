package class_school.test;

public class Car {
  private int speed;
  private String name;

  public Car() {
    System.out.println("속도는 " + speed);
  }

  // 인스턴스 초기화 블록(instance initialization block)
  {
    speed = 100;
  }

  public Car(String name) {
    this.name = name;
    System.out.println("속도는 " + speed);
  }
 

  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car("그랜져");
  }
}
