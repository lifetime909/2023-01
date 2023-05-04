package class_school.implement;

public class Car implements Comparable{
    private String brand;
    private String model;
    private int speed;
    private int price;
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
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Car() {
        this.brand = "unknown";
        this.model = "unknown";;
        this.speed = 0;
        this.price = 0;
    }
    public Car(String brand, String model, int speed, int price) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }
    @Override
    public int compareTo(Comparable anotherVal) {
        Car car = (Car)anotherVal;
        int aprice = car.getPrice();
        if(price == aprice){
            return 0;
        }else if (price > aprice) {
            return 1;
        }else{
            return -1;
        }
    }
    public String toString() {
        return "[브랜드 : " + brand + ", 모델 : " + model + ", speed : " + speed + ", price : " + price + "]";
    }

}
