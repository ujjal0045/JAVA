public class checkpowerornot {
 public static boolean checkPowerof2(int n){
    return (n&(n-1)) == 0;
  }
  public static void main(String[] args) {
    if(checkPowerof2(8)){
      System.out.println("Valid power...");
    } else{
      System.out.println("not valid ");
    }
  }
}
