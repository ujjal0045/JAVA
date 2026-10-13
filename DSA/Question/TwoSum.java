package DSA.Question;

public class TwoSum {
  public static void twoSum(int[] arr, int target) {
        int ans[] = new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i] + arr[i+1] == target){
              System.out.println("true");
            }
        }
    }
  public static void main(String[] args) {
    int arr[] = {-1,-2,-3,-4,-5};
    int key = -8;
    twoSum(arr, key);
  }
}
