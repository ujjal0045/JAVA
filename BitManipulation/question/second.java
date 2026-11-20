package question;

public class second {
  public static void main(String[] args) {
    int a = 9,b=6;
    System.out.println("a: " + a + "b: " + b);
    a = a ^b;
    b = a ^b;
    a = a ^ b;
    System.out.println("a: " + a + "b: " + b);
  }
}
