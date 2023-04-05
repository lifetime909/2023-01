package ch06.television;

public class Television {
    int channel; // 채널번호
    int volume ; //볼륨
    boolean isOn; //전원상태

    Television(int channel, int volume, boolean whatON) {
        this.channel = channel;
        this.volume = volume;
        this.isOn = whatON;
    }
    
    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }

    public static void main(String[] args) {
        Television myTV = new Television(7, 10, true);
        myTV.print();
        
        Television yourTV = new Television(11, 20, true);
        yourTV.print();
    }
}
