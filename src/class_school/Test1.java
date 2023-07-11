public class Test1 {
  public static void main(String[] args) {
    String a = new String("조현준");
    String b = "조현준";
    String c = new String("김현");
    System.out.println(a == b);
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }
}
