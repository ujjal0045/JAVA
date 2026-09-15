package Loops;

import java.util.Scanner;

public class SumOfOddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    int OddSum = 0, EvenSum = 0;
    for(int i=0;i<=n;i++){
      if(i % 2 == 0){
        EvenSum += i;
      } else{
        OddSum += i;
      }
    }
    System.out.println("Sum of Odd number: "+ OddSum);
    System.out.println("Sum of Even Number: " + EvenSum);
    sc.close();
  }
}
