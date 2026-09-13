import java.util.*;
public class CheckPositiveOrNagetive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num >= 0){
      System.out.println("Positive number");
    } else {
      System.out.println("Nagetive number");
    }
    sc.close();
  }
}
