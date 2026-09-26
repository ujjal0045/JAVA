package Array;

import java.util.Scanner;

public class Simple {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int numbers[] ={1,2,3};
    // String fruits[] = {"Apple","Mango"};
    int marks[] = new int[100];

    for(int i=0;i<=5;i++){
      marks[i] = sc.nextInt();
    }
    for(int i=0;i<=5;i++){
      System.out.println(marks[i]);
    }
    sc.close();
  }
}
