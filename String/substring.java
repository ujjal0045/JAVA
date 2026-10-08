package String;

public class substring {
  public static void findSubstring(String s,int st,int end){
    String subStr = "";
    for(int i=st;i<end;i++){
      subStr += s.charAt(i);
    }
    System.out.println(subStr);
  }
  public static void main(String[] args) {
    String s = "helloWorld";
    findSubstring(s, 0, 6);
  }
}
