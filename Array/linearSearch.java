package Array;

public class linearSearch {
  public static int linearSrh(int n[], int key){
    for(int i=0;i<n.length;i++){
      if(n[i] == key){
        return i;
      }
    }
      return -1;
}

  public static void main(String[] args) {
    int n[] ={2,3,4,5,6,7,8,9};
    int key= 5;
    int idx = linearSrh(n, key);
    if(idx != -1){
      System.out.println("Found at index: " + idx);
    } else{
      System.out.println("not Found");
    }
    }
  }

