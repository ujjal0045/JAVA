

public class SetIthBit {
  public static int checkGetIthBit(int n,int i){
    int bitMask = 1<<i;
    return n | bitMask;
  }
  public static void main(String[] args) {
    System.out.println("Answer: " + checkGetIthBit(20, 3));
  }
}
