package Sorting;

public class insertionSort {
  public static void sorting(int arr[]){
    for(int i=1;i<arr.length;i++){
      int cur = arr[i];
      int prev = i-1;
      while(prev>=0 && arr[prev] > cur){
        arr[prev+1] = arr[prev];
        prev--; 
      }
      arr[prev+1] =cur;
    }
  }
  public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    sorting(arr);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
