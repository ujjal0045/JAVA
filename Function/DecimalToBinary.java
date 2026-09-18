package Function;

import java.util.Scanner;

public class DecimalToBinary {
  public static int convertDecToBin(int n){
    int sum = 0, place=1;
    while(n>0){
      int r = n % 2;
      sum = sum + (r * place);
      place *= 10;
      n /= 2;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number that convert into a binary number: ");
    int n = sc.nextInt();
    int binNum = convertDecToBin(n);
    System.out.println(binNum);
    sc.close();
  }
}
