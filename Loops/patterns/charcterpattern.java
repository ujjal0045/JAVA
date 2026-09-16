package Loops.patterns;

public class charcterpattern {
  public static void main(String[] args) {
    char word = 'A';
    for(int i =1;i<=4;i++){
      for(int j = 1;j<=i;j++){
        System.out.print( word++ + " ");
      }
      System.out.println();
    }
  }
}
