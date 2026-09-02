package Basis;

import java.util.Scanner;

public class Sumof2 {
  public static void main(String[] args) {
    // int a = 10;
    // int b = 5;
    // int sum = a + b;
    // System.out.println(sum);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first Number: ");
    int a = sc.nextInt();
    System.out.print("Enter your second Number: ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("Sum: "+sum);
    sc.close();
  }
}
