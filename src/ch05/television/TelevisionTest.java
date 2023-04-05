package ch05.television;

public class TelevisionTest {
    public static void main(String[] args) {
        Television my = new Television();
        Television you = new Television();
    
        my.channel = 7;
        my.volume = 9;
        my.isOn = true;
        my.setChannel(11);
        int mych = my.getChannel();
        
        you.channel = 9;
        you.volume = 12;
        you.isOn = true;
        my.setChannel(2);
        int youch = you.getChannel();
       
        // System.out.println("텔레비전의 채널은 " + my.channel + "이고 볼륨은 " + my.volume + "입니다.");
        // System.out.println("텔레비전의 채널은 " + you.channel + "이고 볼륨은 " + you.volume + "입니다.");
    
        my.print();
        System.out.println("현재 채널은 " + mych + "입니다.");
        you.print();
        System.out.println("현재 채널은 " + youch + "입니다.");
    }
    
}
