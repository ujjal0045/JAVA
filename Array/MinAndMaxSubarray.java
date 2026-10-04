package Array;

public class MinAndMaxSubarray {
  // brite force approach TC = O(n3);
  public static void showPair(int arr[]) {

    // here we put the longest high number
    int min = Integer.MAX_VALUE;
    // here we put the longest nagetive number
    int max = Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
      int start = i;
      for(int j=i;j<arr.length;j++){
        int sum = 0;
        int end = j;
        for(int k=start;k<=end;k++){
          sum += arr[k];
        }
        // here we compare the max with sum to find out maxmimum
        max = Math.max(max, sum);
        // here we compare the max with sum to find out minimum
        min = Math.min(min, sum);
       }
      System.out.println();
    }
    System.out.println("Max: " + max);
    System.out.println("Min: "+ min);
  }

  // prefix of sum TC = O(n);





  public static void showPair2(int arr[]){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum =0;

    for(int i=0;i<arr.length;i++){
      sum += arr[i];
      min = Math.min(min, sum);
      max = Math.max(max, sum);
    }
    System.out.println("minimum no: "+ min);
    System.out.println(max);
  }


  public static void main(String[] args) {
    int arr[] ={2,4,6,8,10};
    showPair2(arr);
  }
}
