package Array.TwoDArray;

public class SearchInSorted {
  public static void bruteForce(int arr[][],int key){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j] == key){
          System.out.println("Founded at index" + i + "," + j);
          return;
        }
      }
    }
    System.out.println("Not founded");
  }
  public static void betterApproach(int arr[][],int key){
    for(int i=0;i<arr.length;i++){
      int left = 0,right = arr.length-1;
      while(left < right){
        int mid = (left+right) / 2;
        if( arr[i][mid] == key){
          System.out.println("Founded at index:" + i + " " + mid);
          return ;
        } else if(arr[i][mid] < key){
          left = mid+1;
        } else{
          right = mid-1;
        }
      }
    }
    System.out.println("Not found");
  }
  public static void optimizedApproach(int arr[][],int key){
    // stair case method
    int bottom = 0;
    int left = arr.length-1;
    while (bottom < arr.length && left >= 0) {
      if(arr[bottom][left] == key){
        System.out.println("Founded at index:" + bottom + " " + left);
        return;
      } else if(key < arr[bottom][left] ){
        left--;
      } else if(key > arr[bottom][left]){
        bottom++;
      }
    }
    System.out.println("Not found");
  }
  public static void main(String[] args) {
    int arr[][] = {
      {10,20,30,40},
      {15,25,35,45},
      {27,29,37,48},
      {32,33,39,50}
    };
    //bruteForce(arr, 59);
    // betterApproach(arr, 33);
    optimizedApproach(arr, 33);
  }
}
