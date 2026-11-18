package PracticeQuestion;
import java.util.*;
public class MinMaxAvg {
  public static void main(String[] args) {
    int[][] arr = {{10,20},{30,40}};
    int max = arr[0][0];
    int min = arr[0][0];
    int sum= 0,count =0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(arr[i][j] > max){
          max = arr[i][j];
        }
        if(arr[i][j] < min){
          min = arr[i][j];
        }
        // max = Math.max(arr[i][j],max);
        // min = Math.min(arr[i][j],min);
        sum += arr[i][j];
        count++;
      }
    }
    System.out.println("Max: " +  max);
    System.out.println("min: " + min);
    System.out.println("Average: " + (double)(sum/count));

  }
}
