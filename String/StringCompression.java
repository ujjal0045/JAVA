package String;

public class StringCompression {
  public static String ConvertToCompression(String s){
    StringBuilder st = new StringBuilder("");
    for(int i=0;i<s.length();i++){
      Integer c= 1;
      while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
        c++;
        i++;
      }
      st.append(s.charAt(i));
      if(c > 1){
        st.append(c);
      }
    }
    return st.toString();
  }

  public static void main(String[] args) {
    String s = "aaabbccdd";
    System.out.println("String comprassion: " + ConvertToCompression(s));
  }
}
