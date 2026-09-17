package Function;

import java.util.Scanner;

public class product {
  public static int multiply(int a, int b) {
    return a* b;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int pro = multiply(a, b);
    System.out.println("Product of 2 number: "+ pro);
    sc.close();
  }
}
