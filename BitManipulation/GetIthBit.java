public class GetIthBit {
  public static int checkGetIthBit(int n,int i){
    int bitMask = 1<<i;
    if((n&bitMask) != 0){
      return 1;
    } else{
      return 0;
    }
  }
  public static void main(String[] args) {
    System.out.println("Answer: " + checkGetIthBit(20, 3));
    System.out.println("Answer: " + checkGetIthBit(15, 2));
  }
}
