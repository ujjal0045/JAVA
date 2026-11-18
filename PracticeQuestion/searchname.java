package PracticeQuestion;

public class searchname {
  public static void main(String[] args) {
    String[] s = {"rahul","akash","priya","ujjal"};
    String search = "Priya";
    Boolean flag = false;
    for(String name : s){
      if(name.equals(search)){
        flag = true;
      }
    }
    if(flag) System.out.println("Founded");
    else System.out.println("Not found");
  }
}
