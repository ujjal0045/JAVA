package Loops;

public class Reverse {
  public static void main(String[] args) {
    int n = 10889;
    int rev =0;
    while(n>0){
      int digit = n % 10;
      rev = rev *10 + digit;
      n /=10;
   }
   System.out.println("reverse number: "+rev);
  }
}
