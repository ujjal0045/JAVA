package String;

public class StringBuilderVariable {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("");
    for(char ch = 'a'; ch<='z';ch++){
      str.append(ch);
    }
    // the time complexity will be O(26);
    // but if we use simple string variable then it take O(n*m);
     
    System.out.println(str);
    System.out.println("Length of the string: " + str.length());
  }
}
