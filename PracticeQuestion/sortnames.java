package PracticeQuestion;
import  java.util.*;

public class sortnames {
  public static void main(String[] args) {
    String str[] = {"Rahul","Ujjal","Keshaw","Akash"};

    Arrays.sort(str); // array will be sorted 
    System.out.println("Ascending order: " +  Arrays.toString(str));

    // deascending order
    Arrays.sort(str,Collections.reverseOrder());
    System.out.println("Descending order: " + Arrays.toString(str));
  }
}
