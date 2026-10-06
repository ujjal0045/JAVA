package Function.NumberBasedQuestion;

import java.util.Scanner;

public class FactorialNumber {
  public static int factorial(int n){
    int sum =1;
    for(int i=1;i<=n;i++){
      sum *= i;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number: ");
    int n = sc.nextInt();
    System.out.println("Factorial Number : " + factorial(n));
    sc.close();
  }
}
