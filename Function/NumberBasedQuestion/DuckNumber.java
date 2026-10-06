package Function.NumberBasedQuestion;

import java.util.Scanner;

public class DuckNumber {
  public static void checkDuck(int n){
    if(n < 1){
      System.out.println("The number should be zero or nagetive");
      return;
    }
    while (n >0) {
      int r = n % 10;
      if(r == 0){
        System.out.println("Duck Number...");
        return;
      }
      n /= 10;
    }
    System.out.println("Not an dunk number");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number: ");
    int n = sc.nextInt();
    checkDuck(n);
    sc.close();
  }
}
