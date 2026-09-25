package Loops.patterns;

public class diamond {
  public static void pattern(int n){
    int count = 1;
    for(int i=1;i<=n;i++){
      for(int k=1;k<=n-i;k++){
        System.out.print(" ");
      }
      for(int j=1;j<=count;j++){
        System.out.print("*");
      }
      count += 2;
      System.out.println();
    }
    count-=2;
    // miror
    for(int i=1;i<=n;i++){
      for(int k=1;k<i;k++){
        System.out.print(" ");
      }
      for(int j=1;j<=count;j++){
        System.out.print("*");
      }
      count-=2;
      System.out.println();
    }
  }
  public static void main(String[] args) {
    pattern(4);
  }
}
