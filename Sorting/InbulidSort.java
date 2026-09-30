package Sorting;
// this is for simple sorting
import java.util.Arrays;
// this is for reverse sorting
import java.util.Collections;


public class InbulidSort {
  public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void ascendingSorting(int arr[]){
    // sort full array
    Arrays.sort(arr);
    // sort given by you start to end

      // Arrays.sort(arr,1,3);

   printArr(arr);   
  }

  public static void descendingSorting(int arr[]){
    Integer arr1[] = new Integer[arr.length];
    for(int i=0;i<arr.length;i++){
      arr1[i] = arr[i];
    }
    // simply sort in a reverse order
    Arrays.sort(arr1,Collections.reverseOrder());

    // if we need to reverse sort in particular index to index then
    // Arrays.sort(arr1,0,3,Collections.reverseOrder());

    for(int i=0;i<arr.length;i++){
      arr[i] = arr1[i];
    }
    printArr(arr);
  }

  public static void main(String[] args) {
    
    int arr[] = {5,3,7,8,2,1,9};
    // ascendingSorting(arr);
    descendingSorting(arr);
  }
}
