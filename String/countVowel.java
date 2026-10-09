package String;

import java.util.Scanner;

public class countVowel {
  // count lowercase Vowels
  public static void CountVowelLowercase(String s ){
    int c =0;
    for(int i=0;i<s.length();i++){
      if( s.charAt(i) == 'a' ||  s.charAt(i) == 'e' || s.charAt(i) == 'i' ||  s.charAt(i) == 'o' ||  s.charAt(i) == 'u' ){
        c++;
      }
    }
    System.out.println("Total count: " + c);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENter the string: ");
    String s = sc.nextLine();
    CountVowelLowercase(s);
    sc.close();
  }
}
