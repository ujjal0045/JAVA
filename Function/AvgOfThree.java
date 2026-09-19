package Function;

import java.util.Scanner;

public class AvgOfThree {

  public static int AvgOfThreeNo(int a,int b,int c){
    return (a+b+c) / 3;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    System.out.print("Enter the third number: ");
    int c = sc.nextInt();
    int avg = AvgOfThreeNo(a, b, c);
    System.out.println(avg);
    sc.close();
  }
}
