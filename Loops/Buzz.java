package Loops;

import java.util.Scanner;

public class Buzz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    if(n % 10 == 7 || n % 7 == 0){
      System.out.println("Buzz Number");
    }
    else {
      System.out.println("Not an Buzz number");
    }
    sc.close();
  }
}
