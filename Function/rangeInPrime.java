package Function;

import java.util.Scanner;

public class rangeInPrime {
  public static boolean checkPrime(int n) {
    if(n == 2) return true;
    for(int i = 2;i<= Math.sqrt(n);i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
  public static void primeRange(int n) {
    for(int i = 2;i<=n;i++){
      if(checkPrime(i)){
        System.out.println("prime number: "+ i);
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range for all the prime number: ");
    int n = sc.nextInt();
    primeRange(n);
    sc.close();
  }
}
