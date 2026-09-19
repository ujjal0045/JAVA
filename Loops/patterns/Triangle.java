package Loops.patterns;

public class Triangle {
  public static void pattern() {
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        int n = i + j;
        if( n % 2 == 0){
          System.out.print(1 + " ");
        } else{
          System.out.print(0 + " ");
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    pattern();
  }
}
