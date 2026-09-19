package Function;

import java.util.Scanner;

public class sumOfN {
  public static int SumOfnNumber(int n){

    int sum =0;
    for(int i =1;i<=n;i++){
      sum += i;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int sum = SumOfnNumber(n);
    System.out.println("Sum of n number: "+ sum);
    sc.close();
  }
}
