import java.util.*;

public class pass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    if(marks >= 33){
      System.out.println("Student is passed the exam");
    } else{
      System.out.println("Fail");
    }
    sc.close();
  }
}
