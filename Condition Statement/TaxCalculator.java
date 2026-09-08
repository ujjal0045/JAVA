import java.util.Scanner;

public class TaxCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long income = sc.nextInt();
    int tax;
    if(income < 500000){
      tax = 0;
    } else if(income < 1000000){
      tax = 10;
    } else{
      tax = 30;
    }
    System.out.println("Your tax is "+tax+"your salart is: "+income);
    sc.close();
  }
}
