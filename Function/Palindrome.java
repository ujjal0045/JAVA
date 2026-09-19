package Function;

import java.util.Scanner;

public class Palindrome {
  public static boolean isPalindrome(int n) {
    int temp = n,rev=0;
    while(n > 0){
      int r = n % 10;
      rev = (rev*10)+r;
      n /=10;
    }
    if(temp == rev){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(isPalindrome(n)){
      System.out.println("Palindrome number: " + n);
    } else{
      System.out.println("not an palindrome number: "+ n);
    }
    sc.close();
  }
}
