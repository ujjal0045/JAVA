package Basis;

import java.util.Scanner;

public class productof2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first Number: ");
    int a = sc.nextInt();
    System.out.print("Enter your second Number: ");
    int b = sc.nextInt();
    int p = a * b;
    System.out.println("Product : "+p);
    sc.close();
  }
}
