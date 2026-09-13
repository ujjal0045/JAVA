import java.util.*;
public class checkFever {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double temp = sc.nextDouble();
    if(temp > 100){
      System.out.println("you have a high fever. COnsult with your doctor");
    } else{
      System.out.println("Don't have fever");
    }
  }
}
