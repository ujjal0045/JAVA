package Array.TwoDArray;

public class DiagonalSum {
  public static void twoSum(int arr[][]){
    int sum1=0,sum2=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(j==i){
          sum1 += arr[i][j];
        }
        if( i+ j == arr.length -1){
          sum2 += arr[i][j];
        }
      }
    }
    System.out.println("SUm1: " + sum1 + "Sum2: " + sum2);
    sum1=0;sum2=0;
    for(int i=0;i<arr.length;i++){
      // Primary Diagonal
      sum1 += arr[i][i];
      // seconday diagonal
      if(i != arr.length-1-i){
        sum2 += arr[i] [ arr.length -1 -i];
      }
      
    }
    System.out.println("Second way to do....");
    System.out.println("SUm1: " + sum1 + "Sum2: " + sum2);
  }
  public static void main(String[] args) {
    int arr[][] = {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}};
    twoSum(arr);
  }
}
