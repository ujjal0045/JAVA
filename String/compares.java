package String;

public class compares {
  public static void main(String[] args) {
    String s1 = "ujjal";
    String s2 = "ujjal";
    String s3 = new String("ujjal");

    if(s1 == s2){
      System.out.println("equal1");
    }
    if(s1.equals(s3)){
      System.out.println("Equal 2");
    }

    }
  }

