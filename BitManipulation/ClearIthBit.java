public class ClearIthBit {
  public static int checkClearIthBit(int n,int i){
    int bitMask = ~(1<<i);
    return n&bitMask;
  }
  public static void main(String[] args) {
    System.out.println("answer: " + checkClearIthBit(10, 1));
  }
}
