package Array;

public class TrappingRainwater {
  public static void auxiliaryArr(int arr[]){
    int n = arr.length,sum=0;
    int leftArr[] = new int[n];
    leftArr[0] = arr[0];
    int rightArr[] = new int[n];
    rightArr[n-1] = arr[n-1];
    // maximum of left
    for(int i=1;i<n;i++){
      leftArr[i] = Math.max(leftArr[i-1], arr[i]);
      
    }
    // maximum of right
    for(int i=n-2;i>=0;i--){
      rightArr[i] = Math.max(rightArr[i+1],arr[i]);
      
    }
    // check
    for(int i=0;i<n;i++){
      int waterLevel = Math.min(leftArr[i],rightArr[i]);
      sum += waterLevel - arr[i];
    }
    System.out.println("Total rain is trapped: " + sum);
    
  }
  public static void main(String[] args) {
    int heights[] = {4,2,0,6,3,2,5};
    auxiliaryArr(heights);
  }
}
