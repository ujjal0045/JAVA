package Function;

import java.util.Scanner;

public class BinomialCoefficient {
  public static int fact(int n) {
    int fact = 1;
    for(int i=1;i<=n;i++){
      fact *= i;
    }
    return fact;
  }
  // formula
  // n! / r! (n-r)!
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int n_fact = fact(n);
    int lower_fact = fact(r) * fact(n-r);
    System.err.println("Binomial COefficient: " + n_fact / lower_fact);
    sc.close();
  }
}
