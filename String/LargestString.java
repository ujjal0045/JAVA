package String;

public class LargestString {
  public static void findLargest(String s[]){
    String largest = s[0];
    for(int i=1;i<s.length;i++){
      if(largest.compareTo(s[i]) < 0){
        largest = s[i];
      }
    }
    System.out.println("largest string is: " + largest);
  }
  public static void main(String[] args) {
    String fruits[] = {"apple","mango","banana"};
    findLargest(fruits);
  }
}
