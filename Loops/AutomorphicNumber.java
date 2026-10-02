package Loops;

import java.util.*;



public class AutomorphicNumber {
  public static int count(int n){
    int c=0;
    while (n > 0) {
      c++;
      n /= 10;
    }
    return c;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int  n = sc.nextInt();
    int squareNo = n * n;
    int multiplyNum =  (int) Math.pow(10, count(n));
    if(  (squareNo % multiplyNum)  == n){
      System.out.println("Automorphic Number: " + n);
    } else{
      System.out.println("Not an Automorphic number");
    }

    sc.close();
  }
}
