package Array;

public class trapWater2 {
  public static void trappedWater(int heights[]){
    int n = heights.length,sum =0;
    int leftMax[] = new int[n];
    leftMax[0] = heights[0];

    int rightMax[] = new int[n];
    rightMax[n-1] = heights[n-1];

    for(int i=1;i<n;i++){
      leftMax[i] = Math.max(leftMax[i-1], heights[i]);
    }
    for(int i = n-2;i>=0;i--){
      rightMax[i] = Math.max(rightMax[i+1], heights[i]);
    }
    
    for(int i=0;i<n;i++){
      int min = Math.min(leftMax[i], rightMax[i]);
      sum += min - heights[i];
    }
    System.out.println("Maximum rain trap : "+ sum);
  }
  public static void main(String[] args) {
    int heights[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    int heights1[] = {4,2,0,3,2,5};
    trappedWater(heights);
    trappedWater(heights1);
  }
}
