package Loops;
import java.util.*;

public class GCD {
  public static int FindGCD(int a, int b){
    int max = a,min=b;

    if(a < b){
      max = b;
      min = a;
    }

    for(int i=1;i<=min;i++){
      if(a%i==0 && b % i == 0){
        max = i;
      }
    }
    return max;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    int n = FindGCD(a, b);
    System.out.println("Common factors: " + n);
    sc.close();
  }
}
