public class UpdateIthBit {
  public static int UpdateithhhBit(int n,int i,int val){
    if(val == 0){
      // clearf
      int bitMask = ~(1<<i);
      return n&bitMask;
    } else{
      //set
      int bitMask = 1<<i;
      return n|bitMask;
    }
  }
  public static void main(String[] args) {
    System.out.println("answer: "+ UpdateithhhBit(10,1,0));
    System.out.println("answer: "+ UpdateithhhBit(20,3,1));
  }
}
