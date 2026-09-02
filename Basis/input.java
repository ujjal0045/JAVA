package Basis;

import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // this is for single word only 
    String input = sc.next();
    System.out.println("Your answer: " + input);

    // this is multi word 
    input = sc.nextLine();
    System.out.println("Your answer2: " + input);
  }
}
