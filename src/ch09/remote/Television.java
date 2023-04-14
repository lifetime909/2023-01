package ch09.remote;

public class Television implements RemoteControl {
    public void turnOn() {
        // 실제로 TV의 전원을 켜기 위한 코드가 들어 같다.
    }
    public void turnOff() {
        // 실제로 TV의 전원을 끄기 위한 코드가 들어 같다.
    }
    public static void main(String[] args) {
        Television t = new Television();
        t.turnOn();
        t.turnOff();
    }
}
