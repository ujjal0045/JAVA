package Basis;

import java.util.Scanner;

public class bill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter pencil prize: ");
    float pencil = sc.nextFloat();
    System.out.println("Enter Pen prize: ");
    float pen = sc.nextFloat();
    System.out.println("ENter your eraser prize: ");
    float eraser = sc.nextFloat();

    float totalBill = (float) (pencil+pen+eraser);
    System.out.println("Your total bill: "+totalBill);
    float totalWithGst = (float) ( totalBill+ (totalBill * 0.18));
    System.out.println("your total prize with gst: "+totalWithGst);
  }
}
