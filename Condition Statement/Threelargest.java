import java.util.Scanner;

public class Threelargest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c){
            System.out.println("FIrst number is largest: "+a);
        } else if(b>a && b>c){
            System.out.println("Second number is largest: "+b);
        } else{
            System.out.println("Third number is largest: "+c);
        }
    sc.close();
  }
}
