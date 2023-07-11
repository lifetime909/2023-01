
package anonymous;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class CallbackTest {
  public static void main(String[] args) {
    /*
     * javax.swing.Timer 클래스의 객체를 생성하기 위해서는
     * int 타입의 delay, javax.awt.event.ActionListener 인터페이스 타입의 객체를
     * 넘겨줘야 한다. 
     * 두 번째 인자인 저 객체를 넘겨주기 위해서는 아래의 두 가지 방법 중 하나를 사용
     * 하면 된다. 
     *   1. 저 인터페이스를 구현하는 클래스를 정의하고, 그 클래스의 객체를 생성해 넘겨준다. 
     *   2. 저 인터페이스를 구현하는 클래스를 무명클래스로 정의한다. 
     *      무명클래스 클래스 정의와 객체 생성이 하나의 문장으로 해결되는 것.
     */
    // ActionListener listener = new ActionListener() {
    //   @Override
    //   public void actionPerformed(ActionEvent e) {
    //     System.out.println("Beep from 무명클래스");
    //   }
    // };

    // Timer timer = new Timer(1000, listener);

    Timer timer = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Beep from Anonymous class");
      }
    });

    timer.start();
    // Beep from 무명클래스

    Scanner input = new Scanner(System.in);
    System.out.println("Press Enter to quit!");
    input.nextLine();
    input.close();
    System.out.println("프로그램을 종료합니다~!!");
  }
}
