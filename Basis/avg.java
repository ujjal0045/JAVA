package Basis;

import java.util.Scanner;

public class avg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first Number: ");
    int a = sc.nextInt();
    System.out.print("Enter your second Number: ");
    int b = sc.nextInt();
    System.out.print("Enter your third Number: ");
    int c = sc.nextInt();

    int avg = (int) (a+b+c) / 3;

    System.out.println(avg);

    sc.close();
  }
}
