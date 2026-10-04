package Array.TwoDArray.AssinmentQuestion;

public class sumofSecondArr {
  public static void sum(int arr[][]){
    int sum=0;
    int firstIdx =1;
    for(int i=0;i<arr[0].length;i++){
      sum += arr[firstIdx][i];
    }
    System.out.println("Sum of 2nd array all element: " + sum );
  }
  public static void main(String[] args) {
    int arr[][] = {
      {1,4,9},{11,4,3},{2,2,3}
    };
    sum(arr);
  }
}
