public class clearLastIthBit {
  public static int calculateClearLastBit(int n,int i){
    int bitmask = ~0<<i;
    return n&bitmask;
  }
  public static void main(String[] args) {
    System.out.println(calculateClearLastBit(15, 2));
  }
}
