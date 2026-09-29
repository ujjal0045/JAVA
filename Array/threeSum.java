package Array;

import java.util.*;

public class threeSum {
  public List<List<Integer>> threeSum1(int nums[]){

    List<List<Integer>> result = new ArrayList<List<Integer>> ();

    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;i++){
        for(int k = j+1;k<nums.length;k++){
          if(nums[i] + nums[j] + nums[k] == 0){
            List<Integer> triplet = new ArrayList<Integer>();
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);
            Collections.sort(triplet);
            result.add(triplet);
          }
        }
      }
    }
    result = new ArrayList<List<Integer>>( new LinkedHashSet<List<Integer>>(result));
    return result;
  }
  // optimized solution
  public static void sumProblem(int nums[]){
    // sort the array
    Arrays.sort(nums);
    
    for(int i =0;i< nums.length;i++){
      // Skip duplicate fixed values
      if(i > 0 && nums[i] == nums[i - 1]){
        continue;
      }

      int left = i+1, right = nums.length-1;
      while(left < right){
        int sum = nums[i] + nums[left] + nums[right];
        if( sum == 0){
          System.out.println(
                        "[" + nums[i] + ", " + nums[left] + ", " + nums[right] + "]");
          left++;
          right--;
          // Skip duplicate left values
          while (left < right && nums[left] == nums[left - 1]) {
              left++;
          }

          // Skip duplicate right values
          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        } else if(sum < 0){
          left +=1;
        } else{
          right -=1; 
        }
      }
    }
  }


  public static void main(String[] args) {
    int nums[] = {-1,0,1,2,-1,-4};
    sumProblem(nums);
    threeSum obj = new threeSum();

    List<List<Integer>> result = obj.threeSum1(nums);

    System.out.println(result);
  }
}
