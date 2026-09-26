package Array;

public class largestnumber {
  public static int findLargest(int arr[]) {
    int lar = arr[0];
    // int lar = Integer.MIN_VALUE; 
    // iska mtlb ha smallest value store hoga 
    for(int i=0;i<arr.length;i++){
      if(lar <= arr[i]){
        lar = arr[i];
      }
    }
    return lar;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,7,4,5};
    int num = findLargest(arr);
    System.out.println(num);
  }
}
