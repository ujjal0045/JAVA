package Sorting;

public class countingSort {
  public static void sorting(int arr[]){
    int largest = arr[0];
    for(int i=0;i<arr.length;i++){
      largest = Math.max(largest, arr[i]);
    }
    int freq[] = new int[largest+1];
    for(int i=0;i< arr.length;i++){
      freq[arr[i]]++;
    }
    // sorting 
    int j=0;
    for(int i=0;i<freq.length;i++){
      while(freq[i] > 0){
        arr[j] = i;
        j++;
        freq[i]--;
      }
    }
  }
  public static void main(String[] args) {
    int arr[] = {1,4,1,3,2,4,3,6,7};
    sorting(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + "  ");
    }
  }
}
