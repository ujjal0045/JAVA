package Array.TwoDArray.AssinmentQuestion;

public class transpose {
  public static void transposeArray(int arr[][]){
    int trans[][] = new int[arr[0].length][arr.length];
    for(int i=0;i<trans.length;i++){
      for(int j=0;j<trans[0].length;j++){
        trans[i][j] = arr[j][i];
      }
    }
    for(int i=0;i<trans.length;i++){
      for(int j=0;j<trans[0].length;j++){
        System.out.print(trans[i][j]);
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int arr[][] = {
      {1,2,3},{4,5,6}
    };
    transposeArray(arr);
  }
}
