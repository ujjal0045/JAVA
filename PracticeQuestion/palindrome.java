package PracticeQuestion;

import java.util.*;

public class palindrome {
  public static void checkpalindrome(String str){
    String rev = "";
    for(int i=str.length()-1;i>=0;i--){
      rev += str.charAt(i);
    }
    if(str.equals(rev)){
      System.out.println("palindrome String");
    } else{
      System.out.println("Not an palindrome");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENter the words: ");
    String words = sc.nextLine();
    checkpalindrome(words);
    sc.close();
  }
}
