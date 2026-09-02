package Basis;

import java.util.Scanner;

public class areaOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your radis: ");
    float a = sc.nextFloat();
    float sum = 3.14f * a*a;
    System.out.println("Sum: "+sum);
    sc.close();
  }
}
