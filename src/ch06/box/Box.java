package ch06.box;

public class Box {
    private int width;
    private int length;
    private int height;
    private int volume;

    public int getVolume() {
        volume = width * length * height;
        return volume;
    }
    
    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;

        // volume = width * length * height;
    }

    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public int getLength() {return length;}

    public Box getLargerBox(Box box1, Box box2) {
        if  (box1.getVolume() > box2.getVolume()){
            return box1;
        }else {
            return box2;
        }
    }

    public boolean isSameBox(Box obj) {
        if(obj.getWidth() == width && obj.getLength() == length && obj.getHeight() == height) {
            return true;
        }return false;
    }

    // public static void main(String[] args) {
    //     Box box = new Box(20, 20, 30);

    //     System.out.println("상자의 부피는 " + box.getVolume() + "입니다.");
    // }
}
