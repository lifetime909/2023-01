package ch06.localClass;

public class LocalInner {
    private int data = 30;

    void display() {
        final String msg = "현재의 데이터 값은 ";
        int localVariable = 100;
        // localVariable = 200; => error
        // 기본설정으로 수정하기 전에는 final로 설정되 호출할수 있지만
        // 수정을 하면 error가 뜬다.

        class LocalClass {
            void printMsg() {
                System.out.println(msg + data);
                System.out.println("local Variable : " + localVariable);
            }
        }

        LocalClass obj = new LocalClass();
        obj.printMsg();
    }

    public static void main(String[] args) {
        LocalInner obj = new LocalInner();
        obj.display();
    }
}
