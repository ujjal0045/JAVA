package Basis;

import java.util.Scanner;

public class areaOfSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int areaOfSquare = (int) (a*a);
    System.out.println(areaOfSquare);
    sc.close();
  }
}
