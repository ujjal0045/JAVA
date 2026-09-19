package Loops.patterns;

public class HollowRectangle {
  public static void pattern(){
    for(int i=1;i<=4;i++){
      for(int j=1;j<=5;j++){
        if(i == 1 || i == 4 || j == 1 || j == 5){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  } {
    
  }
  public static void main(String[] args) {
    pattern();
  }
}
