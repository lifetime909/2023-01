package anonymous;

import interfacetest.LgTV;
import interfacetest.RemoteControl;
import interfacetest.SamsungTV;

public class CallbackTest2 {
  public void remoteControl(RemoteControl rc) {
    rc.turnOn();
    System.out.println("리모트 컨트롤 메소드 호출완료!");
  }

  public static void main(String[] args) {
    CallbackTest2 cb = new CallbackTest2();
    // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오. 
    // 1. 변수 사용해서 전달해보고
    // 2. 변수 사용하지 않고 전달해보고.
    // 화면에는 "파나소닉 테레비가 켜졌습니다." 
    // PanasonicTV tv = new PanasonicTV();
    // cb.remoteControl(tv);
    cb.remoteControl(new PanasonicTV());
    cb.remoteControl(new SamsungTV());
    cb.remoteControl(new LgTV());

    cb.remoteControl(new RemoteControl() {
      public void turnOff() {
        System.out.println("No Brand TV를 끕니다.");
      }
      public void turnOn() {
        System.out.println("No Brand TV를 켭니다.");
      }
    });
  }
}

class PanasonicTV implements RemoteControl {

  @Override
  public void turnOn() {
    System.out.println("파나소닉 티비를 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("파나소닉 티비를 끕니다.");
  }

}
