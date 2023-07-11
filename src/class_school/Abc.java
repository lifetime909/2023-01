class Animal {
  public void roar() {
    System.out.println("grrrrrrr!");
  }

  public void leg() {
    System.out.println("4 legs");
  }
  public void name () {
    System.out.println("이름을 입력해라");
  }
}

class Dog extends Animal {
  public void name () {
    System.out.println("Dog !!!");
  }
}
class Cat extends Animal {
  public void name () {
    System.out.println("Cat !!!");
  }
}
class Bird extends Animal {
  public void name () {
    System.out.println("Bird !!!");
  }
}


public class Abc {

  public void call(Object o) {
    ((Animal) o).name();
  }

  public static void main(String[] args) {
      Animal arrOfAnimal[] = new Animal[3];

      Dog d = new Dog();
        Abc obj = new Abc();
        obj.call(d);


  }
}
