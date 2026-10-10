package String;

import java.util.Arrays;

public class anagrams {
  // O(n^2)
  public static void checkAnagrams(String s1, String s2){
    if( s1.length() != s2.length() ) {
      System.out.println("the length of both string are not same so it is not an Anagrams");
      return;
    }
    boolean flag = false;
    for(int i = 0;i< s1.length();i++){
      for(int j =0;j<s2.length();j++){
        if(s1.charAt(i) == s2.charAt(j)){
          flag = true;
          break;
        }
      }
    }
    if(flag) {
      System.out.println("Anagrams String");
    } else{
      System.out.println("Not an Anagrams");
    }
  }
  // O(NLogN)
  public static void checkAna(String s1,String s2){
    if( s1.length() != s2.length() ) {
      System.out.println("the length of both string are not same so it is not an Anagrams");
      return;
    }
    char[] str1charArray = s1.toCharArray();
    char[] str2charArray = s2.toCharArray();
    // sort the char array
    Arrays.sort(str1charArray);
    Arrays.sort(str2charArray);
    // if the sorted char arrays are same or identical then the strings areanagram
    boolean result = Arrays.equals(str1charArray, str2charArray);

    if(result){
      System.out.println("Anagrams String");
    } else{
      System.out.println("Not an Anagrams");
    }
  }
  public static void main(String[] args) {
    String s1 = "race1";
    String s2 = "care1";
    checkAna(s1, s2);
  }
}
