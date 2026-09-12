import java.util.*;
public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number: ");
    int a = sc.nextInt();
    System.out.println("enter the second number: ");
    int b = sc.nextInt();
    System.out.println("Enter your choice... ");
    System.out.println("1. Addition ");
    System.out.println("2. Subtraction ");
    System.out.println("3. Division ");
    System.out.println("4. Multiplication ");
    int task = sc.nextInt();
    switch (task) {
      case 1:
        System.out.println("Addition: " + (a+b));
        break;
      case 2:
        System.out.println("Subtraction: " + (a-b));
        break;
      case 3:
        System.out.println("Division: " + (a/b));
        break;
      case 4:
        System.out.println("Multiplication: " + (a*b));
        break;

      default:
        System.out.println("Enter the valid number");
        break;
    }
    sc.close();
  }
}
