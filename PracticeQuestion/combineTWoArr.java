package PracticeQuestion;

public class combineTWoArr {
  public static void main(String[] args) {
    int arr[] = {11,2,3};
    int arr1[] = {4,5,6};
    int c[] = new int[arr.length+arr1.length];
    for(int i=0;i<arr.length;i++){
      c[i] = arr[i];
    }
    for(int i=0;i<arr1.length;i++){
      c[arr.length+i] = arr1[i];
    }
    for(int i=0;i<c.length;i++){
      System.out.print(c[i] + " ");
    }
  }
}
