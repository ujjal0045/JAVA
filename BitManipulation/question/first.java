package question;

public class first {
  public static int valueOfX(int n){
    int a = n;
    int answer =1;
    while(a>0){
      if((a&1) != 0){
        answer *= n;
      }
      n = n *n;
      a = a>>1;
    }
    return answer;
  }
  public static void main(String[] args) {
    System.out.println(valueOfX(5));
    System.out.println(valueOfX(9));
  }
}
