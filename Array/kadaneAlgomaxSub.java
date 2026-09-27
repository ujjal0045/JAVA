package Array;

public class kadaneAlgomaxSub {
  public static void algo(int arr[]){
    int currSum = 0;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      currSum += arr[i];
      if(currSum< 0){
        currSum = 0;
      }
      max = Math.max(max, currSum);
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    algo(arr);
  }
}
