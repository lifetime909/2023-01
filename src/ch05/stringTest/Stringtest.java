package ch05.stringTest;

public class Stringtest {
    public static void main(String[] args) {
        String proverb = "A barking dog"; //new 연산자 생략
        String s1, s2, s3, s4; //참조변수로서 메소드에서 변환된 참조값을 받는다.

        System.out.println("문자열의 길이 = " + proverb.length());

        s1 = proverb.concat(" never Bites!"); // 문자열 결합
        s2 = proverb.replace("B", "b");       //문자 치환
        s3 = proverb.substring(2, 5);         //문자열 부분 추출
        s4 = proverb.toUpperCase();           //대문자로 변환

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
