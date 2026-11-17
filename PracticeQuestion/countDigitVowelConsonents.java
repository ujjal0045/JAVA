package PracticeQuestion;

import java.util.*;

public class countDigitVowelConsonents {

  public static void CountEverthing(String word){
    int v =0,c=0,d=0;
    for(int i=0;i<word.length();i++){
      char ch = word.charAt(i);
      if(ch >= '0' && ch <= '9'){
        d++;
      } else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <='Z'){
          if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u' || ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
          v++;
          } else{
            c++;
          }
      }
    }
    System.out.println("vowel: " + v);
    System.out.println("Consonants: " + c);
    System.out.println("Digits: " + d);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENter the words: ");
    String words = sc.nextLine();
    CountEverthing(words);
    sc.close();
  }
}
