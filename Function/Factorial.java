package Function;

import java.util.Scanner;

public class Factorial {
  public static int fact(int n) {
    int fact = 1;
    for(int i=1;i<=n;i++){
      fact *= i;
    }
    return fact;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int f = fact(n);
    System.out.println("Factorial: "+ f);
    sc.close();
  }
}
