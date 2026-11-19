package PracticeQuestion;

public class area {
  // here we use methond overloading when same name with different para
  // calculate circle
  void calculate(double r){
    System.out.println("Circle : " + 3.14*r*r);
  }
  void calculate(int l,int b){
    System.out.println("Rectangle: " + l*b);
  }
  void calculate(int side){
    System.out.println("Square: " +  side*side);
  }


  public static void main(String[] args) {
    area a = new area();
    // this one calculate for circle
    a.calculate(5.0);
    // this one is calculate for rectangle
    a.calculate(4, 6);
    // this one is calculated for square
    a.calculate(5);
  }
}
