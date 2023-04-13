package class_school.objectclass;

public class Car {
    String brand;
    String model;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public Car() {
        this("Unknown", "Unknown");
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null) return false;
        //obj가 car 클래스의 인스턴스가 아니면 바로 false를 반환하자.
        // 자바에는 이 목적으로 사용할 수 있는 연산자가 있다.
        //instanceof가 있다.
        //연산자 사용 예 : 3 + 4, +(3, 4) X
        if (obj instanceof Car == false) return false;

        // obj는 car 클래스의 객체라 가정한다.
        // 그래야, Car 클래스의 인스턴스의 brand, model 멤버에 접근할 수있다.
        // 하햫 형변환
        return this.brand.equals(((Car)obj).brand) && this.model.equals(((Car)obj).model);
    }
}
