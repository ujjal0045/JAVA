package Array;

public class BinarySearch {
  public static boolean search(int n[],int item){
    int left = 0,right=n.length-1;
    while(left<= right){
      int mid = (right + left) / 2;
      System.out.println(mid);
      if(n[mid] == item){
        return true;
      }
      else if(item < n[mid]){
        right = mid -1;
      } else{
        left = mid +1;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int arr[] = {2,4,6,8,10,12,14,16,18};
    int key = 12;
    boolean check =  search(arr,key);
    if(check){
      System.out.println("Founded");
    } else{
      System.out.println("false");
    }
  }
}
