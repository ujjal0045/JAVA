package Array;

public class reverse {
  public static void reverseOrder(int n[]) {
    int l = 0,r = n.length-1;
    while(l<=r){
      int temp = n[l];
      n[l] = n[r];
      n[r] = temp;
      l++;
      r--;
    }
  }
  public static void main(String[] args) {
    int n[] = {2,4,6,8,10};
    reverseOrder(n);
    for(int i=0;i<n.length;i++){
      System.out.print(n[i] + " ");
    }
    System.out.println();
  }
}
