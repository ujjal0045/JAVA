package Sorting;

public class descendingSorting {

  public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void BubbleSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j] < arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    printArr(arr);
  }
  public static void SelectionSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      int minPos = i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[minPos] < arr[j]){
          minPos = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minPos];
      arr[minPos] = temp;
    }
    printArr(arr);
  }
  public static void InsertionSort(int arr[]){
    for(int i=1;i<arr.length;i++){
      int cur = arr[i];
      int prev = i-1;
      while(prev>=0 && arr[prev] < cur){
        arr[prev+1] = arr[prev];
        prev--; 
      }
      arr[prev+1] =cur;
    }
    printArr(arr);
  }

  public static void countingSort(int arr[]){
    int largest = arr[0];
    for(int i=0;i<arr.length;i++){
      largest = Math.max(largest, arr[i]);
    }
    int freq[] = new int[largest+1];
    for(int i=0;i<arr.length;i++){
      freq[arr[i]]++;
    }
    int j = arr.length-1;
    for(int i=0;i<freq.length;i++){
      while(freq[i] > 0){
        arr[j--] = i;
        freq[i]--;
      }
    }
    printArr(arr);
  }
  public static void main(String[] args) {
    int arr[] = {3,6,2,1,8,7,4,5,3,1};
    countingSort(arr);
  }
}
