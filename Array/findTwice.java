package Array;

import java.util.HashSet;

import Loops.patterns.star1;

public class findTwice {
  // Time Comp = O(n2), space = O(N)
  public static boolean findTwices(int nums[]){
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i] == nums[j]){
          return true;
        }
      }
    }
    return false;
  }
  // Time Comp. = O(N), Space = O(n)
  public static boolean findTwice2(int nums[]){
    // created a hashset array
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<nums.length;i++){
      if(set.contains(nums[i])){
        return true;
      }
      set.add(nums[i]);
    }
    return false;
  }
  public static void main(String[] args) {
    int nums1[] = {1,2,3,1};
    int nums2[] = {1,2,3,4};
    int nums3[] = {1,1,1,3,3,4,3,2,4,2};
    System.out.println(findTwice2(nums1));
    System.out.println(findTwices(nums2));
    System.out.println(findTwices(nums3));
  }
}
