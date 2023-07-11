package lambda;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class CallbackTest {
  public static void main(String[] args) {
  
    // Timer timer = new Timer(1000, new ActionListener() {
    //   @Override
    //   public void actionPerformed(ActionEvent e) {
    //     System.out.println("Beep from Anonymous class");
    //   }
    // });
    // Timer 객체를 람다식을 이용해 생성하라. 
    // 1초마다 "Beep from lambda expression!"을 출력하도록.

    Timer timer = new Timer(1000, 
      (e)->{System.out.println("Beep from lambda expression!");});

    timer.start();
    // Beep from 무명클래스

    Scanner input = new Scanner(System.in);
    System.out.println("Press Enter to quit!");
    input.nextLine();
    input.close();
    System.out.println("프로그램을 종료합니다~!!");
  }
}
