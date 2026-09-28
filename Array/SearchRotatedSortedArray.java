package Array;


public class SearchRotatedSortedArray {
  // linear solution take TC= O(n)
  public static void linearSearch(int nums[],int key){
    int idx=-1;
    for(int i=0;i<nums.length;i++){
      if(key == nums[i]){
        idx = i;
        break;
      }
    }
    if(idx == -1){
      System.out.println("Not found: -1");
    } else{
      System.out.println("founded at index: " + idx);
    }
  }
  // optimize solution
  public static void modifiedBinarySearch(int nums[],int key){
    int left = 0;
    int right = nums.length-1;
    int idx = -1;
    while(left <= right){
      int mid = (left+right) / 2;
      if(nums[mid] == key){
        idx = mid;
        break;
      }
      // Left half is sorted
        if (nums[left] <= nums[mid]) {

            // Key is inside the left sorted half
            if (nums[left] <= key && key < nums[mid]) {
                right = mid - 1;
            } 
            // Key is in the right half
            else {
                left = mid + 1;
            }

        }

        // Right half is sorted
        else {

            // Key is inside the right sorted half
            if (nums[mid] < key && key <= nums[right]) {
                left = mid + 1;
            } 
            // Key is in the left half
            else {
                right = mid - 1;
            }
        }
      
    }
    if(idx == -1){
      System.out.println("data not found: " + idx);
    } else{
      System.out.println("Data is found at index: "+ idx);
    }
  }
  public static void main(String[] args) {
    int nums[] = {4,5,6,7,0,1,2};
    linearSearch(nums, 3);
    modifiedBinarySearch(nums, 0);
  }
}
