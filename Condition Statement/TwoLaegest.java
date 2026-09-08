import java.util.Scanner;

public class TwoLaegest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first data: ");
        int a = sc.nextInt();
        System.out.print("Enter the second data: ");
        int b = sc.nextInt();
        if(a>b){
          System.out.println("First number is greater then sencond.:" + a);
        }
        else{
          System.out.println("Second number is largest: "+b);
        }
        sc.close();
    }
}