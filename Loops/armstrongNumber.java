package Loops;

import java.util.Scanner;

public class armstrongNumber {


  public static int count(int n){
    int c=0;
    while(n>0){
      c++;
      n /= 10;
    }
    return c;
  }
  public static boolean isArmstrong(int n){
    int c = count(n);
    int temp = n, sum = 0;
    while(temp > 0){
      int rem = temp % 10;
      sum += Math.pow(rem, c);
      temp /= 10;
    }
    if(n == sum) return true;
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    if(isArmstrong(n)){
      System.out.println("Armstrong Number: " + n);
    } else{
      System.out.println("Not an ArmStrong Number: " + n);
    }
    sc.close();
  }
}
