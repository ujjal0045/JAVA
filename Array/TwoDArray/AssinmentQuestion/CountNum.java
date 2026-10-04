package Array.TwoDArray.AssinmentQuestion;

public class CountNum {
  public static int count(int arr[][], int n){
    int c=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j] == n){
          c++;
        }
      }
    }
    return c;
  }
  public static void main(String[] args) {
    int arr[][] = {
      {4,7,8},
      {8,8,7}
    };
    System.out.println("Total number of 7s is " + count(arr, 7));
  }
}
