package Function;



public class binaryToDecimal {
  public static int conversion(int n){
    String s = String.valueOf(n);
    int size = s.length();
    int sum = 0, p = 0;
    for(int i = 0;i<size;i++){
      if(s.charAt(i) == '1'){
        sum += Math.pow(2, p);
      }
      p++;
    }
    return sum;
  }
  public static void main(String[] args) {
    int n = 1111;
    int n1 = conversion(n);
    System.out.println(n1);
  }
}
