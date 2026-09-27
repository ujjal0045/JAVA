package Array;

public class prefixMaxSubarrayOfSum {
  public static void MaxSub(int arr[]){
    int currSum = 0;
    int max = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    //calculate prefix 
    for(int i=1;i<prefix.length;i++){
      prefix[i] = prefix[i-1] + arr[i];
    }

    for(int i=0;i<arr.length;i++){
    int start = i;

    for(int j=i;j<arr.length;j++){
        int end = j;

        if(start == 0){
            currSum = prefix[end];
        } else{
            currSum = prefix[end] - prefix[start - 1];
        }

        max = Math.max(max, currSum);
    }
}
    System.out.println(max);
  }
  
  public static void main(String[] args) {
    int arr[] = {1,-2,6,-1,3};
    MaxSub(arr);
  }
}
