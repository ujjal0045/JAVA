package String;

import java.util.*;

public class Palindrome {
  public static void check(String s){
    for(int i=0;i<s.length()/2;i++){
      if(s.charAt(i) != s.charAt(s.length()-i-1)){
        System.out.println("not an palindrome");
        return;
      }
    }
    System.out.println("Palindrome string");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    check(str);
    sc.close();
  }
}
